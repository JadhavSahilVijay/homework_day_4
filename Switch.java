package homework_day_4;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter From Option:");
		System.out.println("1.Area of circle, 2.Area of Triangle, 3.Circumference, 4.perimeter of triangle ");
		int ch = sc.nextInt();
		double r,area,peri,base,height,side1,side2,cir;
		double pi = 3.14;
		
		switch(ch) {
			case 1:
				System.out.println("enter the radius: ");
				r = sc.nextFloat();
				area = pi*r*r;
				System.out.println("area is "+area);
				break;
			case 2:
				System.out.println("enter the base: ");
				base = sc.nextFloat();
				System.out.println("enter the height: ");
				height = sc.nextFloat();
				area = 1/2*base*height;
				System.out.println("area is "+area);
				break;
			case 3:
				System.out.println("enter the radius: ");
				r = sc.nextFloat();
				cir = 2*pi*r;
				System.out.println("ciecumference is "+cir);
				break;
			case 4:
				System.out.println("enter the side 1: ");
				side1 = sc.nextFloat();
				System.out.println("enter the side 2: ");
				side2 = sc.nextFloat();
				System.out.println("enter the base: ");
				base = sc.nextFloat();
				peri = side1+base+side2;
				System.out.println("perimeter is "+peri);
				break;
		}
	}
}
