public class sumTst {

    public void runTst() {
        tst.xassert(xsum.xxsum(new int[] { 1, 2, 3, 4, 5 }), 15);
        tst.xassert(xsum.xxsum(new int[] { 1, 2, 3, 4, 5, 6 }), 21);
        tst.xassert(xsum.xxsum(new int[] { 1, 6, -7 }), 0);
        tst.xassert(xsum.xxsum(new int[] { -1, -2, -3 }), -6);
        tst.xassert(xsum.xxsum(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 123, 12, 34, 35, 345, 23, 4, 13, 4, 2, 34 }),
                684);
    }
}