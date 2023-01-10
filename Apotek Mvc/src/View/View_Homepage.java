package View;
import java.util.Scanner;
import Entity.*;
import Controller.*;

public class View_Homepage {
    Scanner input = new Scanner(System.in);
    public Controller_Obat obat = new Controller_Obat();
    public Controller_Pegawai pegawai = new Controller_Pegawai();
    public Controller_Pelanggan pelanggan = new Controller_Pelanggan();
    public Controller_Pemesanan pemesanan = new Controller_Pemesanan();
    int index_pelanggan, index_obat;
    
    public View_Homepage() {}
    
    public void menu_login() {
        int pilihan;
        
        do {
            System.out.println("====================");
            System.out.println("     Menu Login     ");
            System.out.println("====================");
            System.out.println("1. Registrasi");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("--------------------");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();
            System.out.println("--------------------");
            
            switch(pilihan) {
                case 1 :
                    register();
                    break;
                case 2 :
                    input.nextLine();
                    System.out.print("No Id    : ");
                    String no_id = input.nextLine();
                    System.out.print("Password : ");
                    String password = input.nextLine();
                    System.out.println("--------------------");
                    login(no_id, password);
                    break;
                case 3 :
                    System.out.println("Anda Sudah Keluar");
                    System.out.println("-------------------- \n");
                    break;
                default :
                    System.out.println("Pilihan Tidak Ada");
                    System.out.println("-------------------- \n");
                    break;
            }
        } while(pilihan != 3);
    }
    
    public void register() {
        input.nextLine();
        System.out.print("No Id Pegawai    : ");
        String no_id = input.nextLine();
        System.out.print("Nama Pegawai     : ");
        String nama = input.nextLine();
        System.out.print("Alamat Pegawai   : ");
        String alamat = input.nextLine();
        System.out.print("Password Pegawai : ");
        String password = input.nextLine();
        pegawai.create(new Entity_Pegawai(no_id, nama, password));
        System.out.println("-------------------- \n");
    }
    
    public void login(String no_id, String password) {
        boolean cek_login = false;
        int i;
        
        for(i = 0; i < pegawai.m_pegawai.getDataPegawai().size(); i++) {
            if((no_id.equals(pegawai.m_pegawai.getDataPegawai().get(i).getNo_id())) && (password.equals(pegawai.m_pegawai.getDataPegawai().get(i).getPassword()))) {
                cek_login = true;
                break;
            } else {
                cek_login = false;
            }
        }
        
        if(cek_login) {
            System.out.println("Hallo " + pegawai.m_pegawai.getDataPegawai().get(i).getNama() + " Selamat Datang Di Apotek");
            System.out.println("-------------------- \n");
            menu_utama();
        } else {
            System.out.println("Maaf No Id Atau Password Salah");
            System.out.println("-------------------- \n");
        }
    }
    
    public void menu_utama() {
        int pilihan;
        
        do {
            System.out.println("====================");
            System.out.println("     Menu Utama     ");
            System.out.println("====================");
            System.out.println("1. Data Obat");
            System.out.println("2. Data Pelanggan");
            System.out.println("3. Data Pemesanan");
            System.out.println("4. Exit");
            System.out.println("--------------------");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();
            System.out.println("--------------------");
            
            switch(pilihan) {
                case 1 :
                    menu_obat();
                    break;
                case 2 :
                    menu_pelanggan();
                    break;
                case 3 :
                    menu_pemesanan();
                    break;
                case 4 :
                    System.out.println("Anda Sudah Keluar");
                    System.out.println("-------------------- \n");
                    break;
                default :
                    System.out.println("Pilihan Tidak Ada");
                    System.out.println("-------------------- \n");
                    break;
            }
        } while(pilihan != 4);
    }
    
