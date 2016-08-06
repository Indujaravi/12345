import java.util.Scanner;
public class days {
    public static void main(String[] args) {
       String s,s1="sunday";
        System.out.println("enter the day");
       Scanner sc=new Scanner(System.in);
       s=sc.nextLine();
       if(s1.equalsIgnoreCase(s))
       {
           System.out.println("FALSE");
       }
       else
       {
           System.out.println("true");
       }
    }
    
}
