import java.util.Scanner;
class stringg{
	Scanner inp=new Scanner(System.in);
	void leng(String n,String m){
		System.out.println("the length of strings 1 and 2 are "+n.length()+" and "+m.length()+" respectively");
	}
	void concat(String n,String m){
		System.out.println("the concatenated string is: "+n.concat(m));
	}
	void chara(String n){
		int c;
		System.out.println("enter the index:");
		c=inp.nextInt();
		System.out.println("the character at index "+c+" is "+n.charAt(c));
	}
	void comp(String n,String m){
		boolean r;
		r=n.equals(m);
		if(r){
			System.out.println("both are same");
		}
		else{
		System.out.println("both are not same");
		}
	}	
	void sub(String n){
	String ch;
		System.out.println("enter the substring to search:");
		ch=inp.next();
		System.out.println("the last occurrence of substring is at the index "+n.lastIndexOf(ch));
		System.out.println("the first occurrence of substring is at the index "+n.indexOf(ch,0));
	}
	void modify(String m){
		String d,g;
		System.out.println("enter the character to change:");
		d=inp.next();
		System.out.println("enter the character to replace:");
		g=inp.next();
		System.out.println("the modified string:"+m.replace(d,g));
	}
}
public class StringFunc{
public static void main(String[] args){
	String n,m;
	int op,wish;
	System.out.println("enter first string:");
	Scanner in=new Scanner(System.in);
	n=in.next();
	System.out.println("enter second string:");
	m=in.next();
	System.out.println("MENU:\n1.string length\n2.string concatenation\n3.character etraction from string 1\n4.string comparison\n5.search substring\n6.modifying string 2");
	stringg str=new stringg();
	do{
		System.out.print("choose the operation to perform:");
		op=in.nextInt();
		switch(op){
			case 1:str.leng(n,m);
				break;
			case 2:str.concat(n,m);
				break;
			case 3:str.chara(n);
				break;
			case 4:str.comp(n,m);
				break;
			case 5:str.sub(n);
				break;
			case 6:str.modify(m);
				break;
			default:System.out.print("choose correct operation ");
				break;
			}
			System.out.print("do you wish to continue(1/0)");
			wish=in.nextInt();
			
			}while(wish==1);
		}
	}
		
		
