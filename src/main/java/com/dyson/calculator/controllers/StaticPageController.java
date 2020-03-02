package com.dyson.calculator.controllers;

import com.dyson.calculator.models.CalculationModel;
import com.dyson.calculator.services.Calculate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class StaticPageController {

    @Autowired
    Calculate calculate;

    /**
     * The default request mapping
     * GET /
     * @param model The view model
     * @return The default page
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex(Model model) {

        model.addAttribute("title", "Calculator" );

        model.addAttribute(new CalculationModel());

        return "main/index";

    }

    /**
     * The default POST request mapping
     * POST /
     * @param calculationModel The calculation model
     * @param model The view model
     * @return The default page
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postIndex(@ModelAttribute @Valid CalculationModel calculationModel, Errors errors, Model model) {

        if(errors.hasErrors()) {
            model.addAttribute(calculationModel);
            model.addAttribute("title", "Calculator" );

            return "main/index";
        }

        model.addAttribute("title", "Calculator" );

        Integer answer = 0,
                number1 = calculationModel.getNumber1(),
                number2 = calculationModel.getNumber2();

        switch(calculationModel.getCalculationType()) {
            case Addition:
                answer = calculate.Add(number1, number2);
                break;

            case Subtraction:
                answer = calculate.Subtract(number1, number2);
                break;

            case Division:
                answer = calculate.Divide(number1, number2);
                break;

            case Multiplication:
                answer = calculate.Multiply(number1, number2);
                break;

            case Power:
                answer = calculate.Power(number1, number2);
                break;
        }

        model.addAttribute("answer", answer);

        return "main/answer";

    }
}
