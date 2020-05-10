/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.ups.edu.modelo.Division;
import ec.ups.edu.modelo.Multiplicacion;
import ec.ups.edu.modelo.Operaciones;
import ec.ups.edu.modelo.Resta;
import ec.ups.edu.modelo.Suma;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Operaciones operacion = new Operaciones();
        int opcion = 0;

        System.out.println("--------------------------------------------------");
        System.out.println("             Calculadora Basica");
        System.out.println("--------------------------------------------------\n");
        System.out.println("Porfavor ingrese dos numeros:");

        System.out.print("\nPrimer Numero  ->");
        operacion.setNum1(leer.nextDouble());

        System.out.print("Segundo Numero  ->");
        operacion.setNum2(leer.nextDouble());

        while (opcion != 6) {

            System.out.println("\n1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Ingresar otros numeros");
            System.out.println("6.- Salir");

            System.out.print("Seleccione una opcion  ->");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    operacion = new Suma();
                    operacion.operacion();
                    break;

                case 2:
                    operacion = new Resta();
                    operacion.operacion();
                    break;

                case 3:
                    operacion = new Multiplicacion();
                    operacion.operacion();
                    break;

                case 4:
                    operacion = new Division();
                    operacion.operacion();
                    break;

                case 5:
                    System.out.println("Porfavor ingrese dos numeros:");

                    System.out.print("\nPrimer Numero  ->");
                    operacion.setNum1(leer.nextDouble());

                    System.out.print("Segundo Numero  ->");
                    operacion.setNum2(leer.nextDouble());
                    break;

                case 6:
                    System.out.println("El programa a finalizado");
                    break;

                default:
                    System.out.println("La opcion que eligio no existe");

            }
        }
    }
}
