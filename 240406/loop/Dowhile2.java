package loop;

public class Dowhile2 {
    public static void main(String[] args) {
        // do-while문은 최초 한 번은 무조건 코드 블럭을 꼭 실행해야 하는 경우에 사용!
        int i = 10;
        do {
            System.out.println("현재 숫자는 : " + i);
            i++;
        } while (i < 3);
    }
}