    public void menu_obat() {
        int pilihan;
        
        do {
            System.out.println("");
            System.out.println("====================");
            System.out.println("      Menu Obat     ");
            System.out.println("====================");
            System.out.println("1. Create Obat");
            System.out.println("2. View Obat");
            System.out.println("3. Update Obat");
            System.out.println("4. Delete Obat");
            System.out.println("5. Exit");
            System.out.println("--------------------");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();
            System.out.println("--------------------");
            
            switch(pilihan) {
                case 1 :
                    create();
                    break;
                case 2 :
                    view();
                    break;
                case 3 :
                    update();
                    break;
                case 4 :
                    delete();
                    break;
                case 5 :
                    System.out.println("Anda Sudah Keluar");
                    System.out.println("-------------------- \n");
                    break;
                default :
                    System.out.println("Pilihan Tidak Ada");
                    System.out.println("--------------------");
                    break;
            }
        } while(pilihan != 5);
    }
    
    public void create() {
        try{
        System.out.print("Kode Obat  : ");
        int kode = input.nextInt();
        input.nextLine();
        System.out.print("Nama Obat  : ");
        String nama = input.nextLine();
        System.out.print("Harga Obat : ");
        int harga = input.nextInt();
        System.out.print("Stok Obat  : ");
        int stok = input.nextInt();
        obat.create(new Entity_Obat(kode, nama, harga, stok));
        System.out.println("--------------------");
        System.out.println("Data Obat Berhasil Disimpan");
        System.out.println("--------------------");
        }catch(Exception e){
            System.out.println(" data inputan tidak valid");
                 
        }
    }
    
    public void view() {
        if(obat.m_obat.getDataObat().size() > 0) {
            int no_urut = 0;
            for(int i = 0; i < obat.m_obat.getDataObat().size(); i++) {
                no_urut++;
                System.out.println("[Obat " + no_urut + "]");
                System.out.println("Kode Obat  : " + obat.m_obat.getDataObat().get(i).getKode());
                System.out.println("Nama Obat  : " + obat.m_obat.getDataObat().get(i).getNama());
                System.out.println("Harga Obat : " + obat.m_obat.getDataObat().get(i).getHarga());
                System.out.println("Stok Obat  : " + obat.m_obat.getDataObat().get(i).getStok());
                System.out.println("--------------------");
            }
        } else {
            System.out.println("Data Obat Kosong");
            System.out.println("--------------------");
        }
    }
    
    public void update() {
        if(obat.m_obat.getDataObat().size() > 0) {
            for(int i = 0; i < obat.m_obat.getDataObat().size(); i++) {
                System.out.println("[" + i + "] " + obat.m_obat.getDataObat().get(i).getNama());
            }
            
            System.out.println("--------------------");
            System.out.print("Index Obat : ");
            int index = input.nextInt();
            System.out.println("--------------------");
            System.out.print("Kode Obat  : ");
            int kode = input.nextInt();
            input.nextLine();
            System.out.print("Nama Obat  : ");
            String nama = input.nextLine();
            System.out.print("Harga Obat : ");
            int harga = input.nextInt();
            System.out.print("Stok Obat  : ");
            int stok = input.nextInt();
            obat.update(index, new Entity_Obat(kode, nama, harga, stok));
            System.out.println("--------------------");
            System.out.println("Data Obat Berhasil Di Ubah");
            System.out.println("--------------------");
        } else {
            System.out.println("Data Obat Kosong");
            System.out.println("--------------------");
        }
    }
    
    public void delete() {
        if(obat.m_obat.getDataObat().size() > 0) {
            for(int i = 0; i < obat.m_obat.getDataObat().size(); i++) {
                System.out.println("[" + i + "] " + obat.m_obat.getDataObat().get(i).getNama());
            }
            
            System.out.println("--------------------");
            System.out.print("Index Obat : ");
            int index = input.nextInt();
            obat.delete(index);
            System.out.println("--------------------");
            System.out.println("Data Obat Berhasil Di Hapus");
            System.out.println("--------------------");
        } else {
            System.out.println("Data Obat Kosong");
            System.out.println("--------------------");
        }
    }
    
