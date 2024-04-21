package ejercicios;

public class PracticaVariable {

    public static void main(String[] arg) {

        // Declaracion e inicializacion de variables
        String nombre = "Carlos";
        String apellido = "Mendoza";
        int edad = 33;
        String direccion = "CR 2 #18 - 11";
        String pago = "1330000";
        String pagoCarnet = "257800";
        long telefono = 6043147;
        String curso = "Asistente de Desarrollo";
        boolean activo = true;
        double totalPago = 0;

        // Mostrando los datos
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + telefono);
        System.out.println("Digite su direccion: " +direccion);
        System.out.println("Digite su curso: " + curso);
        System.out.println("¿Esta activo? " + activo);
        

        totalPago = Double.parseDouble(pago) + Double.parseDouble(pagoCarnet);
        System.out.println("Pago total: $" + totalPago);
    }
}
