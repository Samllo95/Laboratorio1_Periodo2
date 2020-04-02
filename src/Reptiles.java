/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samll
 */
public class Reptiles extends Animal{
    public String colorEscamas;
    public String seArrastra;
    public String veneno;

    public Reptiles(String colorEscamas, String seArrastra, String veneno, String animal, String nombre, int edad, String genero) {
        super(animal, nombre, edad, genero);
        this.colorEscamas = colorEscamas;
        this.seArrastra = seArrastra;
        this.veneno = veneno;
    }
    
    public String mudarPiel(){
        String mp="El Reptil esta mudando de Piel";
        return mp;
    }
    
    @Override
    public String infoAnimal() {
        String info="Reptil: " + this.animal + "\n" +
                    "Nombre: " + this.nombre + "\n" +
                    "Edad: " + this.edad + " año\n" +
                    "Genero: " + this.genero + "\n" +
                    "Color de Escamas: " + this.colorEscamas + "\n" +
                    "Se arrastra: " + this.seArrastra + "\n" +
                    "Reptil venenoso: " + this.veneno + "\n";
       return info;
    }

    @Override
    public String porcionDeAlimentacion(double pdalimen) {
        String msj="La porcion de alimento que se le proporciona a los REPTILES es: " + pdalimen + "kg";
        return msj;
    }
}
