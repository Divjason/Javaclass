package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int count = input.nextInt();

        int[] numbers = new int[count];
        int minNum, maxNum;
        System.out.println(count + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        minNum = maxNum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < minNum) {
                minNum = numbers[i];
            }
            if(numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }
        System.out.println("가장 작은 정수 : " + minNum);
        System.out.println("가장 큰 정수 : " + maxNum);
    }
}
