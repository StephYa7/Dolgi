public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {0, 3, 5, 8, 11, 14, 18, 23, 31, 32, 33, 39, 55};

        System.out.println(search(numbers, 55));
    }

    private static int search(int[] numbers, int i) {
        return search(numbers, i, 0, numbers.length - 1);
    }

    private static int search(int[] numbers, int i, int start, int end) {
        if (end < start) {
            return -1;
        }
        int middle = start + (end - start) / 2;
        if (i == numbers[middle]) return middle;
        else if (i > numbers[middle]) {
            start = middle + 1;
        } else end = middle - 1;
        return search(numbers, i, start, end);
    }

}