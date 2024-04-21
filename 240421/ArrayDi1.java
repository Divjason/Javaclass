package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int[] num = {1, 2, 3, 4, 5, 6};
        int i = 0;

        for(int r = 0; r < num[1]; r++) {
            System.out.println();
            for(int c = 0; c < num[2]; c++) {
                System.out.print(arr[r][c] + num[i] + " ");
                i++;
            }
        }
    }
}

