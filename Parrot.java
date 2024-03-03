/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooscheduler;

/**
 *
 * @author GMT
 */
public class Parrot extends Animal {
    @Override
    public void info() {
        System.out.println("Parrot: Known for their colorful plumage and ability to mimic human speech; found in most tropical and subtropical regions.");
    }

    @Override
    public void eat() {
        System.out.println("Parrot eats four times a day: at 8:00 AM, 11:00 AM, 2:00 PM, and 5:00 PM.");
    }

    @Override
    public void sleep() {
        System.out.println("Parrot sleeps from 7:00 PM to 6:00 AM, requiring a quiet and dark environment.");
    }

    @Override
    public void checkup() {
        System.out.println("Monthly checkups for Parrot on the second Wednesday of each month.");
    }

    @Override
    public void showSchedule() {
        info();
        eat();
        sleep();
        checkup();
    }
}

