package day12_NestedIf;

public class Loan {

    public static void main(String[] args) {

        double minimumSalary = 50000;
        int jobHistory = 15;
        int creditScore = 550;

        if(minimumSalary >= 30000){

            if(jobHistory >= 2) {

                if (creditScore >= 690) {
                    System.out.println("You are qualified for loan");
                } else {
                    System.out.println("You must have at least 690 credit score");
                }

            }else{
                System.out.println("You must be on the job at least than 2 years");
            }



        }else{
            System.out.println("You must have minimum of 30000 salary first");
        }








    }
}
