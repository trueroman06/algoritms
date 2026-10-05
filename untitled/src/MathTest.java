public class MathTest {
    private Mth math = new Mth();

    private void xassert(int fn, int rig) {
        if (fn == rig) {
            System.out.println("совпадает");
        } else {
            System.out.println("неверно");
        }
    }

    public void runTests() {
        System.out.println("--- Тестирование sum3 ---");
        xassert(math.sum3(10, 20, 37), 67);
        xassert(math.sum3(0, 0, 0), 0);
        xassert(math.sum3(-5, -3, 5), -3);
        xassert(math.sum3(333333, 333333, 333333), 999999);

        System.out.println("\n--- Тестирование eq3 ---");
        xassert(math.eq3(1, 1, 1), 1);
        xassert(math.eq3(0, 3726, 93218), 0);
        xassert(math.eq3(1, 2, 3), 6);
        xassert(math.eq3(20, 1, 5), 100);
        }
    }

