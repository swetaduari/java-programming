package com.lab5;

class MethodOverloading {

    // Method with int parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with double parameters
    static double add(double a, double b) {
        return a + b;
    }

    // Overloaded method with float parameters
    static float add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum (int): " + add(10, 20));
        System.out.println("Sum (double): " + add(10.5, 20.3));
        System.out.println("Sum (float): " + add(5.5f, 4.5f));
    }
}
