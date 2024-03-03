/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zooscheduler;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Jakob
 */
public class ZooScheduler {
    public static void createSchedule(String Obj) {
        /* 
        Pseudocode:
        Once we get the objects from the factory,
        we parse the objects for their information.
        
        Starts with first compatible animal (user picks time, animal must be active at that time)
        Schedule allocates 15 minutes per animal.
        Animals split by habitat (area with a bunch of related animals)
        After one capatible animal chosen, will try to schedule rest of animals in that habit by activity.
        
        after habitat is done, move to another habitat.
        Semi random, if schedule does not work try another one. If 100 schedules tried and none work tell the user.
        */
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LizardandPenguinFactory lizardAndPenguinFactory = new LizardandPenguinFactory();
        ArrayList<LizardandPenguin> lizardsAndPenguins = new ArrayList<LizardandPenguin>();
        // as many arraylists as there are factories/abstract classes
        
        System.out.println("Welcome to the Zoo Scheduler!");
        System.out.println("We have a large number of animals at our zoo. \nPlease select which animals you would like to visit during your outing: ");
        System.out.println("Reptile Exhibit: ");
        boolean finishedChoosing = false;
        int userInput;
        while (finishedChoosing != true) {
            System.out.println("1. Lizards");
            System.out.println("The Living Coast (Aquatic Life and Birds");
            System.out.println("2. Penguins");
            System.out.println("3. Polar Bears (temporary animal)");
            System.out.println("10. Finish Choosing");
            System.out.print("Please enter the number of your animal choice: ");
            userInput = scan.nextInt();
            if (userInput == 10) {
                finishedChoosing = true;
            } else {
                // There will be as many factories as there are types of animals (abstract classes)
                if (userInput >= 1 && userInput <= 2) {
                    lizardsAndPenguins.add(lizardAndPenguinFactory.getAnimal(userInput));
                } //else if, 
                
            }
        }
        // call createSchedule, passing the ArrayLists
        
        
    }
}
