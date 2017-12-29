package MainClass;
import proses.varr;

class over extends varr{
    public over(float n){ //Overloading
        this.n = n;
    }
    public int over(int es){ //Overloading
    	if(es==1){
            this.hasil = 5000;
    	}
    	if(es==2){
            this.hasil = 4000;
    	}
    	return hasil;
    }
    public int over(String p){ //Overloading
    	if(p.equals("a")){
            this.hasil = 2000;
        }else if(p.equals("b")){
            this.hasil = 4000;
        }
        return hasil;
    }
    public float getN(){
        return n;
    }	
}