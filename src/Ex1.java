/*
1. Programar una classe que divideixi dos números sencers demanats a l'usuari per teclat
i mostri per pantalla el resultat (aritmètica sencera). Capturar un possible
error de conversió de cadena a número (excepció NumberFormatException),
en aquest cas cal convidar a l'usuari a introduir de nou el número.
Capturar també la possible divisió entre zero (excepció ArithmeticException)
informant a l'usuari de l'error. Cal llegir les dades de teclat tal com s’indica
a continuació per a generar l'excepció NumberFormatException:
            num = Integer.parseInt(input.next());
 */

import java.util.Scanner;

public class Ex1 {
    /**
     * @author ausias
     */
    public class E1 {
        static Scanner s = new Scanner(System.in);

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            boolean correcte = false;
            while (!correcte) {
                correcte = demanarNumerosPerDividir();
            }
        }

        static boolean demanarNumerosPerDividir() {
            int num1 = 0;
            int num2 = 0;
            boolean correcte = false;
            try {
                System.out.print("Num1: ");
                num1 = Integer.parseInt(s.next());
                System.out.print("Num2: ");
                num2 = Integer.parseInt(s.next());
                correcte = true;
                calcularDivisio(num1, num2);
            } catch (NumberFormatException e) {
                System.out.println("Els nombres introduïts no son correctes");
            }

            return correcte;
        }

        private static void calcularDivisio(int num1, int num2) {
            int result = 0;
            try {
                result = num1 / num2;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Divisió entre zero!!!");
            }
        }

    }
}
