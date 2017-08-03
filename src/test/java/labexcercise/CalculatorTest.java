package labexcercise;

import labexcercise.Calculator;

public class CalculatorTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        if (args.length < 3 || args.length % 3 != 0) {
            System.out.println("Usage CalculatorTest <value1> <'+'/'-'/'*'/'/'/'%'/'^'> <value2>");
            return;
        }

        for (int i = 0; i < args.length; i += 3) {
            double value1 = Double.parseDouble(args[i]);
            String operation = args[i + 1];
            double value2 = Double.parseDouble(args[i + 2]);
            System.out.print("The Output of Operation (" + args[i] + " " + args[i + 1] + " " + args[i + 2] + ") :");
            switch (operation) {
                case "+":
                    System.out.println(Calculator.ADD.calculate(value1, value2));
                    break;
                case "-":
                    System.out.println(Calculator.SUB.calculate(value1, value2));
                    break;
                case "*":
                    System.out.println(Calculator.MUL.calculate(value1, value2));
                    break;
                case "/":
                    System.out.println(Calculator.DIV.calculate(value1, value2));
                    break;
                case "%":
                    System.out.println(Calculator.MOD.calculate(value1, value2));
                    break;
                case "^":
                    System.out.println(Calculator.POW.calculate(value1, value2));
                    break;
                default:
                    System.out.println("UnSupported Operation");
            }
        }

    }

}
