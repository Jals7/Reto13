import java.util.Scanner;

class Aparte{
    public static boolean isElementOf(int[] arr, int numero){
        if(arr == null){
            throw new IllegalArgumentException("El arreglo no puede ser null.");
        }
        for(int elemento : arr){
            if(numero == elemento){
                return true;
            }
        }
        return false;
    }
}


public class Practica13{
    public static void main(String[] args){
        int z = 0;
        boolean c = false;
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Ingrese el tamanio del arreglo");
            String InputTamanio = input.nextLine();
            if (InputTamanio == null || InputTamanio.trim().isEmpty() || InputTamanio.equalsIgnoreCase("null")){
                throw new IllegalArgumentException("El tamanio del arreglo no puede ser null o vacio");
            }
            int tamanio = Integer.parseInt(InputTamanio);
            int[] arr = new int[tamanio];
                System.out.println("Los valores del arreglo");
            for(int j = 0; j < tamanio; j++){
                System.out.println("Ingrese el valor del elemento " + (j+1));
                arr[j] = Integer.parseInt(input.nextLine());
            }
            System.out.println("Ingrese el valor a buscar en el arreglo");
            z = Integer.parseInt(input.nextLine());
            c = Aparte.isElementOf(arr, z);
            if(c == true){
                System.out.println("El valor " + z + " si se encuentra en el arreglo");
            }
            else{
                System.out.println("El valor " + z + " no se encuentra en el arreglo");
            }
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            input.close();
        }
    }
}