/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooscheduler;

/**
 *
 * @author GMT
 */
public class Lion extends Animal {
    @Override
    public void info() {
        System.out.println("Lion: The king of the jungle, known for its majestic mane and powerful roar.");
    }

    @Override
    public void eat() {
        System.out.println("Lion eats twice a day: at 9:00 AM and 3:00 PM.");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps from 8:00 PM to 6:00 AM.");
    }

    @Override
    public void checkup() {
        System.out.println("Monthly checkups for Lion on the second Tuesday of each month.");
    }

    @Override
    public void showSchedule() {
        info();
        eat();
        sleep();
        checkup();
    }
}

