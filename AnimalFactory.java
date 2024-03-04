/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooscheduler;

/**
 *
 * @author Jakob
 */
public class AnimalFactory {
    public Animal getAnimal(int animalNum) {
        switch(animalNum) {
            case 1:
                return new Eagle();
            case 2:
                return new Elephant();
            case 3:
                return new Hippo();
            case 4:
                return new Lion();
            case 5:
                return new Lizard();
            case 6:
                return new Parrot();
            case 7:
                return new Penguin();
            case 8:
                return new Snake();
            case 9:
                return new Turtle();
        }
        return null;
    }
}
