package day22_JavaRecap;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "abcabc";// A,A,A,B,B
        String result = ""; //

        for (int i = 0; i <=str.length()-1 ; i++) {
            String eachCharacter = "" + str.charAt(i);
           if(result.contains(eachCharacter)){
                continue;
            }else{ // if the character of str is not contained in the result yet, then we concat the character
                result+=eachCharacter;
            }
        }
        System.out.println("result:"+result);

           /* if (!result.contains(eachCharacter)){
                result+=eachCharacter;
            }
        }

        System.out.println("result: "+result);

            */


    }
}
