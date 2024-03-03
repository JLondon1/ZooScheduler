/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooscheduler;

/**
 *
 * @author GMT
 */
public class Penguin extends Animal {
    @Override
    public void info() {
        System.out.println("Penguin: A group of aquatic, flightless birds living almost exclusively in the Southern Hemisphere, especially in Antarctica.");
    }

    @Override
    public void eat() {
        System.out.println("Penguin feeds three times a day: morning at 9:00 AM, noon, and evening at 5:00 PM.");
    }

    @Override
    public void sleep() {
        System.out.println("Penguin sleeps intermittently throughout the night from 8:00 PM to 5:00 AM.");
    }

    @Override
    public void checkup() {
        System.out.println("Monthly checkups for Penguin on the fourth Thursday of each month.");
    }

    @Override
    public void showSchedule() {
        info();
        eat();
        sleep();
        checkup();
    }
}

