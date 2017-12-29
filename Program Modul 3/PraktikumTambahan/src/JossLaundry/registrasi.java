package JossLaundry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class registrasi extends laundry{
    Scanner in = new Scanner(System.in);
    protected float bayar, total;
    protected int detect = 0, n;
    public static ArrayList<String> arrNama = new ArrayList<String>();
    public static ArrayList<String> arrAlamat = new ArrayList<String>();
    public static ArrayList<String> arrNomer = new ArrayList<String>();
    public static int countArr = 0;
    protected void register(String nama, String alamat, String nohp){
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
    protected void register(float metode, float harga, float total, float jumlah, float kembali, float bayar) throws InterruptedException{
                for(int i = 0; i < countArr; i++){
            		if(nama.equals(arrNama.get(i)) && nohp.equals(arrNomer.get(i))){
		                System.out.print("Jumlah Cucian (kg) : ");
		                jumlah = in.nextFloat();
		                System.out.println("------------------------------");
		                System.out.println("1. Cuci Basah  : Rp. 3000/kg");
		                System.out.println("2. Cuci Kering : Rp. 5000/kg");
		                System.out.println("------------------------------");
		                System.out.print("Pilih -> ");
		                metode = in.nextInt();
		                if(metode == 1){
		                    harga = 3000;
		                }else if(metode == 2){
		                    harga = 5000;
		                } 
            		}
				}
                System.out.println("------------------------------");
                try{
                    for(int n=5 ; n>0; n--){
                        if (n==5){
                            System.out.println("Sedang Menghitung Total Biaya");
                        }else if(n==4){
                            System.out.println("Sedang Menghitung Total Biaya");
                        }else if(n==3){
                            System.out.println("Sedang Menghitung Total Biaya");
                        }else if(n==2){
                            System.out.println("Sedang Menghitung Total Biaya");
                        }else if(n==1){
                            System.out.println("Sedang Menghitung Total Biaya");
                        }
                        Thread.sleep(1000);
                    }
                    System.out.println("------------------------------");
                    total = jumlah * harga;
                    System.out.println("TOTAL BIAYA : Rp." + total);
                    System.out.println("------------------------------");                    
                    System.out.print("Bayar : Rp.");
                    bayar = in.nextFloat();
                    detect = 1;
                    CheckError(bayar);
                    if(bayar > total){
                        kembali = bayar - total;
                        System.out.println("*Kembali    : Rp." + kembali + ",-");
                    }else if(bayar < total){
                    	kembali = total - bayar;
                    	System.out.println("Uang bayar Kurang : Rp." + kembali);
                    }
                    else{
                        System.out.println("*Kembali    : Rp.0,-");
                    }
                    
                }catch(IOException e){
                    System.err.println("UANG YANG DIBAYARKAN KURANG : " + e.getMessage());
                }
                
		if(detect == 0){
	            System.err.println("Username dan Password salah!");
		}
    }
    public void CheckError(float bayar) throws IOException{ 
        if(bayar < total){
            throw new IOException("Rp." + (total-bayar));
        }
    }
}
