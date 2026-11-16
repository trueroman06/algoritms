int xsum(int[] numbers) {
    if (numbers.length == 0) {
        return 0;
    } else {
        int[] rest = new int[numbers.length - 1];
        for (int i = 1; i < numbers.length; i++) {
            rest[i - 1] = numbers[i];
        }
        return numbers[0] + xsum(rest);
    }
}

void main() {
    int[] numbers = { 1, 2, 3, 4, 5 };
    IO.println(xsum(numbers));
}