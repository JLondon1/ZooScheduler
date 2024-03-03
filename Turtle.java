/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooscheduler;

/**
 *
 * @author GMT
 */
public class Turtle extends Animal {
    @Override
    public void info() {
        System.out.println("Turtle: Reptiles of the order Testudines characterized by a special bony or cartilaginous shell developed from their ribs.");
    }

    @Override
    public void eat() {
        System.out.println("Turtle eats once a day, in the morning around 10:00 AM.");
    }

    @Override
    public void sleep() {
        System.out.println("Turtle sleeps from 9:00 PM to 5:00 AM, being relatively active during the day.");
    }

    @Override
    public void checkup() {
        System.out.println("Monthly checkups for Turtle on the third Wednesday of each month.");
    }

    @Override
    public void showSchedule() {
        info();
        eat();
        sleep();
        checkup();
    }
}

