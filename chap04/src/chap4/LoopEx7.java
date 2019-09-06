package chap4;

public class LoopEx7 {
	public static void main(String[] args) {
		for(int i=1 ; i<=10 ; i++) {
			for(int j=1 ; j<=10-i ; j++) {
				System.out.print(" ");
			}
			for(int k=1 ; k<=i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1 ; i<=10 ; i++) {
			for(int j=1 ; j<=10 ; j++) {
				if (j<=10-i) 
					System.out.print(" ");
				 else 
					System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
