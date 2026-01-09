import java.util.Scanner;

public class ConversorUnidades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Eliminé estas variables porque no se utilizaban en ninguna parte del programa
        // y no afectaban al funcionamiento del conversor.
        // int c = 0;
        // boolean f = true;

        System.out.println("Conversor de Unidades - Version 2.1");
        System.out.println("[1] Longitud");
        System.out.println("[2] Peso");
        System.out.println("[3] Temperatura");
        System.out.print("Tipo de conversion: ");

        int t = sc.nextInt();

        // Quité el contador c++ porque no tenía ningún uso real dentro del programa.
        // c++;

        if (t == 1) {

            System.out.println("Conversion de longitud:");
            System.out.println("[1] Metros a Kilometros");
            System.out.println("[2] Kilometros a Metros");
            System.out.println("[3] Metros a Millas");
            System.out.println("[4] Millas a Metros");
            System.out.println("[5] Centimetros a Pulgadas");
            System.out.println("[6] Pulgadas a Centimetros");
            System.out.print("Opcion: ");

            int o = sc.nextInt();

            System.out.print("Valor: ");
            double v = sc.nextDouble();

            // Mantengo la estructura if-else porque es clara y fácil de entender
            // para seleccionar el tipo de conversión.
            if (o == 1) {
                System.out.println(v + " m = " + (v / 1000) + " km");
            } else if (o == 2) {
                System.out.println(v + " km = " + (v * 1000) + " m");
            } else if (o == 3) {
                System.out.println(v + " m = " + (v * 0.000621371) + " mi");
            } else if (o == 4) {
                System.out.println(v + " mi = " + (v * 1609.34) + " m");
            } else if (o == 5) {
                System.out.println(v + " cm = " + (v * 0.393701) + " in");
            } else if (o == 6) {
                System.out.println(v + " in = " + (v * 2.54) + " cm");
            } else {
                // Muestro un mensaje claro cuando la opción introducida no es válida.
                System.out.println("Opcion no valida");
            }

        } else if (t == 2) {

            System.out.println("Conversion de peso:");
            System.out.println("[1] Kilogramos a Gramos");
            System.out.println("[2] Gramos a Kilogramos");
            System.out.println("[3] Kilogramos a Libras");
            System.out.println("[4] Libras a Kilogramos");
            System.out.println("[5] Gramos a Onzas");
            System.out.println("[6] Onzas a Gramos");
            System.out.print("Opcion: ");

            int o = sc.nextInt();

            System.out.print("Valor: ");
            double v = sc.nextDouble();

            if (o == 1) {
                System.out.println(v + " kg = " + (v * 1000) + " g");
            } else if (o == 2) {
                System.out.println(v + " g = " + (v / 1000) + " kg");
            } else if (o == 3) {
                System.out.println(v + " kg = " + (v * 2.20462) + " lb");
            } else if (o == 4) {
                System.out.println(v + " lb = " + (v * 0.453592) + " kg");
            } else if (o == 5) {
                System.out.println(v + " g = " + (v * 0.035274) + " oz");
            } else if (o == 6) {
                System.out.println(v + " oz = " + (v * 28.3495) + " g");
            } else {
                System.out.println("Opcion no valida");
            }

        } else if (t == 3) {

            System.out.println("Conversion de temperatura:");
            System.out.println("[1] Celsius a Fahrenheit");
            System.out.println("[2] Fahrenheit a Celsius");
            System.out.println("[3] Celsius a Kelvin");
            System.out.println("[4] Kelvin a Celsius");
            System.out.print("Opcion: ");

            int o = sc.nextInt();

            System.out.print("Valor: ");
            double v = sc.nextDouble();

            // Corregí las fórmulas para usar valores decimales (double) y evitar
            // errores por división entera en los cálculos de temperatura.
            if (o == 1) {
                System.out.println(v + " C = " + ((v * 9.0 / 5.0) + 32) + " F");
            } else if (o == 2) {
                System.out.println(v + " F = " + ((v - 32) * 5.0 / 9.0) + " C");
            } else if (o == 3) {
                System.out.println(v + " C = " + (v + 273.15) + " K");
            } else if (o == 4) {
                System.out.println(v + " K = " + (v - 273.15) + " C");
            } else {
                System.out.println("Opcion no valida");
            }

        } else {
            // Muestro este mensaje cuando el usuario introduce un tipo de conversión incorrecto.
            System.out.println("Tipo no valido");
        }

        // Cierro el Scanner para liberar recursos, ya que no se volverá a utilizar.
        sc.close();
    }
}