import java.util.*;

public class problem_71A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++){
            words[i] = sc.next();}
        for (String word : words){
            if (word.length() > 10 ) {
                char fl = word.charAt(0);
                char ll = word.charAt(word.length() - 1);
                int c = word.length()-2;
                System.out.println(fl + Integer.toString(c) + ll);
            }
            else{
                System.out.println(word);
            }
        }
        
    }
}