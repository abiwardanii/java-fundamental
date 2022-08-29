package src;

public class MethodReturnValue {
    public static void main(String[] args) {
        var result = sum(10, 20);
        System.out.println(result);
    }
    static int sum(int a, int b){
        var total = a + b;
        return total;
    }
}
