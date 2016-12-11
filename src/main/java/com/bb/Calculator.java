package com.bb;

/**
 * A representation of a simple calculator that can perform basic operations like addition, subtraction, division,
 * and multiplication.
 * <p>
 *
 * @author Babajide Banjo
 * @since 1.0
 */
public class Calculator {
    public int add(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    public int subtract(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }

    public int divide(int firstOperand, int secondOperand){
        return firstOperand/secondOperand;
    }

    public int multiply(int firstOperand, int secondOperand){
        return firstOperand * secondOperand;
    }
}
