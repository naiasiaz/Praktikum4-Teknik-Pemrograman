package w4.warung;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-07
 */

public class Produk {
    // Deklarasi variabel
    private String nama_produk;
    private int harga_produk;
    private int qty;
    
    // Membuat Constructor Produk
    public Produk(String nama_produk, int harga_produk, int qty) {
        this.nama_produk = nama_produk;
        this.harga_produk = harga_produk;
        this.qty = qty;
    }
    
    // Membuat accessor getNamaProduk
    public String getNamaProduk() {
        // Mengembalikan nilai nama
        return nama_produk;
    }
    
    // Membuat accessor getHargaProduk
    public int getHargaProduk() {
        // Mengembalikan nilai harga
        return harga_produk;
    }
    
    // Membuat accessor getQty
    public int getQty() {
        // Menge,balikan nilai qty
        return qty;
    }
    
    // Membuat mutator setQty
    public void setQty(int qty) {
        this.qty = qty;
    }
}
