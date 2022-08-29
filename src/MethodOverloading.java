package src;

public class MethodOverloading {
    public static void main(String[] args) {
        sayHallo();
        sayHallo("abi");
        sayHallo("abi","wardani");
    }
    static  void sayHallo(){
        System.out.println("Hallo");
    }
    static  void sayHallo(String name){
        System.out.println("Hallo " + name);
    }
    static  void sayHallo(String firstName, String lastName){
        System.out.println("Hallo " + firstName + " " + lastName);
    }

}
