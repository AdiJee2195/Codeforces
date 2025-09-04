import java.util.*;

public class problem_263A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[5][5];
        for (int i = 0 ; i < 5; i++){
            for (int j = 0; j < 5; j++){
                m[i][j] = sc.nextInt();
            }
        }
        int r = 0;
        for (int i = 0 ; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (m[i][j] == 1){
                    r = Math.abs(i-2) + Math.abs(j-2);
                }
            }
        }
        System.out.println(r);
    }
}