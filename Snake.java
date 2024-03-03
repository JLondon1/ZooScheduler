/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooscheduler;

/**
 *
 * @author GMT
 */
public class Snake extends Animal {
    @Override
    public void info() {
        System.out.println("Snake: Elongated, legless, carnivorous reptiles of the suborder Serpentes.");
    }

    @Override
    public void eat() {
        System.out.println("Snake feeds once every week, typically in the late afternoon.");
    }

    @Override
    public void sleep() {
        System.out.println("Snake has irregular sleeping patterns, often active at night.");
    }

    @Override
    public void checkup() {
        System.out.println("Monthly checkups for Snake on the second Friday of each month.");
    }

    @Override
    public void showSchedule() {
        info();
        eat();
        sleep();
        checkup();
    }
}

