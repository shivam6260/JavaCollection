package JavaOOPConcept;

// We Cannot make outer class Static

// For Constructor Learning Purpose
class Student {
	public int marks;
	public String name;
	public Student(int marks,String name)
	{
		this.marks = marks;
		this.name = name;
	}
}

class Animal {
	public void display()
	{
		System.out.println("In Class Animal");
	}
//	public void eat()
//	{
//		System.out.println("In Animal class Eating");
//	}
	static void printStatic()
	{
		System.out.println("In Animal Static Method");
	}
}
class InheritanceDemo extends Animal {
	static void printStatic()
	{
		System.out.println("In Dog Static Method");
	}
	
	public void display()
	{
		System.out.println("In Class Dog");
	}
	
	public void eat()
	{
		System.out.println("In Dog class Eating");
	}
	
	public static void main(String[] args) {
		
		// All Output Related to Dog Class only
//		InheritanceDemo obj = new InheritanceDemo();
//		obj.display();
//		obj.eat();
//		obj.printStatic();
		
		Animal obj = new InheritanceDemo();
		obj.printStatic(); // o/p Animal Static
		obj.display(); // o/p Dog Class
		
//		InheritanceDemo obj1 = new Animal(); // Not Possible
		
		
		
	}
}
//public class InheritanceDemo {
//	public static void main(String[] args) {
		
//		Animal obj = new Animal(); // o/p In Class Animal
//		obj.display();
//		
//		Dog obj1 = new Dog();
//		obj1.display(); // o/p In class Dog
		
//		Animal obj = new Dog();  // Iska Matlab Animal class Kai method dog class mai bhi
		                         // Defined hai and Result Dog class ka Dega
//		obj.display(); // o/p In class Dog
//		obj.printStatic(); // Error aa jayega kyuki Animal class mai PrintStatic Define nahi hai
//		obj.eat(); // o/p In Dog class Eating
		
//		Dog obj = new Animal(); // Compile Time Error
//		Animal obj1 = new Dog();
		
		// We cannnot call constructor like this
		//Student obj = new Student(54,"Shivam");
		//obj.Student(34,"Golu"); // This Gives Error
		//obj.Student(); // This Gives Error
	//}

//}



/// Notes

// Class Animal - Parent Class
// Class Dog extends Animal -  Child Class

// Animal obj = new Animal(); Possible
// Dog obj = new Dog(); Possible

// Dog obj = new Animal(); Not Possible kyuki Child class ka reference deke animal class ka object
             // nahi bana sakte

// Animal obj = new Dog(); Possible
// Agar isme Method Overriding ka case aa raha hoga toh
// Object jiska ban raha ( Dog class ka ) Uska response ayega

// Agar isme Method Overloading hai
// toh Reference wala class ( Animal class ka ) Response ayega


















