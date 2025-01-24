import java.util.Scanner;
public class Vacaciones {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String nombre = "";
        int antiguedad = 0;
        int clave = 0;
        System.out.println("*******************************************************");
        System.out.println("*Bienvenido al sistema vacacional de Coca-Cola Company*");
        System.out.println("*******************************************************");
        System.out.println("");
        System.out.println("");
        System.out.println("Por favor, ingrese el nombre del trabajador: ");
        nombre = scan.nextLine();
        System.out.println("Por favor, ingrese los años de servicio del trabajador: ");
        antiguedad = scan.nextInt();
        System.out.println("Cual es la clave del departamento del trabajador?");
        clave = scan.nextInt();
        scan.close();

        if(clave == 1){
            if(antiguedad == 1){
                System.out.println("El trabajador " + nombre + " tiene derecho a 6 dias de vacaciones");
            }else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println("El trabajador " + nombre + " tiene derecho a 14 dias de vacaciones");
            }else if(antiguedad >= 7){
                System.out.println("El trabajador " + nombre + " tiene derecho a 20 dias de vacaciones");
            }
        }else if(clave == 2){
            if(antiguedad == 1){
                System.out.println("El trabajador " + nombre + " tiene derecho a 7 dias de vacaciones");
            }else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println("El trabajador " + nombre + " tiene derecho a 15 dias de vacaciones");
            }else if(antiguedad >= 7){
                System.out.println("El trabajador " + nombre + " tiene derecho a 22 dias de vacaciones");
            }
        }else if(clave == 3){
            if(antiguedad == 1){
                System.out.println("El trabajador " + nombre + " tiene derecho a 10 dias de vacaciones");
            }else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println("El trabajador " + nombre + " tiene derecho a 20 dias de vacaciones");
            }else if(antiguedad >= 7){
                System.out.println("El trabajador " + nombre + " tiene derecho a 30 dias de vacaciones");
            }
        }else{
            System.out.println("La clave del departamento no es válida");
        }
    }
}
