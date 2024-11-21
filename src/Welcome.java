//Inicializa la clase Welcome
//Crea el método main

import java.util.Scanner;

public class Welcome{
    static void greeting(){
        System.out.println("¡Hola, Coders!");
    }
    static void greetingCoder(String name){

        System.out.println("¡Hola, " + name + "!");

    }
    public static void main(String[] args) {
        greeting();
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        String name = scanner.nextLine();
        greetingCoder(name);
    }
}
//Tarea 1
//Define el método greeting que imprima en terminal ¡Hola Coders!
//Ejecuta el método greeting 

//Tarea 2
//Define el método greetingCoder que reciba un nombre y que imprima en terminal ¡Hola <name>!
//Ejecuta el método greetingCoder 

//¿Sabes donde definir el método y en dónde lo has de ejecutar? Si no lo sabes vuelve al archivo de Resources.md
