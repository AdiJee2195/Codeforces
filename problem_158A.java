import java.util.*;

public class problem_158A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int tn = a[k-1];
        int count = 0;

        for (int i = 0; i < n; i++){
            if( a[i] >= tn && a[i] != 0){
                count++;
            }
        }

        System.out.println(count);

    }
}