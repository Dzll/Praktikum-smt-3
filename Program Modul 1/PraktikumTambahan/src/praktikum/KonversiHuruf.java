/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.util.Scanner;
/**
 *
 * @author Dzulkarnain Inc
 */
abstract class parent{
    abstract void kalimat();
}
class input extends parent{
    Scanner in = new Scanner(System.in);
    String kal;
    void kalimat(){
        System.out.print("Masukkan Kalimat : ");
	this.kal = in.nextLine();
    }
}
class uppercase {
    String up;
    public uppercase(String up){
	this.up = up;
    }
}
class lowercase extends input{
    void low(){
	System.out.println();
	System.out.println("2. lowerCase");
        kalimat();
	String hasil = this.kal.toLowerCase();
	System.out.println("Hasil : " + hasil);
    }
}
class sentence extends input{
    void sen(){
        System.out.println();
	System.out.println("3. Sentence case");
        kalimat();
        this.kal = this.kal.toLowerCase();
        char ch[] = this.kal.toCharArray();
        System.out.print("Hasil : ");
        System.out.print((char) (ch[0] - 32));
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] == ' ') {
                System.out.print(" " + (char) (ch[i + 1]));
                i++;
                continue;
            }
            System.out.print(ch[i]);
        }
        System.out.println();
    }
}
class capital extends input{
    void cap(){
	System.out.println();
	System.out.println("4. Capitalize Every Word");
	kalimat();
        this.kal = this.kal.toLowerCase();
        char ch[] = this.kal.toCharArray();
        System.out.print("Hasil : ");
        System.out.print((char) (ch[0] - 32));
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] == ' ') {
                System.out.print(" " + (char) (ch[i + 1] - 32));
                i++;
                continue;
            }
            System.out.print(ch[i]);
        }
        System.out.println();
    }
}
class toggle extends input{
    void tog(){
	System.out.println();
	System.out.println("5. tOGGLE cASE");
	kalimat();
        this.kal = this.kal.toUpperCase();
        char ch[] = this.kal.toCharArray();
        System.out.print("Hasil : ");
        System.out.print((char) (ch[0] + 32));
        for (int i = 1; i < ch.length; i++) {
            if(ch[i] == ' ') {
                System.out.print(" " + (char) (ch[i + 1] + 32));
                i++;
                continue;
            }
            System.out.print(ch[i]);
        }
        System.out.println();
    }
}
public class KonversiHuruf{
    public static void main(String args[]){
	Scanner in =  new Scanner(System.in);
	int pil;
	String back;
	do{
        System.out.println();
	System.out.println(" - KONVERSI HURUF - ");
	System.out.println();
	System.out.println("1. UPPERCASE");
	System.out.println("2. lowerCase");
	System.out.println("3. Sentence case");
	System.out.println("4. Capitalize Every Word");
	System.out.println("5. tOGGLE cASE");
	System.out.print("Pilih Menu -> ");
	pil = in.nextInt();
        if(pil == 1){
            System.out.println();
            System.out.println("1. UPPERCASE");
            input n = new input();
            n.kalimat();
            String hasil = n.kal.toUpperCase();
            System.out.println("Hasil : " + hasil);
	 }else if(pil == 2){
            lowercase l = new lowercase();
            l.low();
	}else if(pil == 3){
            sentence s = new sentence();
            s.sen();
	}else if(pil == 4){
            capital c = new capital();
            c.cap();
	}else if(pil == 5){
            toggle t = new toggle();
            t.tog();
	}else{
            System.out.println("Inputan Salah!!");
	}
        System.out.print("Kembali ke Menu ? (y/t) : ");
	back = in.next();
	}while(back.equals("y") || back.equals("Y"));
    }
}

