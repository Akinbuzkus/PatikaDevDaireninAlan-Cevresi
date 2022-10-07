
import java.util.Scanner;


public class PatikaDevDaireninAlanıCevresi {
    public static void main(String[] args) {
        int radius;
        double pi=3.14;
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter the Radius :");
        radius=scan.nextInt();
        
        double area=pi*radius*radius;
        System.out.println("Area of the Circle :"+area);
        
        double perimeter=2*pi*radius;
        System.out.println("Perimeter of the Circle :"+perimeter);
        
        System.out.print("Enter the measure of the Center measure of the circle :");
        int a=scan.nextInt();
        
        double total=(pi*(radius*radius)*a)/360;
        System.out.print("Center measure of the circle is :"+total);
        
       
        
    }
}
