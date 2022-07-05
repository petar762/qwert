import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.print( "Enter amount in dollars: " );
        double dollar = myInput.nextDouble();
        double lev = dollar * 1.65;

        System.out.println("Dollars in bgn: " + lev + " bgn");


    }

}
