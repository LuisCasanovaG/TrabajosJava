package Clase4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int contador = 0;

        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }
        System.out.println("////////////////separador/////////////////");
        contador = 0;
        do {
            System.out.println(contador);
            contador++;
        } while (contador <= 5);

        ////////////////////////SEPARADOR//////////////
        System.out.println("////////////////separador/////////////////");

        String[] ciudades={"Cali","Bogota","Medellin"};
        System.out.println("El tamaño del arreglo "+ciudades.length);
        for (int i=0;i<ciudades.length;i++){
            System.out.println(ciudades[i]);
        }
        System.out.println("////////////////separador/////////////////");
        for(String ciudad:ciudades){
            System.out.println(ciudad);
        }

        ////////////////////////SEPARADOR//////////////
        System.out.println("////////////////separador/////////////////");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite el numero para la Tabla de Multiplicar");
        int numeroTabla=scanner.nextInt();
        System.out.println("///////////////TABLA//////////////");
        for (int i=0;i<1;i++){
            for (int j=1;j<=10;j++){
                System.out.println(numeroTabla+" x "+j+" = "+(numeroTabla*j));
            }
        }
    }
}
