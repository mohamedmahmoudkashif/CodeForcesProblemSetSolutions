import java.util.Scanner;
public class Main{
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);  
         String word = sc.nextLine();
         String s = word.substring(0, 1).toUpperCase() + word.substring(1,word.length());
         System.out.println(s);
          
     }
}
