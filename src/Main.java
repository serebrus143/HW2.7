import java.util.*;



public class Main {

    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("abc", "abc", "bcd", "bcd", "e"));

    public static void main(String[] args) {
        task4();
    }

    public static void task1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        Collections.sort(nums);

        int prevNum = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num % 2 != 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num;
            }
        }
    }

    public static void task3() {
        Set<String> uniqueWords = new MashSet<>(words);
        System.out.println(uniqueWords);
    }

    public static void task4() {
        Set<String> uniqueWords = new MashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());
    }
}