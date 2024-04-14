package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num01 = input.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num02 = input.nextInt();

        if(num01 > num02) {
            int temp = num01;
            num01 = num02;
            num02 = temp;

        }

        System.out.print("두 숫자 사이의 모든 정수 : " );
        for(int i = num01; i <= num02; i++) {
            System.out.print(i);
            if(i != num02) {
                System.out.print(",");
            }
        }
    }
}
