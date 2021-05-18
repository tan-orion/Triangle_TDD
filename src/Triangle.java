public class Triangle {
    public static String getTriangType(double side1, double side2, double side3) {
        String result = "not a triangle";
        if (isTriangle(side1, side2, side3)) {
            if (isEquilateralTriangle(side1, side2, side3)) {
                result = "equilateral";
            } else if (isIsocolesTriangle(side1, side2, side3)) {
                result = "isosceles";
            } else result = "normal";
        }
        return result;
    }

    private static boolean isIsocolesTriangle(double a, double b, double c) {
        if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            return true;
        } else return false;
    }

    private static boolean isEquilateralTriangle(double a, double b, double c) {
        if (a == b && b == c) {
            return true;
        } else return false;
    }

    private static boolean isTriangle(double a, double b, double c) {
        if (a + b > c && b + c > a && a + c > b) {
            return true;
        } else return false;
    }

    }

