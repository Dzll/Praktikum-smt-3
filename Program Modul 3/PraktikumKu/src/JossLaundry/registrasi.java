package JossLaundry;

import java.util.ArrayList;
import java.util.Scanner;
public class registrasi extends laundry{
    Scanner in = new Scanner(System.in);
    public static ArrayList<String> arrNama = new ArrayList<String>();
    public static ArrayList<String> arrAlamat = new ArrayList<String>();
    public static ArrayList<String> arrNomer = new ArrayList<String>();
    public static int countArr = 0;
    public void register(String nama, String alamat, String nohp){
        System.out.println("---------------------");
        System.out.print("Nama    : ");
        nama = in.nextLine();
	this.arrNama.add(nama);
        System.out.print("Alamat  : ");
        alamat = in.nextLine();
	this.arrAlamat.add(alamat);
        System.out.print("No.Hp   : ");
        nohp = in.nextLine();
	this.arrNomer.add(nohp);
        countArr++; 
    }
    public void register(float metode){
        this.metode = metode;
    }
    
}
