package com.dyson.calculator.models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CalculationModel {

    @NotNull(message = "Number 1 needs a value")
    private @Getter @Setter Integer number1;

    @NotNull(message = "Number 2 needs a value")
    private @Getter @Setter Integer number2;

    private @Getter @Setter CalculationType calculationType;

}
