import java.util.Scanner;

public class BuiltInFunctions {
    public static void main(String[] args) {

        //Ejecuta aquí todos los métodos creados e imprime en la terminal.
        String message = "SUPERCALIFRAGILÍSTICOESPIALIDOSO";
        printMessage(message);
        System.out.println("Mi palabra tiene " + getLength(message) + " caracteres");;
        covertToLowercase(message);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comprueba si la frase contiene algún prefijo, prueba por ejemplo super. Introduce tu prefijo:");
        String prefix = scanner.nextLine();
        if(findPrefix(message, prefix)){
            System.out.println("la palabra " + message + " empieza por el prefijo " + prefix);
        }else {
            System.out.println("la palabra " + message + " no empieza por el prefijo " + prefix);
        };
        System.out.println("Vamos a cambiar una letra por otra. Escoge la letra que quieres cambiar:");
        char oldChar = scanner.next().charAt(0);
        System.out.println("Escoge la letra por la que la quieres cambiar:");
        char newChar = scanner.next().charAt(0);
        System.out.println(replaceCharacters(message, oldChar, newChar));
        System.out.println("Elige un número y calcularé su raíz cuadrada:");
        double number = scanner.nextDouble();
        System.out.println("la raíz cuadrada de " + number + " es " + getsSquareRoot(number));
        System.out.println("Vamos a calcular el resultado de elevar un número a otro. Dame la base:");
        double base = scanner.nextDouble();
        System.out.println("dame el exponente:");
        double exponent = scanner.nextDouble();
        System.out.println("Elevar el número " + base + "por el número " + exponent + " nos da " + getPower(base, exponent));
        System.out.println("Voy a darte un número random entre 0 y 1, con el 0 incluído: " + getRandomNumber());
        System.out.println("Ahora necesito dos números y te diré cuál es el mayor. Dame el primer número:");
        int number1 = scanner.nextInt();
        System.out.println("Dame el segundo número:");
        int number2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("El mayor de los dos números que me has dado es: " + maxNumber(number1,number2));
        String message1 = "Ejercicios con métodos en Java, venga vale puede que me guste Java 😁.Increíble.";
        System.out.println("Ahora vamos a probar si alguna palabra de una frase empieza por algún prefijo, por ejemplo in");
        System.out.println("mi frase es: " + message1);
        System.out.println("Introduce tu prefijo:");
        String prefix1 = scanner.nextLine();
        findPrefix1(message1, prefix1);

        scanner.close();
    }

    /**
         * Function name: printMessage
         * 
         * @param message (String)
         * 
         * Inside the function:
         * 1. Find a java built-in function that prints the message on the console.
         */

        // Escribe tu código aquí
        static void printMessage(String message){
            System.out.println(message);
        }

        /**
         * Function name: getLength
         * 
         * @param message (String)
         * @return (int)
         * 
         * Inside the function:
         * 1. Find a built-in function that returns the length of a string.
         */

        // Escribe tu código aquí
        static int getLength(String message){

             return message.length() ;
        }

        /**
         * Function name: convertToLowercase
         * 
         * @param message (String)
         * @return (String)
         * 
         * Inside the function:
         * 1. Find a built-in function that converts a string to lowercase.
         */

        // Escribe tu código aquí
        static void covertToLowercase(String message){
            System.out.println("Mi palabra en minúscula:");
            System.out.println(message.toLowerCase());
        }

        /**
         * Function name: findPrefix
         * 
         * @param message (String)
         * @param prefix (String)
         * @return (boolean)
         * 
         * Inside the function:
         * 1. Find a built-in function that checks if a string starts with a specified prefix.
         */

        // Escribe tu código aquí
        static boolean findPrefix(String message, String prefix){
            return message.toLowerCase().startsWith(prefix.toLowerCase());
        }

        /**
         * Function name: replaceCharacters
         * 
         * @param message (String)
         * @param oldChar (char)
         * @param newChar (char)
         * @return (String)
         * 
         * Inside the function:
         * 1. Find a built-in function that replaces all occurrences of a specified character in a string with another character.
         */

        // Escribe tu código aquí
        static String replaceCharacters(String message, char oldChar, char newChar){
           return message.toLowerCase().replace(oldChar, newChar);
        }

        /**
         * Function name: getsSquareRoot
         * 
         * @param number (double)
         * @return (double)
         * 
         * Inside the function:
         * 1. Find a built-in function that calculates the square root of a number.
         */

        // Escribe tu código aquí
        static double getsSquareRoot(double number){
            return Math.sqrt(number);
        }

        /**
         * Function name: getPower
         * 
         * @param base (double)
         * @param exponent (double)
         * @return (double)
         * 
         * Inside the function:
         * 1. Find a built-in function that calculates the power of a number.
         */

        // Escribe tu código aquí
        static double getPower(double base, double exponent){
            return Math.pow(base,exponent);
        }

        /**
         * Function name: getRandomNumber
         *
         * @return (double)
         * 
         * Inside the function:
         * 1. Find a built-in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
         */

        // Escribe tu código aquí
        public static double getRandomNumber(){
            return Math.random();
        }

        /**
         * Function name: maxNumber
         * 
         * @param number1 (int)
         * @param number2 (int)
         * @return (int)
         * 
         * Inside the function:
         * 1. Find a built-in function that returns the larger of two numbers.
         */

        // Escribe tu código aquí
        public static int maxNumber(int number1, int number2){
            return Math.max(number1, number2);
        }

    /**
     * Function name: findPrefix1
     *
     * @param message1 (String)
     * @param prefix1 (String)
     *
     * Inside the function:
     * 1. checks if a string of the sentence starts with a specified prefix.
     */

        public static void findPrefix1(String message1, String prefix1){

            String regex = "[.,(\\s+)]";//this regular expressions find the characters , . and whitespaces

            String[] myArray = message1.toLowerCase().split(regex);

            for(String word : myArray){
                //System.out.println(word);
                if (word.startsWith(prefix1)){
                    System.out.println("La palabra " + word + " empieza con tu prefijo " + prefix1);
                }

            }
            System.out.println("No hay más palabras con tu prefijo");

        }
    }