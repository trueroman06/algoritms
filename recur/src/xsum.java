import java.util.Arrays;

public class xsum {

    public static int xxsum(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int[] rest = Arrays.copyOfRange(numbers, 1, numbers.length);
        return numbers[0] + xxsum(rest);
    }
}
    