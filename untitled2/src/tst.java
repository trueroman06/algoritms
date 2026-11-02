public class tst {
    public static void xassert(boolean fn, boolean rig) {
        if (fn == rig) {
            System.out.println("совпадает");
        } else {
            System.out.println("неверно");
        }
    }
    public static void xassert(int fn, int rig) {
        if (fn == rig) {
            System.out.println("совпадает");
        } else {
            System.out.println("неверно");
        }
    }
}
