abstract class shape{
	public abstract double calculateArea();
	public void displayInfo(){
		System.out.println("this is a shape");
	}
}
class rectangle extends shape{
	int l,b;
	public rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	public double calculateArea(){
		return l*b;
	}
}
class circle extends shape{
	int r;
	public circle(int r){
		this.r=r;
	}
	public double calculateArea(){
		return Math.PI*r*r;
	}
}
public class abstractt{
	public static void main(String args[]){
		shape rect=new rectangle(2,3);
		System.out.println("the area is: "+rect.calculateArea());
		rect.displayInfo();
		shape cir=new circle(4);
		System.out.println("the area is: "+cir.calculateArea());
		cir.displayInfo();
	}
}
