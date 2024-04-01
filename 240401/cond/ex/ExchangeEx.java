package cond.ex;

public class ExchangeEx {
    public static void main(String[] args) {
        int dollar = 10;
        int curr = 1300;
        int exchange = dollar * curr;

        if(dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if(dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else if(dollar >= 10) {
            System.out.println("환전할 금액은 " + exchange + "원 입니다.");
        }
    }
}
