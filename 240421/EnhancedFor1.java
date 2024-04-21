package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for 문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        // 향상된 for 문
        for (int number : numbers) {
            System.out.println(number);
        }

        // 증가하는 index 값이 필요한 경우, 향상된 for문 사용불가!
    }
}
