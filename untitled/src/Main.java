public class Main {
    public static void main(String[] args) {
        Mth mth = new Mth();

        System.out.println("Результат sum3: " + mth.sum3(10, 20, 37));
        System.out.println("Результат eq3: " + mth.eq3(10, 20, 37));
        System.out.println();

        MathTest tst1 = new MathTest();
        tst1.runTests();
    }
}