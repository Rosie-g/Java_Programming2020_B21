package day21_WhileLoops;

public class MiddleCharacter {

    public static void main(String[] args) {

        String word = "cybertek"; // a(index=1)  // 3/2 = 1
        //            "javav"// 2 // 5/2 = 2

        if (word.length() % 2 != 0) { // odd


            // first req
            if (word.length() >= 3) {
                System.out.println(word.charAt(word.length() / 2));
            } else {
                System.out.println(word + word + word);
            }
        } else { // even
            // java ==> av ==> 1, 2
            // apples ==> pl ==> 2, 3
            // cybertek ==> er ==> 3, 4 (length()/2)
            if(word.length()>=4){
                int m = word.length()/2;
                System.out.println(word.charAt(m-1)+" "+word.charAt(m));
            }else{
                System.out.println(word+word);
            }
        }

    }
}
/*
1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq
2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi

 */
