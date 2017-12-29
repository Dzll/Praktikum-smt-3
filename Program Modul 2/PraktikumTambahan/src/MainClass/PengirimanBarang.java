package MainClass;

import proses.varr;
import java.util.*;
import java.lang.NullPointerException;

public class PengirimanBarang {
    public static void main (String[] args){
	Scanner in = new Scanner(System.in);
        int hasils = 0;
        int hasilp = 0;
        int a;
        float n = 0;
        System.out.println("--DATA PENGIRIMAN BARANG--");
        System.out.println();
        System.out.print("Jumlah Barang           : ");
        try{                                // Exception Handling Array
        int jum = in.nextInt();
        over[] obj = new over[3];
        for(a=1;a<=jum;a++){
            System.out.print("Berat Barang ke- " + (a) + "      : ");
            n = in.nextFloat();
            obj[a] = new over(n);
        }
        System.out.println("Estimasi Pengiriman");
        System.out.println("1. Surabaya - Bangkalan : RP. 5.000 ");
        System.out.println("2. Surabaya - Sidoarjo  : RP. 4.000 ");
        try{
        System.out.print("-> Pilih  : ");
        int es = in.nextInt();
        over o = new over(es);
        hasils = o.over(es);
        	
        System.out.println("Jenis Pengiriman");
        System.out.println("A. REG    : Rp. 2.000 ");
        System.out.println("B. KILAT  : RP. 4.000 ");
        System.out.print("-> Pilih  : ");
        String p = in.next();
        hasilp = o.over(p);
        
        int has = 0;
        System.out.println("Nama Kurir              : Maemunah");
        System.out.println("--------------------------------------------------");
        for(a=0;a<jum;a++){
            has += n * 1000;
        }
        int total = has + hasils + hasilp;
        System.out.println("TOTAL BIAYA PENGIRIMAN  : Rp. " + total);
        System.out.println("--------------------------------------------------");
        System.out.println("Ket : ");
        System.out.println("*Berat : Rp. 1.000/kg");
        }
        catch (InputMismatchException es){
            System.out.println("Inputan Salah!");
        }
        }catch(ArrayIndexOutOfBoundsException jum){ // Exception Handling Array
            System.err.println("Melebihi Kapasitas Array");
        }
    }
}
