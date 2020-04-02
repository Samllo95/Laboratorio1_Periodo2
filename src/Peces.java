/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samll
 */
public class Peces extends Animal{
    public String colorEscamas;
    public String numAletas;
    public String tipoAgua;

    public Peces(String colorEscamas, String numAletas, String tipoAgua, String animal, String nombre, int edad, String genero) {
        super(animal, nombre, edad, genero);
        this.colorEscamas = colorEscamas;
        this.numAletas = numAletas;
        this.tipoAgua = tipoAgua;
    }
    
    public String nadar(){
        String nd="El Pez esta Nadando";
        return nd;
    }
    
    @Override
    public String infoAnimal() {
        String info="Pez: " + this.animal + "\n" +
                    "Nombre: " + this.nombre + "\n" +
                    "Edad: " + this.edad + " año\n" +
                    "Genero: " + this.genero + "\n" +
                    "Color de Escamas: " + this.colorEscamas + "\n" +
                    "Numero de Aletas: " + this.numAletas + "\n" +
                    "Tipo de Agua(Dulce o Salada): " + this.tipoAgua + "\n";
       return info;
    }

    @Override
    public String porcionDeAlimentacion(double pdalimen) {
        String msj="La porcion de alimento que se le proporciona a los PECES es: " + pdalimen + "kg";
        return msj;
    }
}
