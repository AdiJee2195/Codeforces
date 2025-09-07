import java.util.*;

public class problem_339A{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if (s.contains(String.valueOf("+"))){
                String[] t = s.split("\\+");
                Arrays.sort(t);
                for (int i = 0 ; i < t.length ; i++){
                    System.out.print(t[i]);
                    if ( i < (t.length-1)) System.out.print("+");
                }

            }
            else System.out.print(s);
                }
    }
