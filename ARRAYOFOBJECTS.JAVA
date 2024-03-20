import java.util.*;
class array{
	int eno;
	String ename;
	int salary;
	array(int eno,String ename,int salary){
		this.eno=eno;
		this.ename=ename;
		this.salary=salary;
	}
}
class arr{
	public static void main(String[] args){
	int i,aa,c;
	String b;
		Scanner imp=new Scanner(System.in);
		System.out.print("enter the number of employees:");
		int x=imp.nextInt();
		array a[]=new array[x];
		System.out.println("enter details:");
		for(i=0;i<x;i++){
			System.out.println("employee "+(i+1));
			System.out.print("enter no:");
			aa=imp.nextInt();
			System.out.print("enter name:");
			b=imp.next();
			System.out.print("enter salary:");
			c=imp.nextInt();
			System.out.println("\n");
			a[i]=new array(aa,b,c);
		}
		System.out.println("the details are:");
		for(i=0;i<x;i++){
			System.out.println("employee "+(i+1));
			System.out.println("no: "+a[i].eno);
			System.out.println("name: "+a[i].ename);
			System.out.println("salary: "+a[i].salary);
			System.out.println("\n");
		}
	}
}
		
