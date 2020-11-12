package Office_Hours.Practice_10_28_2020;

public class FrequencyOfCharacter2 {

    public static void main(String[] args) {

        String str = "abababaaaaaaaaaaaaaa";
        //"bababa"
        //"bbaba"
        //"bbba"
        //"bbb"
        String ch = "a";

        int count = 0;

        while(str.contains(ch)){
            str = str.replaceFirst(ch," ");
            count++;
        }

        System.out.println(count);

    }
}
