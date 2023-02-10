package w4.warung;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-07
 */

public class Penjualan {
    // Deklarasi variabel
    private String nama_produk;
    private int qty;
    private int total_harga;
    
    // Membuat Constructor Penjualan
    public Penjualan(String nama_produk, int qty, int total_harga) {
        this.nama_produk = nama_produk;
        this.qty = qty;
        this.total_harga = total_harga;
    }
    
    // Membuat accessor getNamaProduk
    public String getNamaProduk() {
        // Mengembalikan nilai nama
        return nama_produk;
    }
    
    // Membuat accessor getQty
    public int getQty() {
        // Mengembalikan nilai qty
        return qty;
    }
    
    // Membuat mutator setQty
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    // Membuat accessor getTotalHarga
    public int getTotalHarga() {
        // Mengembalikan nilai total harga
        return total_harga;
    }
}
