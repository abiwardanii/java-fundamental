package src;

public class Switch {
    public static void main(String[] args) {
        var nilai = "S";
        switch (nilai){
            case "A":
                System.out.println("lulus memuaskan");
                break;
            case "B":
            case "C":
                System.out.println("lulus cukup baik");
                break;
            case "D":
                System.out.println("Tidak lulus");
                break;
            default:
                System.out.println("Menyerah saja :)");
        }

        //switch lambda
        switch (nilai){
            case "A" -> {
                System.out.println("lulus memuaskan");
            }
            case "B","C" -> System.out.println("lulus cukup baik");
            case "D" -> System.out.println("Tidak lulus");
            default -> System.out.println("Menyerah saja :)");

        }

        //yield
        String ucapan;
        ucapan = switch (nilai){
            case "A":
                yield "lulus memuaskan";
            case "B","C":
                 yield "lulus cukup baik";
            case "D":
                yield "Tidak lulus";
            default:
                yield "Menyerah saja";
        };
        System.out.println(ucapan);
    }
}
