/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooscheduler;

/**
 *
 * @author GMT
 */
public class Lizard extends Animal {
    @Override
    public void info() {
        System.out.println("Lizard: A widespread group of squamate reptiles, with over 6,000 species, ranging across all continents except Antarctica.");
    }

    @Override
    public void eat() {
        System.out.println("Lizard eats twice a day: once at noon and once at 6:00 PM.");
    }

    @Override
    public void sleep() {
        System.out.println("Lizard sleeps from 8:00 PM to 8:00 AM, being active during the day.");
    }

    @Override
    public void checkup() {
        System.out.println("Monthly checkups for Lizard on the first Monday of each month.");
    }

    @Override
    public void showSchedule() {
        info();
        eat();
        sleep();
        checkup();
    }
}

