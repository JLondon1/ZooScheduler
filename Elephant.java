/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooscheduler;

/**
 *
 * @author GMT
 */
public class Elephant extends Animal {
    @Override
    public void info() {
        System.out.println("Elephant: The largest land animal, known for its intelligence and strong social bonds.");
    }

    @Override
    public void eat() {
        System.out.println("Elephant eats throughout the day with a focus on mornings and late afternoons.");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant sleeps for short periods, mainly at night.");
    }

    @Override
    public void checkup() {
        System.out.println("Monthly checkups for Elephant on the first Wednesday of each month.");
    }

    @Override
    public void showSchedule() {
        info();
        eat();
        sleep();
        checkup();
    }
}
