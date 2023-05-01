import java.util.Scanner;


public class javaDongu {
    public static void main(String[] args) {

        int k;

        Scanner input = new Scanner(System.in);

        System.out.print("bir sayı giriniz:");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if ( i % 3 == 0 && i % 4 == 0){
                System.out.println(i);

            }

        }
        }
    }
