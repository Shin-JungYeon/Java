package chap4;

public class HW01 {

	public static void main(String[] args) {
        int sum=0;
		
		for (int i=1 ; i<=10 ; i++) {
			System.out.print("(");
			for (int j=1 ; j<=i ; j++) {
				if(j<i) {
					System.out.print(j + " + ");
				} else {
					System.out.print(j);
				}
				sum += j;
			}
			if(i<10) {
				System.out.print(") + ");
			} else {
				System.out.print(")");
			}
		}
		System.out.print(" = " + sum);
	}

}
