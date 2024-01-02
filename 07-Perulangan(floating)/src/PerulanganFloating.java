public class PerulanganFloating{
    public static void main(String[] args) {
        // Batas awal dan akhir untuk perulangan floating-point
        double start = 1.0;
        double end = 5.0;

        // Increment atau langkah perulangan
        double step = 0.5;

        // Perulangan menggunakan for loop
        for (double i = start; i <= end; i += step) {
            System.out.println("Nilai: " + i);
        }
    }
}
