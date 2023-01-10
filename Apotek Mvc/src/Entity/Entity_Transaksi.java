package Entity;

public class Entity_Transaksi {
    private int id_transaksi, id_kasir, total = 0;
    private String tanggal;

    public Entity_Transaksi(int id_transaksi, String tanggal, int id_kasir, int total) {
        this.id_transaksi = id_transaksi;
        this.tanggal = tanggal;
        this.id_kasir = id_kasir;
        this.total = total;
    }

    public void cetak() {
        System.out.println("Id_Transaksi : " + this.id_transaksi);
        System.out.println("Tanggal      : " + this.tanggal);
        System.out.println("Id_Kasir     : " + this.id_kasir);
        System.out.println("Total        : " + this.total);
        System.out.println("------------------------------");
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getId_transaksi() {
        return id_transaksi;
    }
}
