package com.dyson.calculator.models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CalculationModel {

    @NotNull(message = "Number 1 needs a value")
    @Min(value = Integer.MIN_VALUE, message = "Number 1 value out of range")
    @Max(value = Integer.MAX_VALUE, message = "Number 1 value out of range")
    private @Getter @Setter Integer number1;

    @NotNull(message = "Number 2 needs a value")
    @Min(value = Integer.MIN_VALUE, message = "Number 2 value out of range")
    @Max(value = Integer.MAX_VALUE, message = "Number 2 value out of range")
    private @Getter @Setter Integer number2;

    private @Getter @Setter CalculationType calculationType;
}
