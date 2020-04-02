/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samll
 */
public class Aves extends Animal{
    public String colorPlumas;
    public String tamañoPico;
    public String puedeVolar;

    public Aves(String colorPlumas, String tamañoPico, String puedeVolar, String animal, String nombre, int edad, String genero) {
        super(animal, nombre, edad, genero);
        this.colorPlumas = colorPlumas;
        this.tamañoPico = tamañoPico;
        this.puedeVolar = puedeVolar;
    }

    
    
    public String volar(){
        if (this.puedeVolar.equals("si") || this.puedeVolar.equals("Si") || this.puedeVolar.equals("SI")){
            String vuelo="El ave esta VOLANDO";
            return vuelo;
        }else{
            String vuelo="El ave NO puede Volar :(";
            return vuelo;
        }
        
    } 
    
    public String cantar(){
        String canto="El AVE esta cantando o Silvando;";
        return canto;
    }

    @Override
    public String infoAnimal() {
        String info="Ave: " + this.animal + "\n" +
                    "Nombre del Ave: " + this.nombre + "\n" +
                    "Edad del Ave: " + this.edad + " año\n" +
                    "Genero del Ave: " + this.genero + "\n" +
                    "Color de Plumas: " + this.colorPlumas + "\n" +
                    "Tamaño del Pico: " + this.tamañoPico + "\n";
       return info;
    }

    @Override
    public String porcionDeAlimentacion(double pdalimen) {
        String msj="La porcion de alimento que se le proporciona a las AVES es: " + pdalimen + "kg";
        return msj;
    }
    
}
