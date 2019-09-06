package chap5;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		  

		  

		  int [] balls = {0,1,2,3,4,5,6,7,8,9};

		  for(int i=1;i<=1000;i++) {

		   

		   int ran1=(int)(Math.random()*10);

		   int ran2=(int)(Math.random()*10);

		   

		   while(ran1==ran2) ran2=(int)(Math.random()*10);

		   if(ran1!=ran2) {

		    int sw = balls[ran1];

		    balls[ran1]=balls[ran2];

		    balls[ran2]=sw;

		    }

		  }




		  int [] com = new int[4];

		  int len = com.length;

		  for(int i=0; i<len; i++) {

		   com[i]=balls[i];

		  }

		  

		  int [] player = {-1,-1,-1,-1}; 

		  

		  System.out.println("���� �߱��� �����մϴ�. 4�ڸ� ���ڸ� �Է����ּ���.");

		  System.out.println("�׸� �ϰ� �ʹٸ� 90000 �� �Է����ּ���.");

		  int cnt=0;

		  while(true) {

		   cnt++;

		   int ball = 0;

		   int strike = 0;

		   int pnum=sc.nextInt();

		   

		   if(pnum==90000) {

		    System.out.println("�����ϼ̽��ϴ�. ���� "+com[0]+com[1]+com[2]+com[3]+" �Դϴ�.");

		   }

		   for(int i=0; i<len;i++) {

		    player[len-i-1]=pnum%10;

		    pnum/=10;

		   }

		   for(int i=0; i<len; i++) {

		    if (player[i]==com[i]) strike++;

		    else if((player[i]==com[0]) || (player[i]==com[1]) || (player[i]==com[2]) || (player[i]==com[3])) ball++;

		   }

		   if(strike==4) {

		    System.out.println("�����Դϴ�! �õ� Ƚ���� :" +cnt+ "�Դϴ�.");break;

		   }

		   else{

		    System.out.println("��Ʈ����ũ : " + strike + " �� :"+ball);

		   }

		  }
	}

}
