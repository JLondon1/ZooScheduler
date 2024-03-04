/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zooscheduler;
import java.util.Scanner;

/**
 *
 * @author Jakob
 */
public class ZooScheduler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal;

        System.out.println("Welcome to the Zoo Scheduler!");
        System.out.println("We have a large number of animals at our zoo.");
        System.out.println();
        boolean finishedChoosing = false;
        int userInput;
        while (finishedChoosing != true) {
            System.out.println("1. Eagles");
            System.out.println("2. Elephants");
            System.out.println("3. Hippos");
            System.out.println("4. Lions");
            System.out.println("5. Lizards");
            System.out.println("6. Parrots");
            System.out.println("7. Penguins");
            System.out.println("8. Snakes");
            System.out.println("9. Turtles");
            System.out.println("10. Exit Program");
            System.out.println();
            System.out.print("Please enter the number of your animal choice, or choose 10 to exit: ");
            userInput = scan.nextInt();
            if (userInput == 10) {
                finishedChoosing = true;
            } else {
                animal = animalFactory.getAnimal(userInput);
                System.out.println();
                animal.showSchedule();
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("We hope you have a wonderful trip to our zoo!");
    }
}
