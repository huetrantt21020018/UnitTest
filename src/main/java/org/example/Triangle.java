package org.example;

public class Triangle {
    boolean isEquilateralTriangle(int a, int b, int c) {
        return a == b && b == c;
    }

    boolean isIsosceisIlesTriangle(int a, int b, int c) {
        return a == b || b == c || c == a;
    }

    boolean isSquareTriangle(int a, int b, int c) {
        if(a * a == b * b + c * c) return true;
        if(b * b == a * a + c * c) return true;
        if(c * c == b * b + a * a) return true;
        return false;
    }

    boolean isTriangle(int a, int b, int c) {
        return (a + b > c && b + c > a && c + a > b);
    }

    public String triangleType(int a, int b, int c) {
        if(!isTriangle(a, b, c)) return "Không phải tam giác";
        if(isEquilateralTriangle(a, b, c)) return "Tam giác đều";
        if(isIsosceisIlesTriangle(a, b, c) && isSquareTriangle(a, b, c)) return "Tam giác vuông cân";
        if(isIsosceisIlesTriangle(a, b, c)) return "Tam giác cân";
        if(isSquareTriangle(a, b, c)) return "Tam giác vuông";
        return "Tam giác thường";
    }
}
