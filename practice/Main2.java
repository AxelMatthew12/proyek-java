package practice;

public class Main2 {
    public static void main(String[] args) {
        int[][] bioskop = {
                {4, 1, 1}, // film 0: rating 4, 1, 1
                {3, 1, 2}, // film 1: rating 3, 1, 2
                {4, 2, 3}, // film 2: rating 4, 2, 3
                {4, 3, 4}  // film 3: rating 4, 3, 4
        };

        double[] rataRataPerFilm = new double[bioskop.length];
        for (int i = 0; i < bioskop.length; i++) {
            int totalRating = 0;
            for (int rating : bioskop[i]) {
                totalRating += rating;
            }
            double rataRata = (double) totalRating / bioskop[i].length;
            rataRataPerFilm[i] = rataRata; // menyimpan rata-rata rating
        }

    
        // Menampilkan rata-rata rating dan indeks film dengan kategori film dengan rating tertinggi ke terendah
        System.out.println("Kategori film dengan rating tertinggi ke terendah:");
        for (int i = 0; i < rataRataPerFilm.length; i++) {
            int index = i;
            double rating = rataRataPerFilm[i];
            System.out.println("Film " + index + ": Rata-rata rating = " + rating);
        }
        // // Pengurutan rata-rata rating dan indeks film (Selection Sort)
        // for (int i = 0; i < rataRataPerFilm.length - 1; i++) {
        //     int minIndex = i;
        //     for (int j = i + 1; j < rataRataPerFilm.length; j++) {
        //         if (rataRataPerFilm[j] > rataRataPerFilm[minIndex]) {
        //             minIndex = j;
        //         }
        //     }
        //     // Tukar posisi rata-rata rating
        //     double temp = rataRataPerFilm[minIndex];
        //     rataRataPerFilm[minIndex] = rataRataPerFilm[i];
        //     rataRataPerFilm[i] = temp;
        // }
    }
    
}
