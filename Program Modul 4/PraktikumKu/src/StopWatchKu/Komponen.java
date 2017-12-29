package StopWatchKu;
import javax.swing.*;
public class Komponen extends JFrame{
    JLabel label1 = new JLabel("Stopwatch : ");
    JLabel label2 = new JLabel("Split   :");
    JLabel label3 = new JLabel("Laps");
    JLabel time1 = new JLabel();
    JLabel time2 = new JLabel();
    JButton start = new JButton("Start");
    JButton split = new JButton("Split");
    JButton reset = new JButton("Reset");
    JButton lap = new JButton("Lap");
    String timex = "00:00:00";
    JTextPane text = new JTextPane();
    protected int i=0;
    protected Thread t;
    protected int hcnt=0,mcnt=0,scnt=0;
    protected String nstr="",mstr="",dstr="",err="", ooo="";
    protected int cnt=0,cnt2=0;
    protected void setTimeCounter(){
        nstr="";
        if(hcnt<10){
            nstr="0" + hcnt;
        }else{
            nstr="" + hcnt;
        }
        
        if(mcnt<10){
            nstr+=":0" + mcnt;
        }else{
            nstr+=":" + mcnt;
        }
        
        if(scnt<10){
            nstr+=":0" + scnt;
        }else{
            nstr+=":" + scnt;  
        }
    }
}
