public class dateTst {

    public void runTst() {
        tst.xassert(datex.isData(2000, 1, 1), true);
        tst.xassert(datex.isData(2000, 1, -1), false);
        tst.xassert(datex.isData(2000, -1, 1), false);
        tst.xassert(datex.isData(-1, 1, 1), false);
    }
}