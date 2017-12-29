package MainClass;

class jarak extends over{
    int hasil;
    public int jarak(int pilih){
    	if(pilih==1){
    		 hasil = 5000;
    	}
    	if(pilih==2){
    		hasil = 4000;
    	}
    	return hasil;
    }
    
    public int jenis(String p){
    	if(p.equals("a")){
        hasil = 2000;
        }else if(p.equals("b")){
       	hasil = 4000;
        }
        return hasil;
    }
}