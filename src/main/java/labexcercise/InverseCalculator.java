package labexcercise;

public enum InverseCalculator {
    ADD,
    SUB,
    MUL,
    DIV;

    private InverseCalculator() {

    }

    public double calculate(double num1, double num2) {
        switch (this) {
            case ADD:
                return (num1 - num2);
            case SUB:
                return (num1 + num2);
            case MUL:
                return (num1 / num2);
            case DIV:
                return (num1 * num2);
            default:
                throw new AssertionError("Unknown operation " + this);
        }
    }

}
