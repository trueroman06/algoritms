public class MathTest {
    private Mth math = new Mth();

    public void runTests() {
        System.out.println("--- Тестирование sum3 ---");
        // Вызываем static метод через имя класса tst
        tst.xassert(math.sum3(10, 20, 37), 67);
        tst.xassert(math.sum3(0, 0, 0), 0);
        tst.xassert(math.sum3(-5, -3, 5), -3);
        tst.xassert(math.sum3(333333, 333333, 333333), 999999);

        System.out.println("\n--- Тестирование eq3 ---");
        tst.xassert(math.eq3(1, 1, 1), 1);
        tst.xassert(math.eq3(0, 3726, 93218), 0);
        tst.xassert(math.eq3(1, 2, 3), 6);
        tst.xassert(math.eq3(20, 1, 5), 100);
    }
}