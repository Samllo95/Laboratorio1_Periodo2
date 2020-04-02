/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samll
 */
public class Anfibios extends Animal{
    public String colorPiel;
    public String tipoRespiracion;
    public String tipoHabita;

    public Anfibios(String colorPiel, String tipoRespiracion, String tipoHabita, String animal, String nombre, int edad, String genero) {
        super(animal, nombre, edad, genero);
        this.colorPiel = colorPiel;
        this.tipoRespiracion = tipoRespiracion;
        this.tipoHabita = tipoHabita;
    }

    
    public String saltar(){
        String salt="Algunos Anfibios saltan grandes distancias";
        return salt;
    }
    
    public String treparParedes(){
        String trepar="Los Anfibios pueden trepara objetos";
        return trepar;
    }

    @Override
    public String infoAnimal() {
        String info="Anfibio: " + this.animal + "\n" +
                    "Nombre: " + this.nombre + "\n" +
                    "Edad: " + this.edad + " año\n" +
                    "Genero: " + this.genero + "\n" +
                    "Color de Piel: " + this.colorPiel + "\n" +
                    "Tipo de Habita: " + this.tipoHabita + "\n" +
                    "Tipo de Resiracion: " + this.tipoRespiracion + "\n";
       return info;
    }

    @Override
    public String porcionDeAlimentacion(double pdalimen) {
        String msj="La porcion de alimento que se le proporciona a los ANFIBIOS es: " + pdalimen + "kg";
        return msj;
    }
    
}
