package src.triangle;

public class Triangle {
    public static String checkTriangle(int side1, int side2, int side3){
        boolean c1, c2, c3;
        String triangleType;

        c1 = (5 <= side1) && (side1 <= 205);
        c2 = (5 <= side2) && (side2 <= 205);
        c3 = (5 <= side3) && (side3 <= 205);

        if (!c1 || !c2 || !c3)
            triangleType = "OUT_OF_RANGE";
        else {
            if (isTriangle(side1, side2,side3)) {
                if ((side1 == side2) && (side2 == side3))
                    triangleType = "EQUILATERAL";
                else if ((side1 != side2) && (side1 != side3) && (side2 != side3))
                    triangleType = "SCALENE";
                else
                    triangleType = "ISOSCELES";
            } else
                triangleType = "IsNotTriangle";
        }
        return triangleType;

    }

    private static boolean isTriangle(int a, int b, int c){
        return a + b > c && a + c > b && b + c >a;
    }
}
