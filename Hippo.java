/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooscheduler;

/**
 *
 * @author GMT
 */
public class Hippo extends Animal {
    @Override
    public void info() {
        System.out.println("Hippo: Spends most of its time in water to keep its massive body cool under the hot African sun.");
    }

    @Override
    public void eat() {
        System.out.println("Hippo feeds at dusk, leaving the water to graze on grass.");
    }

    @Override
    public void sleep() {
        System.out.println("Hippo rests in the water during the day and has no specific sleep schedule.");
    }

    @Override
    public void checkup() {
        System.out.println("Monthly checkups for Hippo on the third Monday of each month.");
    }

    @Override
    public void showSchedule() {
        info();
        eat();
        sleep();
        checkup();
    }
}

