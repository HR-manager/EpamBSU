import org.testng.annotations.DataProvider;

import static org.testng.Assert.*;

/**
 * Class for tests.
 * @author Petriakina
 * @version 1.0
 */
public class TriangleTest {

    @DataProvider
    public Object[][] checkFalse(){
        return new Object[][]{
                {Double.MAX_VALUE, Double.MAX_VALUE, 1.0},
                {Double.MAX_VALUE, 1.0, Double.MAX_VALUE},
                {4.0, Double.MAX_VALUE, Double.MAX_VALUE},
                {Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE},
                {Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE},

                {0.0, 0.0, 0.0},
                {1.0, 1.0, 0.0},
                {0.0, 1.0, 0.0},
                {1.0, 0.0, 0.0},
                {0.0, 0.0, 12.0},
                {0.0, 1.0, 12.0},
                {1.0, 0.0, 12.0},

                {Double.NaN, 1.0, 4.0},
                {1.0, Double.NaN, 4.0},
                {1.0, 4.0, Double.NaN},
                {Double.NaN, Double.NaN, 4.0},
                {4.0, Double.NaN, Double.NaN},
                {Double.NaN, 4.0, Double.NaN},
                {Double.NaN, Double.NaN, Double.NaN},

                {-26.9, 36.0, 6.0},
                {26.9, -36.0, 6.0},
                {26.9, 36.0, -6.0},
                {-26.9, -36.0, 6.0},
                {26.9, -36.0, -6.0},
                {-26.9, 36.0, -6.0},
                {-26.9, -36.0, -6.0},

                {-Double.MAX_VALUE, -Double.MAX_VALUE, -Double.MAX_VALUE},
                {4.0, 1.0, Double.MAX_VALUE},
                {-Double.MAX_VALUE, -Double.MAX_VALUE, 1.0},
                {-Double.MAX_VALUE, 1.0, -Double.MAX_VALUE},
                {4.0, -Double.MAX_VALUE, 1.0},
                {4.0, 1.0, -Double.MAX_VALUE},
                {-Double.MAX_VALUE, 4.0, 1.0},
                {4.0, -Double.MAX_VALUE, -Double.MAX_VALUE},
                {4.0, Double.MAX_VALUE, 1.0},
                {Double.MAX_VALUE, 4.0, 1.0},

                {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY},
                {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 1.0},
                {Double.NEGATIVE_INFINITY, 1.0, Double.NEGATIVE_INFINITY},
                {1.0, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY},
                {1.0, 1.0, Double.NEGATIVE_INFINITY},
                {1.0, Double.NEGATIVE_INFINITY, 1.0},
                {Double.NEGATIVE_INFINITY, 1.0, 1.0},

                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1.0},
                {Double.POSITIVE_INFINITY, 1.0, Double.POSITIVE_INFINITY},
                {1.0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {1.0, 1.0, Double.POSITIVE_INFINITY},
                {1.0, Double.POSITIVE_INFINITY, 1.0},
                {Double.POSITIVE_INFINITY, 1.0, 1.0},

                {Double.MIN_VALUE, 4.0, 1.0},
                {4.0, 1.0, Double.MIN_VALUE},
                {Double.MIN_VALUE, 1.0, Double.MIN_VALUE},
                {4.0, Double.MIN_VALUE, Double.MIN_VALUE},
                {4.0, Double.MIN_VALUE, 1.0},
                {-Double.MIN_VALUE, -Double.MIN_VALUE, -Double.MIN_VALUE},
                {-Double.MIN_VALUE, -Double.MIN_VALUE, 1.0},
                {4.0, Double.MIN_VALUE, 1.0},
                {-Double.MIN_VALUE, 1.0, -Double.MIN_VALUE},
                {4.0, -Double.MIN_VALUE, -Double.MIN_VALUE},
                {4.0, 1.0, Double.MIN_VALUE},
                {Double.MIN_VALUE, 4.0, 1.0},
                {-Double.MIN_VALUE, -Double.MIN_VALUE, -Double.MIN_VALUE},
                {Double.MIN_VALUE, Double.MIN_VALUE, 10.0},
                {4.0, -Double.MIN_VALUE, 1.0},
                {4.0, 1.0, -Double.MIN_VALUE},
                {-Double.MIN_VALUE, 4.0, 1.0},
        };
    }

    @org.testng.annotations.Test (dataProvider = "checkFalse")
    public void testCheckFalse(Double a, Double b, Double c) throws Exception {
        assertFalse(Triangle.triangleIsExist(a, b, c));
    }

    @DataProvider
    public Object[][] checkText() {
        return new Object[][]{
                {"x", "x", "x"},
                {"0.1", "x", "x"},
                {"x", "7.0", "x"},
                {"x", "x", "45.0"},
        };
    }

    @org.testng.annotations.Test(dataProvider = "checkText", expectedExceptions = NumberFormatException.class)
    public void testCheckText(String a, String b, String c) throws Exception {
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        double z = Double.parseDouble(c);
        Triangle.type(x, y, z);
    }
}