import java.util.Scanner;

public class luas_segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, t;
        double luas;
        
        System.out.print("masukkan alas :");
        a=input.nextInt();
        System.out.print("masukkan tinggi :");
        t=input.nextInt();
        
        luas=0.5*a*t;
        System.out.printf("luas segitiga :" +luas);
        }

}
