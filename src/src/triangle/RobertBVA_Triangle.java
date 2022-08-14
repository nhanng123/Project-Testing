package src.triangle;

import java.util.HashMap;
import java.util.Map;

public class RobertBVA_Triangle {
    static int min = 5;
    static int max = 205;
    static int nom = 105;
    static int minPlus = min + 1;
    static int maxMinus = max - 1;
    static int minMinus = min - 1;
    static int maxPlus = max + 1;


    public static void generateTestcases(){
        int[] values = {minMinus, min, minPlus, nom, maxMinus, max, maxPlus};
        char[] keys = {'A', 'B', 'C'};
        Map<Character, Integer> edges = new HashMap<>();
        edges.put('A', nom);
        edges.put('B', nom);
        edges.put('C', nom);
        System.out.println("Test case\tA\tB\tC\tExpected output");
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
                System.out.print("\t\t" + count++ + "\t");
                String result = Triangle.checkTriangle(edges.get('A'), edges.get('B'), edges.get('C'));
                System.out.print(edges.get('A') + "\t" + edges.get('B') + "\t" + edges.get('C') + "\t");
                edges.put(c, nom);
                System.out.println(result);
            }
        }
    }
}
