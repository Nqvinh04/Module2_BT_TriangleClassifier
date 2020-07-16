import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testTriangle() {
        int firstSide = 2;
        int secondSide = 2;
        int thirdSide = 2;

        String expeceted = "Equilateral Triangle";
        String result = TriangleClassifier.classifyTriangle(firstSide,secondSide,thirdSide);
        assertEquals(expeceted,result);
    }

    @Test
    void testTriangle2() {
        int firstSide = 2;
        int secondSide = 2;
        int thirdSide = 3;

        String expeceted = "Isosceles Triangle";
        String result = TriangleClassifier.classifyTriangle(firstSide,secondSide,thirdSide);
        assertEquals(expeceted,result);
    }

    @Test
    void testTriangle3() {
        int firstSide = 3;
        int secondSide = 4;
        int thirdSide = 5;

        String expeceted = "Right Triangle";
        String result = TriangleClassifier.classifyTriangle(firstSide,secondSide,thirdSide);
        assertEquals(expeceted,result);
    }

    @Test
    void testTriangle4() {
        int firstSide = 8;
        int secondSide = 2;
        int thirdSide = 3;

        String expeceted = "Is not a Triangle";
        String result = TriangleClassifier.classifyTriangle(firstSide,secondSide,thirdSide);
        assertEquals(expeceted,result);
    }

    @Test
    void testTriangle5() {
        int firstSide = -1;
        int secondSide = 2;
        int thirdSide = 1;

        String expeceted = "Is not a Triangle";
        String result = TriangleClassifier.classifyTriangle(firstSide,secondSide,thirdSide);
        assertEquals(expeceted,result);
    }

    @Test
    void testTriangle6() {
        int firstSide = 0;
        int secondSide = 1;
        int thirdSide = 1;

        String expeceted = "Is not a Triangle";
        String result = TriangleClassifier.classifyTriangle(firstSide,secondSide,thirdSide);
        assertEquals(expeceted,result);
    }
}