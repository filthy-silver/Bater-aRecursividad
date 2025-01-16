package bateria;

import static helper.Helper.*;

public class Ejercicios {

    /**
     * <b>Ejercicio 1:</b> Crea un método que obtenga la cantidad de dígitos de un número N mayor que cero. Se debe pasar como parámetro el número N.
     */
    public static class Ej1 {

        public static void run() {
            System.out.println("Introduce un número");
            System.out.println(countDigits(getUserInt("Introduce un número")));
        }

        /**
         * Cuenta los dígitos de un número.
         * @param n El número del cual contar los dígitos.
         * @return La cantidad de dígitos del número.
         */
        private static int countDigits(int n) {
            if (n == 0) {
                return 0;
            } else {
                return countDigits(n / 10, 1);
            }
        }

        /**
         * Cuenta los dígitos de un número recursivamente.
         * @param n El número del cual contar los dígitos.
         * @param count El contador de dígitos.
         * @return La cantidad de dígitos del número.
         */
        private static int countDigits(int n, int count) {
            if (n == 0) {
                return 0;
            } else if (n < 10) {
                return count + 1;
            } else {
                return countDigits(n / 10, count + 1);
            }
        }
    }

    /**
     * <b>Ejercicio 2:</b> Crea un método que obtenga el resultado de elevar un número a otro. Ambos números se deben pasar como parámetros. Los números deben ser positivos.
     */
    public static class Ej2 {

        public static void run() {
            System.out.println("Introduce dos números");
            System.out.println(calculatePower(getUserPosInt("Introduce un número"), getUserPosInt("Introduce un segundo número")));
        }

        /**
         * Calcula la potencia de un número.
         * @param n El número base.
         * @param power El exponente.
         * @return El resultado de elevar n a la potencia de power.
         */
        private static int calculatePower(int n, int power) {
            if (power == 0) {
                return 1;
            } else {
                return calculatePower(n, 1, power);
            }
        }

        /**
         * Calcula la potencia de un número recursivamente.
         * @param n El número base.
         * @param count El contador de la recursión.
         * @param power El exponente.
         * @return El resultado de elevar n a la potencia de power.
         */
        private static int calculatePower(int n, int count, int power) {
            if (count == power) {
                return n;
            } else {
                return n * calculatePower(n, count + 1, power);
            }
        }
    }

    /**
     * <b>Ejercicio 3:</b> Crea un método que dado un número positivo, lo imprima invertido por pantalla.
     */
    public static class Ej3 {

        public static void run() {
            System.out.println("¿Quieres invertir una cadena o un número? (c/n)");
            sc.nextLine();
            String choice = sc.nextLine().toLowerCase();

            if (choice.equals("c")) {
                System.out.println("Introduce una cadena:");
                String input = sc.nextLine();
                System.out.println("Cadena invertida: " + reverseString(input) + "\n");
            } else if (choice.equals("n")) {
                System.out.println("Introduce un número:");
                int number = getUserPosInt("Introduce un número positivo:");
                System.out.println("Número invertido: " + reverseNumber(number) + "\n");
            } else {
                System.out.println("Opción no válida.");
            }
        }

        /**
         * Invierte una cadena de texto.
         * @param input La cadena a invertir.
         * @return La cadena invertida.
         */
        private static String reverseString(String input) {
            if (input.isEmpty()) {
                return input;
            }
            return reverseString(input.substring(1)) + input.charAt(0);
        }

        /**
         * Invierte un número.
         * @param number El número a invertir.
         * @return El número invertido.
         */
        private static int reverseNumber(int number) {
            return reverseNumber(number, 0);
        }

        /**
         * Invierte un número recursivamente.
         * @param number El número a invertir.
         * @param reversed El número invertido hasta el momento.
         * @return El número invertido.
         */
        private static int reverseNumber(int number, int reversed) {
            if (number == 0) {
                return reversed;
            }
            return reverseNumber(number / 10, reversed * 10 + number % 10);
        }
    }

    /**
     * <b>Ejercicio 4:</b> Crea un método que compruebe si un número es binario. Un número binario está formado únicamente por ceros y unos.
     */
    public static class Ej4 {

        /**
         * Método principal que solicita un número al usuario y verifica si es binario.
         */
        public static void run() {
            System.out.println("Introduce un número:");
            int number = getUserInt("Introduce un número:");
            if (isBinary(number)) {
                System.out.println("El número es binario.\n");
            } else {
                System.out.println("El número no es binario.\n");
            }
        }

        /**
         * Verifica si un número es binario.
         * @param number El número a verificar.
         * @return true si el número es binario, false en caso contrario.
         */
        private static boolean isBinary(int number) {
            if (number == 0) {
                return true;
            }
            int digit = number % 10;
            if (digit != 0 && digit != 1) {
                return false;
            }
            return isBinary(number / 10);
        }
    }

    /**
     * <b>Ejercicio 5:</b> Crea un método que obtenga el número binario de un número N pasado como parámetro.
     */
    public static class Ej5 {

        /**
         * Método principal que solicita un número al usuario y muestra su representación binaria.
         */
        public static void run() {
            System.out.println("Introduce un número:");
            int number = getUserInt("Introduce un número:");
            System.out.println("El número binario es: " + toBinary(number) + "\n");
        }

        /**
         * Convierte un número a su representación binaria.
         * @param number El número a convertir.
         * @return La representación binaria del número.
         */
        private static String toBinary(int number) {
            if (number == 0) {
                return "0";
            }
            if (number == 1) {
                return "1";
            }
            return toBinary(number / 2) + (number % 2);
        }
    }

    /**
     * <b>Ejercicio 6:</b> Crea un método que compruebe si una palabra está ordenada alfabéticamente.
     */
    public static class Ej6 {

        /**
         * Método principal que solicita una palabra al usuario y verifica si sus caracteres están ordenados alfabéticamente.
         */
        public static void run() {
            System.out.println("Introduce una palabra:");
            sc.nextLine();
            String word = sc.nextLine();
            if (isCharOrdered(word)) {
                System.out.println("La palabra está ordenada alfabéticamente.\n");
            } else {
                System.out.println("La palabra no está ordenada alfabéticamente.\n");
            }
        }

        /**
         * Verifica si los caracteres de una palabra están ordenados alfabéticamente.
         * @param word La palabra a verificar.
         * @return true si los caracteres están ordenados alfabéticamente, false en caso contrario.
         */
        private static boolean isCharOrdered(String word) {
            if (word.length() <= 1) {
                return true;
            }
            if (word.charAt(0) > word.charAt(1)) {
                return false;
            }
            return isCharOrdered(word.substring(1));
        }
    }

    /**
     * <b>Ejercicio 7:</b> Crea un método que obtenga la suma de los números naturales desde 1 hasta N. Se debe pasar como parámetro el número N, siempre mayor que cero. Se debe imprimir toda la cadena por consola.
     */
    public static class Ej7 {

        /**
         * Método principal que solicita un número al usuario y muestra la suma de los números naturales hasta ese número.
         */
        public static void run() {
            System.out.println("Introduce un número mayor que cero:");
            int number = getUserPosInt("Introduce un número mayor que cero:");
            System.out.println("La suma de los números desde 1 hasta " + number + " es: " + sumNaturalNumbers(number) + "\n");
        }

        /**
         * Suma los números naturales hasta un número dado.
         * @param n El número hasta el cual sumar.
         * @return La suma de los números naturales hasta n.
         */
        private static int sumNaturalNumbers(int n) {
            if (n == 1) {
                return 1;
            }
            return n + sumNaturalNumbers(n - 1);
        }
    }
}