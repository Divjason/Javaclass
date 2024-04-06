package loop.ex;

import loop.Break1;

public class WhileEx2 {
    public static void main(String[] args) {
//        int num = 2;
//        int repeat = 1;
//
//        while (repeat <= 10) {
//            System.out.println(num);
//            num += 2;
//            repeat++;
        int num = 2;
        for(int repeat = 1; repeat <= 10; repeat++) {
            System.out.println(num);
            num += 2;
        }
    }
}
