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
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        
        Anfibios rana=new Anfibios("Verde con rojo", "Pulmonar", "Tropical", "Rana", "Juanito", 2, "Macho");
        
        System.out.println(rana.infoAnimal());
        System.out.println(rana.saltar());
        System.out.println(rana.treparParedes());
        System.out.println(rana.porcionDeAlimentacion(.5));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        
        Mamiferos veni=new Mamiferos("Blanco con negro", "Pasto", "4", "Vaca", "Veni", 1, "Hembra");
        
        System.out.println(veni.infoAnimal());
        System.out.println(veni.darDeMamar());
        System.out.println(veni.porcionDeAlimentacion(5.7));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        
        Reptiles jack=new Reptiles("verde oscuro", "no", "no", "Cocodrilo", "Jack", 3, "Macho");
        
        System.out.println(jack.infoAnimal());
        System.out.println(jack.mudarPiel());
        System.out.println(jack.porcionDeAlimentacion(7));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        
        Peces dory=new Peces("Azul con amarillo", "4", "Salada", "Pez Cirujano", "Dory", 1, "Hembra");
        
        System.out.println(dory.infoAnimal());
        System.out.println(dory.nadar());
        System.out.println(dory.porcionDeAlimentacion(.2));
        
    }
}
