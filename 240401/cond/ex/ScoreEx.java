package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 90;
        String grade = "";

        if(score >= 90) {
            grade = "A";
        } else if(80 <= score && score < 90) {
            grade = "B";
        } else if(70 <= score && score < 80) {
            grade = "C";
        } else if(60 <= score && score < 70) {
            grade = "D";
        } else if(60 > score) {
            grade = "F";
        }

        System.out.println(grade + "학점 입니다");
    }
}
