package cond.ex;

public class MoveRateEx {
    public static void main(String[] args) {
        double rating = 8;
        String movie01 = "'어바웃 타임'";
        String movie02 = "'토이 스토리'";
        String movie03 = "'고질라'";
        
        if(rating <= 9) {
            System.out.println(movie01 + "을 추천합니다.");
        }
        if(rating <= 8) {
            System.out.println(movie02 + "을 추천합니다.");
        }
        if(rating <= 7) {
            System.out.println(movie03 + "을 추천합니다.");
        }
    }
}
