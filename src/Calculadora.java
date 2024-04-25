public class Calculadora {
    private static int result;
    private static boolean switchOff;

    public static boolean isSwitchOff() {
        return switchOff;
    }

    public static int getResult() {
        return result;
    }



    public static void calcula(String operador, String operand1, String operand2) throws NumberFormatException, OperatorIncorrecteException {
        switchOff = false;
        switch (operador) {
            case "/":
                result = Integer.parseInt(operand1) / Integer.parseInt(operand2);
                break;
            case "*":
                result = Integer.parseInt(operand1) * Integer.parseInt(operand2);
                break;
            case "+":
                result = Integer.parseInt(operand1) + Integer.parseInt(operand2);
                break;
            case "-":
                result = Integer.parseInt(operand1) - Integer.parseInt(operand2);
                break;
            case "Z":
                switchOff = true;
                break;
            default:
                throw new OperatorIncorrecteException(String.format("[%s] no es un operador vàlid", operador));

        }
    }
}
