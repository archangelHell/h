import java.util.Scanner;
public class hello{
    static String name = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is ur name?");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}
