package Office_Hours.Practice_11_04_2020;

public class SliceNumbers2 {

    public static void main(String[] args) {

        int number = 12345;

        String str = "" + number;

        for (int i = 0, j = 1; i < str.length(); i++, j++) {


            System.out.println("digit " + j + ": " + str.charAt(i));
        }
    }
}
