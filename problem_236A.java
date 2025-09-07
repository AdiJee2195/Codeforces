import java.util.*;

public class problem_236A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        String test = "1";
        for (int i = 0 ; i < n ; i++){
            if (test.contains(String.valueOf(s.charAt(i)))){
                continue;
            }
            else{
                test += String.valueOf(s.charAt(i));
            }
        }
        int m = test.length() - 1;
        if ( m % 2 == 0 ) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");

        sc.close();

    }
}