    public void menu_pelanggan() {
        int pilihan;
        
        do {
            System.out.println("");
            System.out.println("====================");
            System.out.println("   Menu Pelanggan   ");
            System.out.println("====================");
            System.out.println("1. Create Pelanggan");
            System.out.println("2. View Pelanggan");
            System.out.println("3. Update Pelanggan");
            System.out.println("4. Delete Pelanggan");
            System.out.println("5. Exit");
            System.out.println("--------------------");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();
            System.out.println("--------------------");
            
            switch(pilihan) {
                case 1 :
                    create_pelanggan();
                    break;
                case 2 :
                    view_pelanggan();
                    break;
                case 3 :
                    update_pelanggan();
                    break;
                case 4 :
                    delete_pelanggan();
                    break;
                case 5 :
                    System.out.println("Anda Sudah Keluar");
                    System.out.println("-------------------- \n");
                    break;
                default :
                    System.out.println("Pilihan Tidak Ada");
                    System.out.println("--------------------");
                    break;
            }
        } while(pilihan != 5);
    }
    
    public void create_pelanggan() {
        input.nextLine();
        System.out.print("No Id Pelanggan : ");
        String no_id = input.nextLine();
        System.out.print("Nama Pelanggan  : ");
        String nama = input.nextLine();
        pelanggan.create(new Entity_Pelanggan(no_id, nama));
        System.out.println("--------------------");
        System.out.println("Data Pelanggan Berhasil Disimpan");
        System.out.println("--------------------");
    }
    
    public void view_pelanggan() {
        if(pelanggan.m_pelanggan.getData_pelanggan().size() > 0) {
            int no_urut = 0;
            for(int i = 0; i < pelanggan.m_pelanggan.getData_pelanggan().size(); i++) {
                no_urut++;
                System.out.println("[Pelanggan " + no_urut + "]");
                System.out.println("No Id Pelanggan : " + pelanggan.m_pelanggan.getData_pelanggan().get(i).getNo_id());
                System.out.println("Nama Pelanggan  : " + pelanggan.m_pelanggan.getData_pelanggan().get(i).getNama());
                System.out.println("--------------------");
            }
        } else {
            System.out.println("Data Pelanggan Kosong");
            System.out.println("--------------------");
        }
    }
    
    public void update_pelanggan() {
        if(pelanggan.m_pelanggan.getData_pelanggan().size() > 0) {
            for(int i = 0; i < pelanggan.m_pelanggan.getData_pelanggan().size(); i++) {
                System.out.println("[" + i + "] " + pelanggan.m_pelanggan.getData_pelanggan().get(i).getNama());
            }
            
            System.out.println("--------------------");
            System.out.print("Index Pelanggan : ");
            int index = input.nextInt();
            System.out.println("--------------------");
            input.nextLine();
            System.out.print("No Id Pelanggan : ");
            String no_id = input.nextLine();
            System.out.print("Nama Pelanggan  : ");
            String nama = input.nextLine();
            pelanggan.update(index, new Entity_Pelanggan(no_id, nama));
            System.out.println("--------------------");
            System.out.println("Data Pelanggan Berhasil Di Ubah");
            System.out.println("--------------------");
        } else {
            System.out.println("Data Pelanggan Kosong");
            System.out.println("--------------------");
        }
    }
    
    public void delete_pelanggan() {
        if(pelanggan.m_pelanggan.getData_pelanggan().size() > 0) {
            for(int i = 0; i < pelanggan.m_pelanggan.getData_pelanggan().size(); i++) {
                System.out.println("[" + i + "] " + pelanggan.m_pelanggan.getData_pelanggan().get(i).getNama());
            }
            
            System.out.println("--------------------");
            System.out.print("Index Pelanggan : ");
            int index = input.nextInt();
            pelanggan.delete(index);
            System.out.println("--------------------");
            System.out.println("Data Pelanggan Berhasil Di Hapus");
            System.out.println("--------------------");
        } else {
            System.out.println("Data Pelanggan Kosong");
            System.out.println("--------------------");
        }
    }
    
