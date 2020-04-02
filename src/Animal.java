/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samll
 */
public abstract class Animal {
    public String animal;
    public String nombre;
    public int edad;
    public String genero;
    

    public Animal() {
    }

    public Animal(String animal, String nombre, int edad, String genero) {
        this.animal = animal;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    
    
    public abstract String infoAnimal();
    
    public abstract String porcionDeAlimentacion(double pdalimen);
    
}
