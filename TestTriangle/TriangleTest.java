import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getTriangType() {
        double side1=2;
        double side2=2;
        double side3=2;
String expected = "equilateral";
String result =Triangle.getTriangType(side1,side2,side3);
assertEquals(expected,result);

        }

    @Test
    void testGetTriangType() {
        double side1 =2;
        double side2 =2;
        double side3 =3;
        String expected = "isosceles";
        String result =Triangle.getTriangType(side1,side2,side3);
        assertEquals(expected,result);
    }

    @Test
    void testGetTriangType1() {
        double side1 =3;
        double side2 =4;
        double side3 =5;
        String expected = "normal";
        String result =Triangle.getTriangType(side1,side2,side3);
        assertEquals(expected,result);
    }

    @Test
    void testGetTriangType2() {
        double side1 =-1;
        double side2 =2;
        double side3 =1;
        String expected = "not a triangle";
        String result =Triangle.getTriangType(side1,side2,side3);
        assertEquals(expected,result);
    }

    @Test
    void testGetTriangType3() {
        double side1 =8;
        double side2 =2;
        double side3 =3;
        String expected = "not a triangle";
        String result =Triangle.getTriangType(side1,side2,side3);
        assertEquals(expected,result);
    }

    @Test
    void testGetTriangType4() {
        double side1 =0;
        double side2 =1;
        double side3 =1;
        String expected = "not a triangle";
        String result =Triangle.getTriangType(side1,side2,side3);
        assertEquals(expected,result);
    }
}


