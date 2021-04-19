package com.tts;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Pet("Bella", 9, "Jharna's house");
        System.out.println(cat.getName() + " is " + cat.getAge() + " years old. ");
        Holiday valentinesDay = new Holiday("Valentines Day",2, 14);
        System.out.println(valentinesDay.holidayInfo());
        Calculator myCalc = new Calculator();
        System.out.println(myCalc.Add(1, 3));
        System.out.println(myCalc.Subtract(4, 2));
        System.out.println(myCalc.Division(8, 3));
        System.out.println(myCalc.Multiply(2, 4));
        System.out.println(myCalc.Square(2));
        System.out.println("---------------------------------------------------------------------");
        MagicCalculator secondCalc = new MagicCalculator();
        System.out.println(secondCalc.Add(2,2));
        System.out.println(secondCalc.SquareRoot(4));
        System.out.println(secondCalc.Sin(4));
        System.out.println(secondCalc.Tangent(4));
        System.out.println(secondCalc.Cosine(4));
        System.out.println(secondCalc.Factorial(4));
    }

}
