public class DocComments {

    //Para documentar un método se toman en cuenta, el nombre de la función, los parámetros con su tipo de dato, lo que devuelve con su tipo de dato y lo que hace la función. Mira estos ejemplos y resuelve el ejercicio final. 
    
    //Si escribes primero la función y luego sobre ella escribes /** */ te saldrá automáticamente la plantilla de documentación.
    
    public static void main(String[] args) {
        greeting();
        greetingCoder("Cris", 165, 58);
        double bmi = calculateBodyMassIndex(1.65, 58);
        System.out.println(bmi);

        //Ejecuta el nuevo método
        classificationBmi(bmi);
    }

    /**
     * Function name: greeting
     * 
     * Inside the function:
     * 1. prints "Hola Coder"
     * 
     */
    public static void greeting(){
        System.out.println("Hola Coder");
    }

    /**
     * Function name: greetingCoder
     * 
     * @param name (String)
     * @param height (double)
     * @param weight (double)
     * 
     * Inside the function:
     * 1. print the name the height and the weight as part of a text
     */

    public static void greetingCoder(String name, double height, double weight){
        System.out.println("Hola mi nombre es " + name + " mido " + height + " cm y peso " + weight + " kg" );
    }

    /**
     * Function name: calculateBodyMassIndex
     * 
     * @param height (double)
     * @param weight (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. calculates the weight in kilograms by the squared height in meters and return it.
     */

    public static double calculateBodyMassIndex(double height, double weight){
        double bmi = weight / Math.pow(height, 2);
        return bmi;
    }

    //Escribe una función que con el índice de masa corporal devuelva un String con los resultados y documéntala:

    /**
     * Function name: classificationBmi
     *
     * @param bmi (double)
     *
     * Inside the function:
     * 1. classify your body mass index according to its value.
     */
    static void classificationBmi(double bmi){
        //I use void because the method doesn't return a value
        if (bmi < 16){
            System.out.println("Mi índice de masa corporal corresponde a Delgadez severa");
        } else if (bmi >= 16 && bmi < 17) {
            System.out.println("Mi índice de masa corporal corresponde a Delgadez moderada");
        } else if (bmi >= 17 && bmi < 18.5) {
            System.out.println("Mi índice de masa corporal corresponde a Delgadez leve");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Mi índice de masa corporal corresponde a Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Mi índice de masa corporal corresponde a Sobrepeso");
        } else if (bmi >= 30 && bmi < 35) {
            System.out.println("Mi índice de masa corporal corresponde a Obeso Clase I");
        } else if (bmi >= 35 && bmi < 40) {
            System.out.println("Mi índice de masa corporal corresponde a Obeso Clase II");
        } else if (bmi > 40) {
            System.out.println("Mi índice de masa corporal corresponde a Obeso Clase III");
        } else {
            System.out.println("El valor de bmi no es válido");
        }
    }
    /* Clasificación índice de masa corporal rango - kg/m2
    Delgadez severa	< 16
    Delgadez moderada	16 - 17
    Delgadez leve	17 - 18.5
    Normal	18.5 - 25
    Sobrepeso	25 - 30
    Obeso Clase I	30 - 35
    Obeso Clase II	35 - 40
    Obeso Clase III	> 40 */




}
