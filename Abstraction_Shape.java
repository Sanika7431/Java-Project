package Web;

  abstract class Shapes2
  {
	 abstract void add();
  }
 
 class Circle2 extends Shapes2{
	 double num1 = 2;
	 double num2 = 6;
	 
	 Circle2(double num1,double num2){
		 this.num1= num1;
		 this.num2=num2;
	 }
	 @Override
	  void add() {
		 System.out.println("Addition : " + (num1+num2));
		 
	 }
 }
 class Rectangle2 extends Shapes2{
	 double num3 = 8;
	 double num4 = 9;
	 Rectangle2(double num3,double num4){
		 this.num3=num3;
		 this.num4=num4;
	 }
	 
	 @Override
	  void add() {
		
		 System.out.println("Addition in Rectangle:" + (num3+num4));
	 }
 }
 
public class Abstraction_Shape {
public static void main(String[] args) {
	Circle2 s1 = new Circle2(3,5);
	Rectangle2  s2 = new Rectangle2(7,8);
	s1.add();
	s2.add();
}
}
