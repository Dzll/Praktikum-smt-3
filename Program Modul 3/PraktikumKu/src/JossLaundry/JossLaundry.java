package JossLaundry;
/**
 * Author By Wafi Dzulkarnain
 * Copyright 2017 | Dzulkarnain INC
 */
import java.util.Scanner;
public class JossLaundry {
    public static void main(String args[]) throws InterruptedException{
        Scanner in = new Scanner(System.in);
        int p;
        String back = "y", nama = "", alamat = "", nohp = "";
        do{
        System.out.println();
        System.out.println("-------- FORM -------");
        System.out.println("1. Registrasi");
        System.out.println("2. Login");
        System.out.println("---------------------");
        System.out.print("Pilih -> ");
        p = in.nextInt();
        switch(p){
            case 1: registrasi reg = new registrasi();
                    reg.register(nama, alamat, nohp);
                break;
            case 2: login log = new login();
                break;
            default:
                System.out.println("Inputan Salah !!");
        }
        System.out.print("Ingin Kembali ke Awal ? (y/n) : ");
        back = in.next();
        }while(back.equals("y"));
        
    }
}
