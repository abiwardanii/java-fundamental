package src;

public class Boolean {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 80;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
