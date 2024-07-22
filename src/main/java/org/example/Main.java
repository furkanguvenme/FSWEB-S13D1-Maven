package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        return clock < 8 || clock > 20;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       return 13 <= firstAge && firstAge <= 19 || 13 <= secondAge && secondAge <= 19 || 13 <= thirdAge && thirdAge <= 19;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
     
    }

    public static double area(double width, double height) {
       
    }

    public static double area(double radius) {
       
    }
}
