package com.bb;

import java.util.HashMap;
import java.util.Map;

/**
 * A strategy defining how the results are being calculated.
 *
 * @author Babajide Banjo
 * @since 1.0
 */
public class OperationStrategy {
    Map<String, Operation> operations = new HashMap<>();

    public OperationStrategy() {
        initialize();
    }

    private void initialize() {
        operations.put("subtract", (Integer firstOperand, Integer secondOperand) -> {
            return firstOperand - secondOperand;
        });
        operations.put("multiply", (Integer firstOperand, Integer secondOperand) -> {
            return firstOperand * secondOperand;
        });
        operations.put("divide", (Integer firstOperand, Integer secondOperand) -> {
            return firstOperand / secondOperand;
        });
    }

    Operation getOperation(String operation) {
        return operations.getOrDefault(operation, (Integer firstOperand, Integer secondOperand) -> {
            return firstOperand + secondOperand;
        });
    }
}
