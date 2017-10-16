package com.luxoft.sqa;

public class Equation {

    public static void main(String[] args) {
        QuadraticEquation eq = new QuadraticEquation(8, 6, 1);
        System.out.println(eq.RootCount());
    }

}