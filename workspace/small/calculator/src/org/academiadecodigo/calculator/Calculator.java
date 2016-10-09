package org.academiadecodigo.calculator;

/**
 * Created by codecadet on 08/10/16.
 */
public class Calculator {
    private Brain brain;
    private Display display;

    public Calculator (String brand, String color) {
        brain = new Brain();
        display = new Display();

    }

    public void executeOperation(Operation operation, int number1, int number2){

        int result = brain.getResult(operation, number1, number2);

        display.showResult(result);

    }
}
