package com.luxoft.sqa;

public class QuadraticEquation {

    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double discr(){
        return b*b - 4*a*c;
    }

    public int RootCount(){
        if (discr() < 0)
            return 0;
        else if (discr() == 0)
            return 1;
        else
            return 2;
    }
}