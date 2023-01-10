package Entity;

public class Entity_Obat {
    private int kode, harga, stok;
    private String nama;
    
    public Entity_Obat(int kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getKode() {
        return kode;
    }

    public int getStok() {
        return stok;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
}
