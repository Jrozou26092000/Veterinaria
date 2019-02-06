/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author jrozou
 */
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        License licencia = new License();
        Pet d1 = new Dog("Firulais",licencia);
        Pet c1 = new Cat("Micifu");
    }
    
}
