class Main {
    int sum3(int fr, int se, int tr) {
        return fr + se + tr;
    }

    void assert(int fn, int rig) {
        if (fn == rig) {
            System.out.println("совпадает");
        } else {
            System.out.println("неверно");
        }
    }

    void datachek() {
        assert(sum3(10, 20, 37), 67);
        assert(sum3(0, 0, 0), 0);
        assert(sum3(-5, -3, 5), -3);
        assert(sum3(333333, 333333, 333333), 999999);
    }

        static void main(String[] args) {
        Main app = new Main(); // так как методы sum3 и datachek не статичные, создаем объект
        System.out.println("inf");
        System.out.println(app.sum3(10, 20, 37));
        app.datachek();
    }
}