
package faktoriyel;

import java.util.Scanner;

public class Faktoriyel {

    public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
        System.out.println("sayı gir:");
        int sayi =k.nextInt();
      int fak=1;
        for (int i = 1; i <= sayi; i++) {
            fak=fak*i;
        }
        System.out.println("SONUÇ:"+fak);
}
}
    

