package Trabajos;

import java.util.Scanner;

// Calculadora Try-catch
public class Trabajo3 {

   public static class MostrarMenu {
MostrarMenu() {

    System.out.println("Calculadora");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    //System.out.println("5. Salir");
    System.out.println("Selecciona una opción (1-4): ");
}
   }
//   public static class Calculadora{
//Calculadora(Scanner scanner, int resultado){
//double num1, num2;
//    System.out.print("Digite el primero numero: ");
//    num1=scanner
//
//}
//
//    }

    public static void main(String[] args) {

        MostrarMenu mostrarmenu =new MostrarMenu();
        Scanner scanner=new Scanner(System.in);
        int opcion;
        int num1,num2;


       do {
            opcion = scanner.nextInt();
           if (opcion <= 0 || opcion > 4) {
               System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 4.");
               System.out.println("Selecciona una opción (1-4): ");
           }
       }while (opcion <=0 || opcion > 4);

        String[] arregloMenuu={"SUMA","RESTA","MULTIPLICACION","DIVISION"};

            System.out.println("////////////////OPERACION///////////////");
            System.out.println("LA OPERACION ES UNA " + arregloMenuu[opcion - 1]);



        do {
            System.out.print("Digite el primero numero: ");
            num1=scanner.nextInt();
            System.out.print("Digite el segundo numero: ");
            num2=scanner.nextInt();

            switch (opcion){
                case 1:
                    int suma=num1+num2;
                    System.out.println("Resultado; "+suma);
                    break;
                case 2:
                    int resta =num1-num2;
                    System.out.println("Resultado; "+resta);
                    break;
                case 3:
                    int multiplicacion =num1*num2;
                    System.out.println("Resultado; "+multiplicacion);
                    break;
                case 4:

                    do {
                        try {
                        if (num2 == 0) {
                           throw new RuntimeException("No se puede dividir entre cero");
                            }
                                //int division = num1 / num2;
                            } catch (RuntimeException e) {//muestra
                                System.out.println("Fallo porque " + e.getMessage());

                            }
                            System.out.print("Digite Nuevamente el primero numero: ");
                            num1=scanner.nextInt();
                            System.out.print("Digite Nuevamente el segundo numero: ");
                            num2=scanner.nextInt();

                    }while (num2==0);

                        double division = num1 / num2;
                        System.out.println("Resultado; " + division);


                    break;

            }
            break;
        }while (opcion<5);

        scanner.close();
    }
}
