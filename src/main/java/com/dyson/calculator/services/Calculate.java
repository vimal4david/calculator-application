package com.dyson.calculator.services;

import org.springframework.stereotype.Service;

/**
 * Defines calculations between numbers
 */
@Service
public interface Calculate {

    /**
     * Adds two numbers
     * @param number1 The first number
     * @param number2 The second number
     * @return The result of the addition of the two numbers
     */
    Integer Add(Integer number1, Integer number2);

    /**
     * Subtracts one number from another
     * @param number1 The subject of the subtraction
     * @param number2 The number to be subtracted
     * @return The result of the subtraction of one number from another
     */
    Integer Subtract(Integer number1, Integer number2);

    /**
     * Multiplies one number with another
     * @param number1 The first number
     * @param number2 The second number
     * @return The result of the multiplication of one number with another
     */
    Integer Multiply(Integer number1, Integer number2);

    /**
     * Divides one number by another
     * @param dividend The dividend
     * @param divisor The divisor
     * @return The result of the division
     */
    Integer Divide(Integer dividend, Integer divisor);

    /**
     * Calculates the base to the n-th power where n is the exponent
     * @param base The base
     * @param exponent The exponent
     * @return base to the power of the exponent
     */
    Integer Power(Integer base, Integer exponent);
}
