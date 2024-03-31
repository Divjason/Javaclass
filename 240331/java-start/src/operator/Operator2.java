package operator;

public class Operator2 {
    public static void main(String[] args) {

        // 문자열과 문자열 더하기1
        String result1 = "hello " + "world";
        System.out.println(result1);

        // 문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자 더하기1
        // => 문자열과 숫자를 더하면, 해당 숫자도 문자로 형변환 됨
        // => 문자열에 무엇을 더하든 무조건 다 문자열이 됨
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        // 문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}
