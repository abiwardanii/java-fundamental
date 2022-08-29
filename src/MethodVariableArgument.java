package src;

public class MethodVariableArgument {
    public static void main(String[] args) {
    saySelamat("abi", 80,90,78,100,85);
    }
    static void saySelamat(String name, int... values) {
        int total = 0;
        for (var value: values){
            total += value;
        }
        int finalValue = total / values.length;
        if(finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Menyerahlah saja :)");
        }
    }
}
