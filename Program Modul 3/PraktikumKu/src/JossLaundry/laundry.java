package JossLaundry;

abstract class laundry {
    protected String nama, alamat, nohp;
    protected float metode;
    protected void register(String nama, String alamat, String nohp){
        this.nama = nama;
        this.alamat = alamat;
        this.nohp = nohp;
    }
}
