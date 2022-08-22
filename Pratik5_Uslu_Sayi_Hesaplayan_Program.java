import java.util.Scanner;

public class Pratik5_Uslu_Sayi_Hesaplayan_Program {
    public static void main(String[] args) {
        /* while dongusu;
        int n, k;
        Scanner scn = new Scanner(System.in);
        System.out.print("Ussu Alinacak Sayi :");
        n = scn.nextInt();
        System.out.print("Us Olacak Sayi :");
        k = scn.nextInt();

        int total = 1;
        // 3^4 = 3*3*3*3
        int i = 1;
        while (i <= k){
            total *= n;
            i++;
        }
        System.out.print(total); */

        // For Dongusu;

        int n;
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Ussu alinacak sayi :");
        n = input.nextInt();
        System.out.print("Us olacak sayi :");
        k = input.nextInt();
        int total = 1;
        for(int i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println(total);
    }
}
