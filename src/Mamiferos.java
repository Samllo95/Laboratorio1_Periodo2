/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samll
 */
public class Mamiferos extends Animal{
    public String colorPelo;
    public String tipoComida;
    public String numGlandulasMamarias;

    public Mamiferos(String colorPelo, String tipoComida, String numGlandulasMamarias, String animal, String nombre, int edad, String genero) {
        super(animal, nombre, edad, genero);
        this.colorPelo = colorPelo;
        this.tipoComida = tipoComida;
        this.numGlandulasMamarias = numGlandulasMamarias;
    }
    
    public String darDeMamar(){
        String mm="El Mamifero estadado de mamar a su cria";
        return mm;
    }

    @Override
    public String infoAnimal() {
        String info="Mamifero: " + this.animal + "\n" +
                    "Nombre: " + this.nombre + "\n" +
                    "Edad: " + this.edad + " año\n" +
                    "Genero: " + this.genero + "\n" +
                    "Color de Pelo: " + this.colorPelo + "\n" +
                    "Tipo de Comida: " + this.tipoComida + "\n" +
                    "Numero de glandulas Mamarias: " + this.numGlandulasMamarias + "\n";
       return info;
    }

    @Override
    public String porcionDeAlimentacion(double pdalimen) {
        String msj="La porcion de alimento que se le proporciona a los MAMIFEROS es: " + pdalimen + "kg";
        return msj;
    }
    
}
