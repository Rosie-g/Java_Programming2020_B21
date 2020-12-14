package day41_Encapsulation;

public class Login {

    public static void main(String[] args) {

       Credentials obj = new Credentials();
//
//        System.out.println(obj.userName);
//        obj.userName = "ABC";

 //       System.out.println(obj.userName);

        System.out.println(obj.getUserName());

        System.out.println(obj.getPassWord());

//        obj.getPassWord() = 1234; Read only

      obj.setUserName("Hello");

        System.out.println(obj.getUserName());

        obj.setPassWord(1234);
        System.out.println(obj.getPassWord());


    }
}
