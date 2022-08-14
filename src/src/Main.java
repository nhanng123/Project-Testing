package src;

import src.commission.BVA_Commission;
import src.commission.RobustBVA_Commission;
import src.triangle.BVA_Triangle;
import src.triangle.RobustBVA_Triangle;

public class Main {

    public static void main(String[] args) {
        System.out.println("###########TRIANGLE PROBLEM###########");
        System.out.println("------BOUNDARY VALUE ANALYSIS:");
        BVA_Triangle.generateTestcases();
        System.out.println("==========================================================");
        System.out.println("------BOUNDARY VALUE ANALYSIS:");
        RobustBVA_Triangle.generateTestcases();
        System.out.println("------------------------------////------------------------------------");
        System.out.println("###########COMMISSIONS PROBLEM###########");
        System.out.println("------BOUNDARY VALUE ANALYSIS:");
        BVA_Commission.generateTestcases();
        System.out.println("==========================================================");
        System.out.println("------BOUNDARY VALUE ANALYSIS:");
        RobustBVA_Commission.generateTestcases();
        System.out.println("------------------------------////------------------------------------");
    }
}
