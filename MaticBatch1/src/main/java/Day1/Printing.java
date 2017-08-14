package Day1;

public class Printing {
	public static void main (String[] args) {
		int w=4;
		for(int i=1; i<5; i++) {	
			for (int s=1; s<w; s++)
				System.out.print(" ");
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
			w--;
		}
	}
}
