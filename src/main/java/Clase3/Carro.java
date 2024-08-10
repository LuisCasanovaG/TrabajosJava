package Clase3;

public class Carro {

    Carro(){}
   Carro(int velocidadInicial){
       this.velocidadInicial=velocidadInicial;
    }
   Carro(String id){
        this.id=id;
    }

    private String id;
    String modelo;
    String anio;
    private String color;
    String referenciallantas;
    int velocidadInicial;
    int caballosFuerza;

    public String getId(){
        return this.id;

    }


    // void si el metodo no retorna

    public int aceleracionMaxima(int valorInicial){
        int velocidad=350;
        return  velocidad;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio='" + anio + '\'' +
                ", color='" + color + '\'' +
                ", referenciallantas='" + referenciallantas + '\'' +
                ", velocidadInicial=" + velocidadInicial +
                ", caballosFuerza=" + caballosFuerza +
                '}';
    }
}
