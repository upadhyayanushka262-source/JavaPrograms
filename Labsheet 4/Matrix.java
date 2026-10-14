 class Matrix {
    int a, b, c, d;
    static String matrixType = "2x2 Matrix";

    void calculate() {
        int e = 1, f = 2, g = 3, h = 4;

        System.out.println("Matrix Type: " + matrixType);
        System.out.println("Addition:");

        System.out.println((a + e) + " " + (b + f));
        System.out.println((c + g) + " " + (d + h));

        System.out.println("Subtraction:");

        System.out.println((a - e) + " " + (b - f));
        System.out.println((c - g) + " " + (d - h));
    }

    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.a = 5;
        m.b = 6;
        m.c = 7;
        m.d = 8;

        m.calculate();
    }
}