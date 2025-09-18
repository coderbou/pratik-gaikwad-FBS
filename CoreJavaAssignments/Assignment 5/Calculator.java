class Calculator {

    // ADDITION
    void add(int a, int b) {
        System.out.println("Addition (int, int): " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Addition (double, double): " + (a + b));
    }

    void add(int a, double b) {
        System.out.println("Addition (int, double): " + (a + b));
    }

    void add(double a, int b) {
        System.out.println("Addition (double, int): " + (a + b));
    }

    // SUBTRACTION
    void subtract(int a, int b) {
        System.out.println("Subtraction (int, int): " + (a - b));
    }

    void subtract(double a, double b) {
        System.out.println("Subtraction (double, double): " + (a - b));
    }

    void subtract(int a, double b) {
        System.out.println("Subtraction (int, double): " + (a - b));
    }

    void subtract(double a, int b) {
        System.out.println("Subtraction (double, int): " + (a - b));
    }

    // MULTIPLICATION
    void multiply(int a, int b) {
        System.out.println("Multiplication (int, int): " + (a * b));
    }

    void multiply(double a, double b) {
        System.out.println("Multiplication (double, double): " + (a * b));
    }

    void multiply(int a, double b) {
        System.out.println("Multiplication (int, double): " + (a * b));
    }

    void multiply(double a, int b) {
        System.out.println("Multiplication (double, int): " + (a * b));
    }

    // DIVISION
    void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Division (int, int): " + (a / b));
        } else {
            System.out.println("Division by zero not allowed (int, int).");
        }
    }

    void divide(double a, double b) {
        if (b != 0) {
            System.out.println("Division (double, double): " + (a / b));
        } else {
            System.out.println("Division by zero not allowed (double, double).");
        }
    }

    void divide(int a, double b) {
        if (b != 0) {
            System.out.println("Division (int, double): " + (a / b));
        } else {
            System.out.println("Division by zero not allowed (int, double).");
        }
    }

    void divide(double a, int b) {
        if (b != 0) {
            System.out.println("Division (double, int): " + (a / b));
        } else {
            System.out.println("Division by zero not allowed (double, int).");
        }
    }
} // Class Calculator ends here


class TestCalculator {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        int x = 10, y = 20;
        double p = 12.5, q = 3.5;

        // Addition
        c1.add(x, y);
        c1.add(p, q);
        c1.add(x, p);
        c1.add(p, y);

        // Subtraction
        c1.subtract(x, y);
        c1.subtract(p, q);
        c1.subtract(x, p);
        c1.subtract(p, y);

        // Multiplication
        c1.multiply(x, y);
        c1.multiply(p, q);
        c1.multiply(x, p);
        c1.multiply(p, y);

        // Division
        c1.divide(x, y);
        c1.divide(p, q);
        c1.divide(x, p);
        c1.divide(p, y);
    }
}
