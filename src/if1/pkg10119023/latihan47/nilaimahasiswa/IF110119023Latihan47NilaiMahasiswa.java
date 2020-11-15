package if1.pkg10119023.latihan47.nilaimahasiswa;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : 
 *
 */
public class IF110119023Latihan47NilaiMahasiswa {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IF110119023Latihan47NilaiMahasiswa main = new IF110119023Latihan47NilaiMahasiswa();
        main.beriNilai(75, 45, 34);
        main.beriNilai(60, 80, 75);
        main.beriNilai(30, 80, 40);
    }

    private void beriNilai(float quiz, float uts, float uas) {
        Nilai n = new Nilai(quiz, uts, uas);
        n.setNilaiAkhir(quiz, uts, uas);
        n.setIndex(n.getNilaiAkhir());
        System.out.println("QUIZ\t = " + n.getQuiz());
        System.out.println("UTS\t = " + n.getUts());
        System.out.println("UAS\t = " + n.getUas());
        System.out.println();
        System.out.println("Nilai Akhir\t = " + n.getNilaiAkhir());
        System.out.println();
        System.out.println("Index = " + n.getIndex());
        System.out.println("Keterangan = " + n.getKeterangan());
        System.out.println("===============================");
    }
}
