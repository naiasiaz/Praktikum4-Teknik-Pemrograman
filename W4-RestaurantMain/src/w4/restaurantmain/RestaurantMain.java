package w4.restaurantmain;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-07
 */

public class RestaurantMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek menu
        Restaurant menu = new Restaurant();
        
        // Menambahkan menu baru
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        
        // Menampilkan menu makanan yang tersedia
        menu.tampilMenuMakanan();
        
        // Menampilkan rincian pesanan
        menu.pesanMakanan("Molen", 5);
    }
    
}
