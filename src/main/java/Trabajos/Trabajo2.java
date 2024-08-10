package Trabajos;

import java.util.Scanner;

//Elegir el mayor de 3 numeros
public class Trabajo2 {
    public static void main(String[] args) {
        //int num1,num2,num3;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digita primer numero");
        int num1=scanner.nextInt();
        System.out.println("Digita segundo numero");
        int num2=scanner.nextInt();
        System.out.println("Digita tercer numero");
        int num3=scanner.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("El numero "+num1+" es mayor");
        }else if (num2>num1 && num2>num3){
            System.out.println("El numero "+num2+" es mayor");
        }else {
            System.out.println("El numero "+num3+" es mayor");
        }
    }

}



