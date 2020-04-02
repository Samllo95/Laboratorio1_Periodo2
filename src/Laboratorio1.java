/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samll
 */
public class Laboratorio1 {
    public static void main(String[] args) {
        Aves pepito=new Aves("Verdes", "Pequeño", "si", "Perico", "Pepito", 1, "Macho");
        
        System.out.println(pepito.infoAnimal());
        System.out.println(pepito.cantar());
        System.out.println(pepito.volar());
        System.out.println(pepito.porcionDeAlimentacion(1));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        
        
    }
}
