package Clase4;

import java.util.Scanner;

public class clase4 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
///////////////ADVINA EL NUMERO ////////////////////////////
//        int numSecreto=10;
//        int intentos=1;
//        int menosIntentos=5;
//            System.out.println("------ADIVINA EL NUMERO------");
//           System.out.println("Dame un Numero del 1 al 10");
//           System.out.println("Tiene 5 intentos");
//
//        do{
//            int numero = scanner.nextInt();
//            if (numero == numSecreto){
//                System.out.println("Felicidades Adivinaste");
//                break;
//            }else{
//                System.out.println("Sigue intentando");
//                intentos++;
//                menosIntentos=menosIntentos-1;
//                System.out.println("Tiene "+menosIntentos+ " Intentos");
//            }
//
//        }while (intentos <= 5);




/////// SUMA DE NUMEROS POSITIVOS ////////////////////////

       int contNumeros=0;

        System.out.println("Digite un numero");
        int numPositivo;
       do{
           numPositivo=scanner.nextInt();
                contNumeros = contNumeros + numPositivo;

    }while(numPositivo>=0);
        System.out.println("La suma de los numeros son: "+contNumeros);

///////////////////// TABLA MULTIPLICAR //////////////////////////////////


//////////////////////////////////////////////////////////////////
/*
        int contador=0;

        while (contador<=5){
            System.out.println(contador);
            contador++;
        }
        System.out.println("----------separar----------");
        contador=0;
        do{
            System.out.println(contador);
            contador++;
        }while (contador<=5);




    }


 */
}
//scanner.close();
}
