import java.util.*;

public class problem_231A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nq = sc.nextInt();
        int count = 0;
        int solve = 0;
        for (int i = 0; i < nq; i++){
            for (int j = 0; j < 3; j++){
                    int m = sc.nextInt();
                    if (m == 1) count++;
                 }
            if (count >= 2) solve++;
            count = 0;
        }
        System.out.println(solve);
    } 

}
