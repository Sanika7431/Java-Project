//Method Overriding – Animal 
//Write a superclass Animal with a method sound(). 
//Subclasses: Dog, Cat, Cow. 
//Override sound() in each and test runtime polymorphism.

package Web;

class Animal{
	void sound() {
		System.out.println("Animals is making a sound");
	}
}
class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog is Barking");
	}
}
class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("Cat is Meow");
	}
}
class Cow extends Animal{
	@Override
	void sound() {
		System.out.println("Cow is Mmmmooo");
	}
}
public class PolyMorphism_Overriding1 {
public static void main(String[] args) {
	
	Animal a1 = new Animal();
	Animal dog = new Dog();
	Animal cat = new Cat();
	Animal cow = new Cow();
	a1.sound();
	dog.sound();
	cat.sound();
	cow.sound();
}
}
