package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증가시키고, 그 결과물을 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        // 후위 증감 연산자 사용 예
        a = 1;
        b = 0;

        b = a++; // a의 현재값을 b에 먼저 대입하고, 그 후 a값을 증가시킴
        System.out.println("a = " + a + ", b = " + b);
        
        // 대입연산자가 없는 상태에서 증감연산자만 사용하는 경우, 전위 & 후위 모두 같은 결과값
        ++a;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
    }
}
