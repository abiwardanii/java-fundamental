package src;

public class IfStatement {
    public static void main(String[] args) {
        var nilai = 85;
        var absen = 750;
        if (nilai >= 90 && absen > 70){
            System.out.println("Lulus memuaskan");
        } else if (nilai > 80 && absen > 70) {
            System.out.println("Lulus");
        } else {
            System.out.println("Gagal");        
        }
    }
}
