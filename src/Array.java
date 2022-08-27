package src;

public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Abi";
        stringArray[1] = "wardani";
        stringArray[2] = "hehe";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[2] = "iba";
        System.out.println(stringArray[2]);

        String[] stringArray2 = new String[3];

        String[] names = {
                "xian","rexy","cua"
        };

        int[] arrayInt = new int[]{
                1,2,3,4,5
        };

        long[] arrayLong = {
                10L, 20L ,30L
        };

        System.out.println(arrayLong.length);

        //nested array
        String[][] members = {
                {"abi","xian"},
                {"rexy","cua"},
                {"paul","yogi"}
        };
        System.out.println(members[0][1]);
    }
}
