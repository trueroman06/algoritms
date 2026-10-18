
public class datex {
    private static final int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    public static boolean isData(int y, int m, int d){
                int maxDays = 0;
        if (y >= 0 && y < 10000){
            if(m > 0 && m <= 12){
                maxDays = daysInMonth[m];
                if (m == 2 && isLeapYear(y)){
                    maxDays = 29;
                }
                    if(d > 0 && d <= maxDays){
                    return true;
                }
            }
        }
        return false;

    }
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
