package chap4;

public class LoopEx8 {
	public static void main(String[] args) {
		for(int i=10 ; i>0 ; i--) {
			for(int j=1 ; j<=10 ; j++) {
				if (j<=10-i) 
					System.out.print(" ");
				 else 
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
	    for(int i=10 ; i>0 ; i--) {
	    	for(int j=1 ; j<=10 ; j++) {
	    		System.out.print((j<=10-i)?" ":"*");
	    	}
	    System.out.println();
	    }
	    
	}
}