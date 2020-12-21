package day44_Inheritance;


class Q{
    public void method(){
        System.out.println("Method A");
    }

    public final void method(int a){
        System.out.println("Method A"+ a);
    }


}


public class Final extends Q {


    /*
    @Override
    public void method(){
        System.out.println("Method B");   // final methods cannot be overriden
    }
     */

    public void method(){
        System.out.println(z); // 0
        //  z = 300; cannot be re-assigned
    }

    public final static int z=0;


    public static void main(String[] args) {
        System.out.println(z);

    }

}

class Z{

}