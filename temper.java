import java.util.Scanner;

public class temper {
    public static void main(String[] args){
        Scanner temper = new Scanner(System.in);
        System.out.println("write temperature on street:");
        int t = temper.nextInt();
                if (t > -5) {
                    System.out.print("warm");
                }
                else if (t <= -5 & t >-20){
                    System.out.print("normal");
                }
                else if (t <= -20){
                    System.out.print("cold");
                }
    }
}
