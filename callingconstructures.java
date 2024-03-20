class a{
	a(){
	System.out.println("inside a");
	}
}
class b extends a{
	b(){
	System.out.println("inside b");
	}
}
class C extends b{
	C(){
		System.out.println("inside c");
	}
}
class clsb{
	public static void main(String[] args){
		C c=new C();
	}
}
