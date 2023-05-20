import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int min = 0, max = 0;
        int ctrl;
        boolean flag = true;

        System.out.print(" Kaç sayı girmek istersiniz ? : ");
        n = input.nextInt();
        for (int i = 0; i <n; i++) {
        System.out.print(" Sayı giriniz : ");
        ctrl = input.nextInt();
        if (flag == true){
            min = ctrl;
            max = ctrl;
            flag = false;
        }
            if ( ctrl > max  ) {
                   max = ctrl;
            }
            if( ctrl < min ) {
                    min = ctrl;
            }
    }
        System.out.println(" max : "+ max);
        System.out.println(" min : "+ min);
}
}