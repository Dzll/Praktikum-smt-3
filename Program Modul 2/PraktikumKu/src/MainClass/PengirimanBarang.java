package MainClass;

import proses.Proses;
import java.util.*;

public class PengirimanBarang {
    public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	jarak j = new jarak();
        int hasils = 0;
        int hasilp = 0;
        int a;
        System.out.println("--DATA PENGIRIMAN BARANG--");
        System.out.println();
        System.out.print("Jumlah Barang           : ");
        int jum = in.nextInt();
        Proses[] obj = new Proses[90];
        for(a=0;a<jum;a++){
            System.out.print("Berat Barang ke- " + (a+1) + "      : ");
            float n = in.nextFloat();
            obj[a] = new Proses(n);
        }
        System.out.println("Estimasi Pengiriman");
        System.out.println("1. Surabaya - Bangkalan : RP. 5.000 ");
        System.out.println("2. Surabaya - Sidoarjo  : RP. 4.000 ");
        try{
        System.out.print("-> Pilih  : ");
        int es = in.nextInt();
        hasils = j.jarak(es);
        	
        System.out.println("Jenis Pengiriman");
        System.out.println("A. REG    : Rp. 2.000 ");
        System.out.println("B. KILAT  : RP. 4.000 ");
        System.out.print("-> Pilih  : ");
        String p = in.next();
        hasilp = j.jenis(p);
        
        int has = 0;
        System.out.println("Nama Kurir              : Maemunah");
        System.out.println("--------------------------------------------------");
        for(a=0;a<jum;a++){
            has += obj[a].getN() * 1000;
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
    }
}
