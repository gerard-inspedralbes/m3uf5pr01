import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        do{
            try {
                System.out.println("Introdueix la operador [ + - * /]:");
                String operacio = scan.nextLine();
                System.out.println("Introdueix operand1");
                String operand1 = scan.nextLine();
                System.out.println("Introdueix operand2");
                String operand2 = scan.nextLine();
                Calculadora.calcula(operacio, operand1, operand2);
                if (!Calculadora.isSwitchOff()) {
                    System.out.println(String.format("El resultat de la operació es: %s", Calculadora.getResult()));
                }

            }catch (OperatorIncorrecteException | NumberFormatException | ArithmeticException e) {
                System.out.println("ERROR: "+ e.getMessage());
            }
        }while (!Calculadora.isSwitchOff());


    }
}
