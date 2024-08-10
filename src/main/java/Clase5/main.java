package Clase5;

public class main {
    public static void main(String[] args) {

//        Perro p=new Perro("Milo");
//        p.emitirSonido();
//        p.tieneSangre=true;
        int num1=10,num2=0;
        try{
            int resultado=num1/num2;
        }catch (RuntimeException e){//muestra
            System.out.println("Fallo por "+e.getMessage());
        }


    }

}
