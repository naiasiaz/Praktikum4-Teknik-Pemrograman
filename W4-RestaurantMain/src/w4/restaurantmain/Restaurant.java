package w4.restaurantmain;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-07
 */

public class Restaurant {
    public class Menu {
        // Deklarasi variabel
        // Mengubah access modifier menjadi private
        private String[] nama_makanan;
        private double[] harga_makanan;
        private int[] stok;
        private static byte id = 0;

        // Membuat accessor getName
        public String[] getNama() {
            // Mengembalikan nilai nama
            return nama_makanan;
        }

        // Membuat accessor getHarga
        public double[] getHarga() {
            // Mengembalikan nilai harga
            return harga_makanan;
        }

        // Membuat accessor getStok
        public int[] getStok() {
            // Mengembalikan nilai stok
            return stok;
        }

        // Membuat accessor getId
        public static byte getId() {
            // Mengembalikan nilai id
            return id;
        }
    }

    // Deklarasi array bernama "menu" yang memiliki tipe data Menu
    private Menu[] menu;
    
    // Membuat constructor Restaurant
    public Restaurant() {
        menu = new Menu[10];
        for(int i = 0; i < 10; i++) {
            menu[i] = new Menu();
            menu[i].nama_makanan = new String[10];
            menu[i].harga_makanan = new double[10];
            menu[i].stok = new int[10];
        }   
    }
    
    // Membuat method tambahMenuMakanan untuk menambah menu
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        menu[Menu.getId()].nama_makanan[Menu.getId()] = nama;
        menu[Menu.getId()].harga_makanan[Menu.getId()] = harga;
        menu[Menu.getId()].stok[Menu.getId()] = stok;
        Menu.getId();
    }
    
    // Membuat method tampilMenuMakanan untuk menampilkan menu
    public void tampilMenuMakanan() {
        System.out.println("     Menu Restaurant");
        System.out.println("==========================");
        for(int i = 0; i <= Menu.getId(); i++) {
            if(!isOutOfStock(i)){
                System.out.println(menu[i].nama_makanan[i] +"["+menu[i].stok[i]+"]"+"\tRp. "+menu[i].harga_makanan[i]);
            }
        }
    }
    
    // Membuat method isOutOfStock untuk mengecek apakah stok tersedia atau tidak
    public boolean isOutOfStock(int id) {
        if(menu[id].stok[id] == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // Membuat method nextId untuk menambah id
    public static void nextId() {
        Menu.id++;
    }
    
    // Membuat method pesanMakanan untuk memesan makanan serta menampilkan rincian pesanan
    public void pesanMakanan(String nama, int jumlah) {
        for(int i = 0; i <= Menu.getId(); i++) {
            // Jika nama makanan dan jumlah makanan sesuai, maka pemesanan berhasil
            if(menu[i].nama_makanan[i].equalsIgnoreCase(nama) && menu[i].stok[i] >= jumlah) {
                System.out.println("\n      Rincian Pesanan");
                System.out.println("==========================");
                System.out.println("Menu    : " + menu[i].nama_makanan[i]);
                System.out.println("Jumlah  : " + jumlah+" buah");
                System.out.println("Total   : Rp. "+menu[i].harga_makanan[i]*jumlah);
                // Mengurangi jumlah stok makanan setelah ada yang pesan
                menu[i].stok[i] -= jumlah;
                System.out.println("\n");
                // Menampilkan menu makanan serta jumlah stok yang baru
                tampilMenuMakanan();
                return;
            }
        }
        // Jika nama makanan dan jumlah makanan tidak sesuai, maka akan tampil output di bawah
        System.out.println("\nMaaf, menu yang anda pesan tidak tersedia.");
    }
}
