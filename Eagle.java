/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooscheduler;

/**
 *
 * @author GMT
 */
public class Eagle extends Animal {
    @Override
    public void info() {
        System.out.println("Eagle: A bird of prey in the family Accipitridae; eagles are most commonly found in the Northern Hemisphere.");
    }

    @Override
    public void eat() {
        System.out.println("Eagle feeds twice a day: early morning at 8:00 AM and late afternoon at 4:00 PM.");
    }

    @Override
    public void sleep() {
        System.out.println("Eagle sleeps from sunset to sunrise, being mostly active during the day.");
    }

    @Override
    public void checkup() {
        System.out.println("Monthly checkups for Eagle on the first Friday of each month.");
    }

    @Override
    public void showSchedule() {
        info();
        eat();
        sleep();
        checkup();
    }
}
