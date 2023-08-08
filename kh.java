
public class kh {

    public static void main(String[] args) {
        int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        int min = mas[0];
        int max = mas[0]; ;
        for (int i = 0; i < mas.length; i++) {
            if (max < mas[i]);
            max = mas[i];
            if (min > mas[i]);
            max = mas[i];

        }
        System.out.println("Max is" + max);
        System.out.println("Min is" + min);
    }
}
