package org.academiadecodigo.calculator;

/**
 * Created by codecadet on 08/10/16.
 */
public class Brain {

    public int getResult(Operation operation, int number1, int number2){
        int result = 0;
        switch (operation) {
            case SUM:
                result = number1 + number2;
                break;
            case SUBTRACT:
                result = number1 - number2;
                break;
            case MULTIPLY:
                result = number1 * number2;
                break;
            case DIVIDE:
                if (number2 == 0) {
                    System.out.println("Please, insert a different number than 0");
                } else {
                    result = number1 / number2;
                }
                break;
        }
        return result;
    }
}


