public class Operaciones {
    public static void main(String args[]){
        int num1 = 5, num2 = 3, resultado = 0;
        int Operacion = 4;
        switch(Operacion){
            case 1: resultado = num1 + num2;
            System.out.println("El resultado de la suma es igual a: " + resultado);
            break;
            case 2: resultado = num1 - num2;
            System.out.println("El resultado de la resta es igual a: " + resultado);
            break;
            case 3: resultado = num1 * num2;
            System.out.println("El resultado de la multiplicacion es igual a: " + resultado);
            break;
            case 4: resultado = num1 / num2;
            System.out.println("El resultado de la division es igual a: " + resultado);
            break;
            default: System.out.println("La opcion no existe.");
        }
    }
}
