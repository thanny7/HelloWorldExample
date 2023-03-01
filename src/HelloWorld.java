import java.util.Scanner;

public class HelloWorld {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Give input:");
        String name = s.next();
        System.out.printf("Hello %s", name);
    }

}
