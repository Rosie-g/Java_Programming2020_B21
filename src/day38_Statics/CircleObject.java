package day38_Statics;

public class CircleObject {

    public static void main(String[] args) {

        Circle circel1 = new Circle();
        circel1.setInfo(5);

        System.out.println(circel1);

        // circle1.equals()

        Circle circel2 = new Circle();
        circel1.setInfo(10);

        System.out.println(circel2);

        System.out.println(circel1 == circel2);
        System.out.println(circel1.equals(circel2));




    }

}
