package loop.ex;

public class NestedEx1 {
    public static void main(String[] args) {
        int last = 9;
        for(int start = 2; start <= last; start++) {
            System.out.println();
            System.out.println("구구단 " + start + "단");
            for(int i = 1; i <= last; i++) {
                System.out.println(start + " x " + i + " = " + start*i);
            }
        }
    }
}
