package JossLaundry;

import java.io.IOException;
import java.util.Scanner;
public class login extends registrasi{
    protected int detect = 0, n;
    protected float jumlah, bayar, kembali, harga = 0,total;
    registrasi r = new registrasi();
    Thread t = Thread.currentThread();
    public login() throws InterruptedException{
        System.out.print("Username : ");
        nama = in.nextLine();
        System.out.print("Password : ");
        nohp = in.nextLine();
        super.register(metode, harga, total, jumlah, kembali, bayar);
    }       
}