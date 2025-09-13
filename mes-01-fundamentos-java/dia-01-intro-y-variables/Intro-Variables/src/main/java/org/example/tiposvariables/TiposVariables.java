package org.example.tiposvariables;

public class TiposVariables {

    public static void main(String[] args) {
        int sueldo = 10_000_000;

        /// Variables primitivas
        int edad = 25;
        double altura = 1.65;
        boolean estudiante = true;
        char inicial = 'M';

        //Variable tipo objeto
        String nombre = "Marco";

        //Variable mutable
        String clima = "Verano";


        //Variable Constante
        final String PAIS = "Peru";


        //Mostrar resultado
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: "+ altura);
        System.out.println("¿Es estudiante? " + estudiante);
        System.out.println("Inicial: " + inicial);

        //Operaciones
        int suma = 10 + 5;
        int resta = 10 - 5;
        System.out.println("La suma de 10 + 5 es: " + suma);
        System.out.println("La resta de 10 - 5 es: " + resta);
    }
}
