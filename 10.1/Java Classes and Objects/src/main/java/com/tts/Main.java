package com.tts;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Pet("Bella", 9, "Jharna's house");
        System.out.println(cat.getName() + " is " + cat.getAge() + " years old. ");
        Holiday valentinesDay = new Holiday("Valentines Day",2, 14);
        System.out.println(valentinesDay.holidayInfo());
    }

}
