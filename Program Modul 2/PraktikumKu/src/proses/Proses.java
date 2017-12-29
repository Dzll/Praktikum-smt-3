package proses;

public class Proses{
    protected String p;
    protected int hasil, es;
    protected float n;
    public Proses(float n){
        this.n = n;
    }  
    public Proses(int es, String p){
        this.es = es;
        this.p = p;
    }
    public float getN(){
        return n;
    }	
}
