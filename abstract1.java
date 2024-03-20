abstract class emp{
	abstract void printInfo();
}
class employee extends emp{
	void printInfo(){
		String name="ganga";
		int age=21;
		float sal=20000F;
		System.out.println(name+","+age+","+sal);
	}
}
class abstract1{
	public static void main(String[] args){
		emp obj=new employee();
		obj.printInfo();
	}
}
