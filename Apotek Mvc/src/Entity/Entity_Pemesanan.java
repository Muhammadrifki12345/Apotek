package Entity;

public class Entity_Pemesanan {
//    private Entity_Pelanggan pelanggan;
//    private Entity_Obat obat;
    private int no_pesan, jumlah, total = 0;
    private String tanggal;
    
    public Entity_Pemesanan(int no_pesan, int jumlah, int total, String tanggal) {
        this.no_pesan = no_pesan;
        this.jumlah = jumlah;
        this.total = total;
        this.tanggal = tanggal;
    }

//    public void setPelanggan(Entity_Pelanggan pelanggan) {
//        this.pelanggan = pelanggan;
//    }
//
//    public void setObat(Entity_Obat obat) {
//        this.obat = obat;
//    }

    public void setNo_pesan(int no_pesan) {
        this.no_pesan = no_pesan;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

//    public Entity_Pelanggan getPelanggan() {
//        return pelanggan;
//    }
//
//    public Entity_Obat getObat() {
//        return obat;
//    }

    public int getNo_pesan() {
        return no_pesan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getTotal() {
        return total;
    }

    public String getTanggal() {
        return tanggal;
    }
}
