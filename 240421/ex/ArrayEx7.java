package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("몇 명의 학생에게 점수를 입력받으시겠습니까 : ");
        int count = input.nextInt();
        int[] students = new int[count];
        String[] subjects = {"국어", "영어", "수학"};
        int[] numbers = new int[subjects.length];
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요 : ");
            for (int n = 0; n < subjects.length; n++) {
                System.out.print(subjects[n] + "점수 : ");
                numbers[n] = input.nextInt();
                sum += numbers[n];
            }
        }
        for (int t = 0; t < students.length; t++) {
            double average = (double) sum / subjects.length;
            System.out.println((students[t] + 1) + "번 학생의 총점 : " + sum + ", 평균 : " + average);
        }
    }
}
