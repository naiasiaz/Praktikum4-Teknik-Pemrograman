package w4.warung;

import java.util.Scanner;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-07
 */

public class Warung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat scanner baru bernama input
        Scanner input = new Scanner(System.in);
        
        // Membuat objek "menu" yang merupakan array dari objek "Produk" yang memiliki ukuran 10
        Produk[] menu = new Produk[10];
        
        // Membuat objek "pesanan" yang merupakan array dari objek "Penjualan" yang memiliki ukuran 10
        Penjualan[] pesanan = new Penjualan[10];
        
        // Inisialisasi objek menu
        menu[0] = new Produk("Roti Sobek            ", 5000, 20);
        menu[1] = new Produk("Telur 1 kg            ", 30000, 20);
        menu[2] = new Produk("Minyak Goreng 2 lt    ", 28000, 25);
        menu[3] = new Produk("Beras 1 kg            ", 13000, 25);
        menu[4] = new Produk("Tepung Terigu 500 gr  ", 7000, 20);
        menu[5] = new Produk("Mi Instan             ", 3000, 30);
        menu[6] = new Produk("Air Mineral           ", 4000, 50);
        menu[7] = new Produk("Garam Dapur 225 gr    ", 2500, 20);
        menu[8] = new Produk("Gula Pasir 500 gr     ", 8000, 25);
        menu[9] = new Produk("Kopi Sachet          ", 2500, 48);
        
        // Deklarasi variabel
        int jumlah_pesanan = 0;
        int total_harga = 0;
        int pilihan;
        int qty;
        
        // Proses untuk melakukan pemesanan produk
        // Proses di bawah akan dilakukan sekali dan selama user memilih untuk memesan kembali
        do {
            // Menampilkan daftar produk
            System.out.println("              Daftar Produk");
            System.out.println("===========================================");
            for(int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i].getNamaProduk() + "[" + menu[i].getQty() + "]" + "\tRp " + menu[i].getHargaProduk());
            }
            
            System.out.println("\n           Silakan Pesan Produk");
            System.out.println("===========================================");
            
            System.out.print("Masukkan nomor menu yang ingin dipesan: ");
            pilihan = input.nextInt();
            System.out.print("Masukkan jumlah pesanan: ");
            qty = input.nextInt();
            
            if(qty > menu[pilihan - 1].getQty()) {
                // Jika jumlah produk yang dipesan lebih banyak dari stok yang ada, maka akan tampil output seperti di bawah
                System.out.println("Maaf, stok kami tidak mencukupi");
            } else {
                pesanan[jumlah_pesanan] = new Penjualan(menu[pilihan - 1].getNamaProduk(), qty, (int) menu[pilihan - 1].getHargaProduk());
                jumlah_pesanan++;
                menu[pilihan - 1].setQty(menu[pilihan - 1].getQty() - qty);
                total_harga += qty * menu[pilihan - 1].getHargaProduk();
            }
            
            // Menampilkan pertanyaan untuk mmastikan user apakah ingin memesan kembali atau tidak
            System.out.print("\nApakah ingin memesan kembali? (y/n) ");
        } while (input.next().equals("y"));
        
        // Menampilkan rincian pesanan
        System.out.println("\n               Rincian Pesanan");
        System.out.println("==============================================");
        for(int i = 0; i < jumlah_pesanan; i++) {
            System.out.println((i + 1) + ". " + pesanan[i].getNamaProduk() + "" + pesanan[i].getQty() + " buah     " + " Rp " + pesanan[i].getTotalHarga());
        }
        // Menampilkan total harga
        System.out.println("Total bayar: Rp " + total_harga);
        
        // Menutup stream input
        input.close();
    }
}
