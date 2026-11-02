
public class datex{
    private static final int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    public static boolean isData(int y, int m, int d){
                int maxDays = 0;
        if (!(y >= 1 && y <= 10000)){
            return false;
        }
        if(!(m >= 1 && m <= 12)){
            return false;
        }
        maxDays = daysInMonth[m-1];
        if (m == 2 && isLeapYear(y)){
            maxDays = 29;
        }
        if(!(d >= 1 && d <= maxDays)){
            return false;
        }
        return true;

    }
    private static boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
