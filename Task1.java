import java.util.*;
class Dog
{
}
class Puppy
{
}
class Animal
{
}
class Student
{
}

public class Task1 
{
	void m1(Dog d, Puppy p, Animal a){
	System.out.println("This is m1 method");
	}
	static Student m2(){
        System.out.println("This is m2 method");
		Student s= new Student();
      return s;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Task1 t=new Task1();
		Dog d= new Dog();
		Puppy p= new Puppy();
		Animal a= new Animal();
		t.m1(d,p,a);
		Student s=Task1.m2();
        System.out.println("Return value="+s);
		List<Integer> values= Arrays.asList(4,3,8,6);
		for(int i=0;i<values.size();i++){
		System.out.println(values.get(i));
		}
		for(int i:values){
          System.out.println(i);
		}
		values.forEach(i -> System.out.println(i));
		System.out.println("lambda expression is best");
	}
}
