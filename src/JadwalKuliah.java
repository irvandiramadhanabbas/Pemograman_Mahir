public class JadwalKuliah {
    public static void main(String[] args) {
        String[][][] jadwalKuliah = new String[7][2][2];

        String[] hari = {"Senin", "Selasa"};

        jadwalKuliah[0][0][0] = "Probabilitas dan Statistik";
        jadwalKuliah[0][0][1] = "08:00 - 10:00";
        jadwalKuliah[0][1][0] = "Aljabar Linear";
        jadwalKuliah[0][1][1] = "10:30 - 12:30";
        jadwalKuliah[1][0][0] = "Pemrograman Mahir";
        jadwalKuliah[1][0][1] = "09:00 - 11:00";
        jadwalKuliah[2][0][0] = "Teori Bahasa dan Otomata";
        jadwalKuliah[2][0][1] = "08:30 - 10:30";
        jadwalKuliah[3][0][0] = "Bahasa Arab";
        jadwalKuliah[3][0][1] = "07:00 - 09:00";
        jadwalKuliah[4][0][0] = "Basis Data";
        jadwalKuliah[4][0][1] = "09:00 - 11:00";
        jadwalKuliah[5][0][0] = "SIAT dan Tamaddun Melayu";
        jadwalKuliah[5][0][1] = "08:00 - 10:00";

        // Menampilkan jadwal kuliah dengan waktu
        for (int i = 0; i < hari.length; i++) {
            System.out.println("Hari " + hari[i]) ;
            for (int j = 0; j < jadwalKuliah[i].length; j++) {
                if (jadwalKuliah[i][j][0] != null) {
                    System.out.println("Sesi " + (j + 1) + ": " + jadwalKuliah[i][j][0] + " (" + jadwalKuliah[i][j][1] + ")");
                }
            }
            System.out.println();
        }
    }
}