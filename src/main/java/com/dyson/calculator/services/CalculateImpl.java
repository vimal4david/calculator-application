package com.dyson.calculator.services;

import org.springframework.stereotype.Service;

/**
 * Implements calculations between numbers
 */
@Service
public class CalculateImpl implements Calculate {
    /**
     * Adds two numbers
     *
     * @param number1 The first number
     * @param number2 The second number
     * @return The result of the addition of the two numbers
     */
    @Override
    public Integer add(Integer number1, Integer number2) {
        return number1 + number2;
    }

    /**
     * Subtracts one number from another
     *
     * @param number1 The subject of the subtraction
     * @param number2 The number to be subtracted
     * @return The result of the subtraction of one number from another
     */
    @Override
    public Integer subtract(Integer number1, Integer number2) { return number1 - number2; }

    /**
     * Multiplies one number with another
     *
     * @param number1 The first number
     * @param number2 The second number
     * @return The result of the multiplication of one number with another
     */
    @Override
    public Integer multiply(Integer number1, Integer number2) {
        return number1 * number2;
    }

    /**
     * Divides one number by another
     *
     * @param dividend The dividend
     * @param divisor  The divisor
     * @return The result of the division
     */
    @Override
    public Integer divide(Integer dividend, Integer divisor) {
        return dividend == 0 || divisor == 0 ? 0 : dividend / divisor;
    }

    /**
     * Calculates the base to the n-th power where n is the exponent
     *
     * @param base The base
     * @param exponent The exponent
     * @return base to the power of the exponent
     */
    @Override
    public Integer power(Integer base, Integer exponent) {
        //TO DO validation to check the range and throw exception
        return (int) Math.pow(base, exponent);
    }
}
