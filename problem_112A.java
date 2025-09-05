import java.util.*;

public class problem_112A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
        int n = a.compareTo(b);
        if ( n < 0 )  System.out.println("-1");
        else if ( n == 0 ) System.out.println("0");
        else System.out.println("1");
    }
}