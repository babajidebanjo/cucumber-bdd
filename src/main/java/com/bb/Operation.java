package com.bb;

/**
 * A functional interface that performs an operation on two operands.
 *
 * @author Babajide Banjo
 * @since 1.0
 */
@FunctionalInterface
public interface Operation {
    Integer execute(Integer firstOperand, Integer secondOperand);
}
