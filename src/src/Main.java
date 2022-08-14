package src;

import src.triangle.BVA_Triangle;
import src.triangle.RobertBVA_Triangle;

public class Main {

    public static void main(String[] args) {
        System.out.println("Boundary Value Analysis:");
        BVA_Triangle.generateTestcases();
        System.out.println("===================================");
        System.out.println("Robertness Boundary Value Analysis:");
        RobertBVA_Triangle.generateTestcases();
    }
}
