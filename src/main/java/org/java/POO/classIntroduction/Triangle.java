package org.java.POO.classIntroduction;

public class Triangle {

    public Double a;
    public Double b;
    public Double c;



    public double calculateArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
