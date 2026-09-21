import java.util.*;
public class compundintresrtcalculator {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the principal amount:$");
    double PA=scanner.nextDouble();
    System.out.println("Enter the intrest rate %:");
    double IR=scanner.nextDouble();
    System.out.println("Enter the # componded per year :");
    double CY=scanner.nextDouble();
    System.out.println("Enter the amount of that yaer:");
    double Year=scanner.nextDouble();

    double TA;
    TA=PA*Math.pow(1+(IR/100/CY),CY*Year);
    

    System.out.println("The amount after"+ CY +"year is:"+TA);

        scanner.close();
    } 
}
