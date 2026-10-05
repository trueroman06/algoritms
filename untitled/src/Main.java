public class Main {
    public static void main(String[] args) {
        Mth math = new Mth();

        System.out.println("Результат sum3: " + math.sum3(10, 20, 37));
        System.out.println("Результат eq3: " + math.eq3(10, 20, 37));
        System.out.println();

        MathTest tester = new MathTest();
        tester.runTests();
    }
}