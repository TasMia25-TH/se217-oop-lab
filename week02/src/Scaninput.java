import java.util.Scanner;

public class Scaninput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.println("Enter value:");
        x = sc.nextInt();
        System.out.println("x=" + x);

        sc.close();
    }
    
}
