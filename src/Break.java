package src;

public class Break {
    public static void main(String[] args) {
        var i = 1;
        while (true){
            System.out.println("loop " + i);
            i++;

            if(i > 10){
                break;
            }
        }
    }
}
