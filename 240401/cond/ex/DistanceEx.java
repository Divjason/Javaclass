package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 10;
        String vehicle = "";

        if(distance <= 1) {
            vehicle = "도보를 이용하세요.";
        } else if(distance <= 5) {
            vehicle = "자전거를 이용하세요.";
        } else if(distance <= 25) {
            vehicle = "자동차를 이용하세요.";
        } else if(distance <= 150) {
            vehicle = "비행기를 이용하세요.";
        }

        System.out.println(vehicle);
    }
}
