package StopWatchKu;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Runnable;
import java.io.IOException;
public class WatchProses extends Komponen implements Runnable{
    
    public WatchProses(){
        t = new Thread(this);
        reset();
    }
    private void reset(){
        hcnt=0;mcnt=0;scnt=0;cnt2=0;
        nstr="00:00:00";mstr="00:00:00";dstr="";
        display();
    }
    private void display(){
        time1.setText(nstr);
    }
    private void setMTimeCounter(){
        dstr+=time1.getText();
        time2.setText(dstr);
    }
    public void run(){
        try{
            while(true){
                scnt++;
                if(scnt>59){
                    scnt=0;
                    mcnt++;
                }
                if(mcnt>59){
                    mcnt=0;
                    hcnt++;
                }
                if(hcnt>99){
                    reset();
                }
                super.setTimeCounter();
                display();
                Thread.sleep(16);
            }
        }catch(Exception e){
            System.out.println();
        }
    }
    private void printToList(){
        cnt2++;
        char []hr = new char [2];
        char []mn = new char [2];
        char []sec = new char [2];
        int counter = 0;
        for (int a = 0 ; a<time1.getText().length();a++)
        {
            if(time1.getText().charAt(a)==':')
            { 
               if(counter==0)
               {   
                    hr[0] =time1.getText().charAt(a-2);
                    hr[1] =time1.getText().charAt(a-1);
                    counter++;
               }
               else if (counter==1)
               {
                    mn[0] =time1.getText().charAt(a-2);
                    mn[1] =time1.getText().charAt(a-1);
                    sec[0] =time1.getText().charAt(a+1);
                    sec[1] =time1.getText().charAt(a+2);
                    counter++;
               }
            }
        }
        int hour = Integer.parseInt(new String(hr));
        int minute = Integer.parseInt(new String(mn));
        int second = Integer.parseInt(new String(sec));
        counter = 0;
        for (int a = 0 ; a<timex.length();a++)
        {
            if(timex.charAt(a)==':')
            {
               if(counter==0)
               {   
                    hr[0] =timex.charAt(a-2);
                    hr[1] =timex.charAt(a-1);
                    counter++;
               }
               else if (counter==1)
               {
                    mn[0] =timex.charAt(a-2);
                    mn[1] =timex.charAt(a-1);
                    sec[0] =timex.charAt(a+1);
                    sec[1] =timex.charAt(a+2);
                    counter++;
               }
            }
        }
        int hour2 = Integer.parseInt(new String(hr));
        int minute2 = Integer.parseInt(new String(mn));
        int second2 = Integer.parseInt(new String(sec));
        int hour3 = hour - hour2;
        int minute3 = minute - minute2;
        int second3 = second -second2;
        if (second3 <0)
        {
            second3 = 60 +second3;
            minute3--;
        }
        if (minute3 <0)
        {
            minute3 = 60 +minute3;
            hour3--;
        }
        /*System.out.println("sebelum = "+hour2+":"+minute2+":"+second2);
        System.out.println("sesudah = "+hour+":"+minute+":"+second);
        System.out.println("selesih = "+hour3+":"+minute3+":"+second3);*/
        /*if(second3%2 == 0){
            ooo = "Genap";
        }else{
            ooo="Ganjil";
        }*/
        dstr+="Lap " + cnt2 + " - Elapsed Time : " + time1.getText() + " - Lap Time : " + (hour3+":"+minute3+":"+second3) + "\n";
        text.setText(dstr);
    }
    private void errore(){
        err += " KLIK START UNTUK MEMULAI. \n";
        text.setText(err);
        text.setForeground(new Color(255, 247, 33));
    }
    public void Stopwatch(){
        label1.setBounds(10, 10, 100, 20);
        label2.setBounds(10, 40, 100, 20);
        label3.setBounds(10, 100, 100, 20);
        time1.setBounds(120, 10, 100, 20);
        time1.setForeground(Color.BLUE);
        time2.setBounds(120, 40, 100, 20);
        start.setBackground(Color.GREEN);
        start.setBounds(420, 10, 150, 30);
        split.setBackground(new Color(43, 212, 255));
        split.setBounds(420, 40, 150, 30);
        reset.setBackground(Color.RED);
        reset.setBounds(420, 70, 150, 30);
        reset.setForeground(Color.WHITE);
        lap.setBackground(Color.YELLOW);
        lap.setBounds(420, 100, 150, 30);
        text.setBounds(10, 140, 562, 200 );
        text.setBackground(new Color(91, 0, 13));
        start.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(start.getText().equals("Start") || start.getText().equals("Resume")){
                    start.setText("Pause");
                    cnt++;
                    if(cnt==1){
                        t.start();
                    }else{
                       t.resume();
                    }
                }else{
                    start.setText("Resume");
                    t.suspend();
                    text.setForeground(Color.WHITE);
                }
            }
        });
        split.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    time2.setText(time1.getText());
                    //System.out.println(time2.getText());
                    CheckError();
                }catch(Exception ex){
                    errore();
                }
            }
        });
        
        reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                reset();
                t.suspend();
                start.setText("Start");
                time2.setText("");
                text.setText("");
            }
        });
        lap.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    printToList();
                    timex = time1.getText();
                    text.setForeground(Color.WHITE);
                    CheckError();
                }catch(Exception ex){
                    errore();
                }
            }
        });
        add(label1);
        add(label2);
        add(label3);
        add(time1);
        add(time2);
        add(start);
        add(split);
        add(reset);
        add(lap);
        add(text);
        setTitle("Stopwatch Canggih - By : Wafi Dzulkarnain");
        setSize(600, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    protected void CheckError() throws IOException{ 
        if(time1.getText().equals("00:00:00")){
            throw new IOException();
        }    
    }
}
