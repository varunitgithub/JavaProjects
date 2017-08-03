package labexcercise;

import java.lang.Math;


public enum Calculator {
    ADD,
    SUB,
    MUL,
    DIV,
    MOD,
    INC,
    DEC,
    POW;

    private Calculator() {

    }

    public double calculate(double num1, double num2) {
        switch (this) {
            case ADD:
                return (num1 + num2);
            case SUB:
                return (num1 - num2);
            case MUL:
                return (num1 * num2);
            case DIV:
                return (num1 / num2);
            case MOD:
                return (num1 % num2);
            case INC:
                return ++num1;
            case DEC:
                return --num1;
            case POW:
                return Math.pow(num1, num2);
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }

}
