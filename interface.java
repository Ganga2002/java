import java.util.*;
interface shapes{
	void area();
	void perimeter();
}
class circle implements shapes{
	Scanner imp=new Scanner(System.in);
	int a;
	double b;
	public void area(){
		
		System.out.print("enter the radius:");
		a=imp.nextInt();
		b=3.14*a*a;
		System.out.println("the area of circle is: "+b);
	}
	public void perimeter(){
	
		System.out.print("enter the radius:");
		a=imp.nextInt();
		b=2*3.14*a;
		System.out.println("the perimter of circle is: "+b);
	}
	
}
class rectangle implements shapes{
	int c;
	int d;
	Scanner imp=new Scanner(System.in);
	public void area(){
		int c,d;
		System.out.print("enter the length:");
		c=imp.nextInt();
		System.out.print("enter the breadth:");
		d=imp.nextInt();
		System.out.println("the area of rectangle is: "+(2*(c+d)));
	}
	public void perimeter(){
		
		System.out.print("enter the length:");
		c=imp.nextInt();
		System.out.print("enter the breadth:");
		d=imp.nextInt();
		System.out.println("the perimter of rectangle is: "+(c*d));
	}
	
}
public class interfce{
	public static void main(String[] args){
		int a,b;
		Scanner imp=new Scanner(System.in);
		rectangle rect=new rectangle();
		circle cir=new circle();
		do{
		System.out.print("MENU\n1.area of circle\n2.perimeter of circle\n3.area of rectangle\n4.perimeter of rectangle\nchoose:");
		a=imp.nextInt();
		
		switch(a){
			case 1:cir.area();
			break;
			case 2:cir.perimeter();
			break;
			case 3:rect.area();
			break;
			case 4:rect.perimeter();
			break;
			default:System.out.print("enter correct option");
			}
		System.out.println("do you wish to cintinue?(1/0)");
		b=imp.nextInt();
		}while(b==1);
	}
}		
