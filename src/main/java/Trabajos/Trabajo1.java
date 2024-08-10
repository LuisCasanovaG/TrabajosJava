package Trabajos;
//Hacer una aplicacion que solicite los datos de los estudiantes(3), dentro de los
// datos deben estar las notas.
//y requiero que se calcule el promedio de los estudiantes.

import java.util.Scanner;

//Deben usar clases y objetos y scanner para llenar los datos de los estudiantes

  class Estudiantes {

    private int id;
    private String nombre;
    private String apellido;
    private double notas;


    // Estudiantes(){};
    Estudiantes(int id, String nombre, String apellido, double notas){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.notas=notas;


    }

    public int getId(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public double getNotas(){
        return this.notas;
    }

}
public class Trabajo1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Estudiantes[] estudiantes=new Estudiantes[3];
        //double sumaNotas=0;
        double sumarPromedio=0;
        for (int i=0;i<estudiantes.length;i++) {
            System.out.println("Ingrese Datos del Estudiante "+(i+1));
            System.out.print("ID: ");
            int id=scanner.nextInt();
            System.out.print("Nombre: ");
             String nombre=scanner.next();
            System.out.print("Apellido: ");
            String apellido=scanner.next();
            System.out.print("Nota: ");
            double notas=scanner.nextDouble();

            estudiantes[i] = new Estudiantes(id,nombre,apellido,notas);

            double promedio = estudiantes[i].getNotas();
            //System.out.println(promedio);
            sumarPromedio += promedio;

            //System.out.println(sumarPromedio);
        }
//        for (int i=0;i<estudiantes.length;i++) {
//            System.out.println("El Estudiante "+estudiantes[i].getNombre()+" "+estudiantes[i].getApellido()+ " tiene una nota de: "+estudiantes[i].getNotas());
//        }
        for (Estudiantes estu:estudiantes){
            System.out.println("El Estudiante "+estu.getNombre()+" "+estu.getApellido()+ " tiene una nota de: "+estu.getNotas());

        }

        double promedioGeneral = sumarPromedio/ estudiantes.length;
        System.out.println("El promedio general de Notas de los 3 Estudiantes es: " + promedioGeneral);

        scanner.close();

    }


}
