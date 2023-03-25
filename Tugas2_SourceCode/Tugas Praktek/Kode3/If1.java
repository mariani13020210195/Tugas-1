/* NIM      : 13020210195
Nama        : Mariani
Hari/Tgl    : Sabtu, 25 Maret 2023
Waktu       : 10:55  AM */
package Kode3;
/* contoh pemakaian IF satu kasus */
/* membaca nilai integer, menuliskan nilainya jika positif */

import java.util.Scanner;

public class If1 {

    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        Scanner masukan=new Scanner(System.in);
        int a;
        /* Program */

        System.out.print ("Contoh IF satu kasus \n");
        System.out.print ("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();
        if (a >= 0)
        System.out.print ("\nNilai a positif "+ a);
    
    }
    
}