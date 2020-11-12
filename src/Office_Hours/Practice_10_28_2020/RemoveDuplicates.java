package Office_Hours.Practice_10_28_2020;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "cybertek"; // "ab"

        String nonDup = "";
        // if the character is non exist in nonDup, then we can concat it

        for (int i = 0; i <= str.length() - 1; i++) {
            String eachChar = ""+str.charAt(i);
            if (nonDup.contains(eachChar)) {// if the character is already contained in the nonDup
                continue; // skip it

            }else{
                nonDup += str.charAt(i);
            }
        }
        System.out.println(nonDup);

    }
}