    public void menu_pemesanan() {
        int pilihan;
        
        do {
            System.out.println("");
            System.out.println("====================");
            System.out.println("   Menu Pemesanan   ");
            System.out.println("====================");
            System.out.println("1. Pesan Obat");
            System.out.println("2. View Pemesanan");
            System.out.println("3. Exit");
            System.out.println("--------------------");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();
            System.out.println("--------------------");
            
            switch(pilihan) {
                case 1 :
                    pesan_obat();
                    break;
                case 2 :
                    view_pemesanan();
                    break;
                case 3 :
                    System.out.println("Anda Sudah Keluar");
                    System.out.println("-------------------- \n");
                    break;
                default :
                    System.out.println("Pilihan Tidak Ada");
                    System.out.println("--------------------");
                    break;
            }
        } while(pilihan != 3);
    }
    
    public void pesan_obat() {
        if(pelanggan.m_pelanggan.getData_pelanggan().size() > 0 && obat.m_obat.getDataObat().size() > 0) {
            String no_id, pilih = "y";
            int kode;
            
            input.nextLine();
            System.out.print("No Id Pelanggan : ");
            no_id = input.nextLine();
            index_pelanggan = pelanggan.cek_pelanggan(no_id);
            
            if(pelanggan.cek_pelanggan(no_id) == -1) {
                System.out.println("--------------------");
                System.out.println("Data Tidak Ada");
                System.out.println("--------------------");
            } else {
                do {
                    System.out.print("Kode Obat : ");
                    kode = input.nextInt();
                    index_obat = obat.cek_obat(kode);
                    
                    if(obat.cek_obat(kode) == -1) {
                        System.out.println("--------------------");
                        System.out.println("Kode Obat Tidak Ada");
                        System.out.println("--------------------");
                    } else {
                        System.out.println("--------------------");
                        System.out.println("   Data Pemesanan   ");
                        System.out.println("--------------------");
                        System.out.print("No Pesan      : ");
                        int no_pesan = input.nextInt();
                        System.out.print("Jumlah Pesan  : ");
                        int jumlah = input.nextInt();
                        input.nextLine();
                        System.out.print("Tanggal Pesan : ");
                        String tanggal = input.nextLine();
                        int total = jumlah * obat.m_obat.getDataObat().get(index_obat).getHarga();
                        pemesanan.create(new Entity_Pemesanan(no_pesan, jumlah, total, tanggal));
                    }
                    System.out.print("Ingin Mengulang (y/t) : ");
                    pilih = input.next();
                    System.out.println("--------------------");
                } while(pilih.equals("y"));
            }
        } else {
            System.out.println("Data Obat Atau Pelanggan Kosong");
            System.out.println("--------------------");
        }
    }
    
    public void view_pemesanan() {
        if(pemesanan.m_pemesanan.getDataPemesanan().size() > 0) {
            int no_urut = 0;
            for(int i = 0; i < pemesanan.m_pemesanan.getDataPemesanan().size(); i++) {
                no_urut++;
                System.out.println("[Pemesanan " + no_urut + "]");
                System.out.println("No Pesan       : " + pemesanan.m_pemesanan.getDataPemesanan().get(i).getNo_pesan());
//                System.out.println("Nama Pelanggan : " + pelanggan.m_pelanggan.getData_pelanggan().get(index_pelanggan).getNama());
//                System.out.println("Nama Obat      : " + obat.m_obat.getDataObat().get(index_obat).getNama());
//                System.out.println("Harga Obat     : " + obat.m_obat.getDataObat().get(index_obat).getHarga());
                System.out.println("Jumlah         : " + pemesanan.m_pemesanan.getDataPemesanan().get(i).getJumlah());
                System.out.println("Total          : " + pemesanan.m_pemesanan.getDataPemesanan().get(i).getTotal());
                System.out.println("Tanggal        : " + pemesanan.m_pemesanan.getDataPemesanan().get(i).getTanggal());
                System.out.println("--------------------");
            }
        } else {
            System.out.println("Data Pemesanan Kosong");
            System.out.println("--------------------");
        }
    }
}
