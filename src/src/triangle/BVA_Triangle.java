package src.triangle;

import java.util.HashMap;
import java.util.Map;

public class BVA_Triangle {
    static int min = 5;
    static int max = 205;
    static int nom = 100;
    static int minPlus = min + 1;
    static int maxMinus = max - 1;

    public static void generateTestcases(){
        int[] values = {min, minPlus, nom, maxMinus, max};
        char[] keys = {'A', 'B', 'C'};
        Map<Character, Integer> edges = new HashMap<>();
        edges.put('A', nom);
        edges.put('B', nom);
        edges.put('C', nom);
        System.out.println("Test case\t\tA\t\tB\t\tC\t\tExpected output");
        int count = 1;
        boolean isTripNomChecked = false;
        for(char c : keys){
            for(int j : values){
                edges.put(c,j);
                if(edges.get('A') == edges.get('B') && edges.get('B') == edges.get('C')){
                    if (!isTripNomChecked){
                        isTripNomChecked = true;
                    }else{
                        continue;
                    }
                }
                System.out.print("\t\t" + count++ + "\t\t");
                String result = Triangle.checkTriangle(edges.get('A'), edges.get('B'), edges.get('C'));
                System.out.print(edges.get('A') + "\t\t" + edges.get('B') + "\t\t" + edges.get('C') + "\t\t");
                edges.put(c, nom);
                System.out.println(result);
            }
        }
    }
}
