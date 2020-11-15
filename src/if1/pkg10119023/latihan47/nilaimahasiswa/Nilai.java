package if1.pkg10119023.latihan47.nilaimahasiswa;

public class Nilai {

    private float quiz, uts, uas, nilaiAkhir;

    private String keterangan;

    private char index;

    public Nilai(float quiz, float uts, float uas) {
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

    public float getQuiz() {
        return quiz;
    }

    public float getUts() {
        return uts;
    }

    public float getUas() {
        return uas;
    }

    public float getNilaiAkhir() {
        return nilaiAkhir;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public char getIndex() {
        return index;
    }

    public void setNilaiAkhir(float quiz, float uts, float uas) {
        nilaiAkhir = (0.2f * quiz) + (0.3f * uts) + (0.5f * uas);
    }

    public void setIndex(float nilaiAkhir) {
        class nilai {

            private boolean banding(float nilaiAkhir, int batasBawah, int batasAtas) {
                boolean banding = batasBawah <= nilaiAkhir && nilaiAkhir <= batasAtas;
                return banding;
            }
        }
        float na = nilaiAkhir;
        nilai n = new nilai();
        index = 'E';
        if (n.banding(na, 80, 100)) {
            index = 'A';
            keterangan = "Sangat Baik";
        } else if (n.banding(na, 68, 80)) {
            index = 'B';
            keterangan = "Baik";
        } else if (n.banding(na, 56, 68)) {
            index = 'C';
            keterangan = "Cukup";
        } else if (n.banding(na, 45, 56)) {
            index = 'D';
            keterangan = "Kurang";
        } else if (n.banding(na, 0, 45)) {
            keterangan = "Sangat Kurang";
        }
    }
}
