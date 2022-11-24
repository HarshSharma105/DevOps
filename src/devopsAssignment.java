// Method Overriding + Runtime Polymorphism (Dynamic method dispatch + late binding)
class parent1{
	public void show() {
		System.out.println("Hello I am a parent show()");
	}
	public void get() {
		System.out.println("Hello I am a parent get()");
	}
	
}
class child1 extends parent1{
	public void show() {        //Overriding of show() function in derived class
		System.out.println("Hello I am a child show()");
	}
	public void get1() {
		System.out.println("Hello I am a child get1()");
	}
	
}
class devopsAssignment{
	public static void main(String[] args) {
		//parent1 p2=new parent1();
		//p2.show(); //IT was decided at compile time

		parent1 p1=new child1();  
		p1.show(); // Runtime Polymorphism
		//p1.get1(); 
		p1.get(); //Previously decided at compile time
		p1=new parent1();
		p1.show(); //Runtime Polymorphism
		
	}
}