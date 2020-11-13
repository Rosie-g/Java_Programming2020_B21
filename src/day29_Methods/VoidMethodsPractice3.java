package day29_Methods;

public class VoidMethodsPractice3 {

    public static void main(String[] args) {

        eligibleToVote("usa",45,true);

        eligibleToVote("Japan",35,true);
    }

    public static void eligibleToVote(String citizenship, int age, boolean isAlive){
        if(citizenship.equalsIgnoreCase("USA")){
            if(isAlive){
                if(age>=18){
                    System.out.println("You are eligible to vote");
                }else{
                    System.err.println("You must be at least 18 years old");
                }

            }else{
                System.err.println("You must be alive in order to vote");
            }
        }else{
            System.err.println("You must be US citizen");
        }
    }

}
/*
age, CitizenShip, isAlive
 */