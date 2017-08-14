package Day1;
import java.util.*;

public class Result {



	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);// for scanning the input from user for rectangle in this case.
		
		Add Obj = new Add();
		Sub Obj1 = new Sub();
		Multiplication Obj3 = new Multiplication();
		AP Obj4 =new AP();
		Perimeter Obj5 = new Perimeter();
		 int x, y;
		x = Obj.add(10, 5);	
		y = Obj1.sub((x+10), x);
		Obj3.mul(y, y);
		
		// taking input from user for length of Rectangle and putting it to l.
		System.out.println("Enter the length of Rectangle:");
		double l =s.nextDouble(); 
		
		//taking input from user for breadth and putting it to b.
		System.out.println("Enter the breadth of Retangle:");
		double b = s.nextDouble();
		s.close();// ending the scanning part of code
		
		Obj4.area(l, b);
		Obj5.perimeter(l, b);
		
	
	
	}

}
