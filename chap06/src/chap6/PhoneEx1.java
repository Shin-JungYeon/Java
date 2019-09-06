package chap6;
//Ŭ���� : ����� ���� �ڷ���
class Phone {  //������ �޼���� ���Ƶ� ��.
	String color;    //��� ����
	boolean power;   //��� ����
	String no;       //��� ���� : ���� �ʿ��� ����
	void power() {   //��� �޼��� : ���
		power = !power;
	}
	void send(String no) {   //��� �޼���
		System.out.println(no + "�� ��ȭ �۽� ��~");  //no -> ��������, ���� ������� no�ʹ� �ٸ�.
	}
	void receive(String no) {   //��� �޼���
		System.out.println(no + "���� ��ȭ ���� ��~");
	}
	//��������� �ٷ� ȣ�� ����(���� �޼��� ��� ����)
}

//���� Ŭ����(public class) : main �޼��带 ������ �ִ� Ŭ����, main �޼��尡 ���α׷� ������ ������
public class PhoneEx1 {
	public static void main(String[] args) {
		Phone p1 = new Phone();  //��üȭ(new), �ν��Ͻ�ȭ. String�� ���Կ����ڷ� ��üȭ ����
//		Phone p1;   //���������� ����,  main�̶�� �޼��� �ȿ��� �����߱� ������ ��������
//		p1 = new Phone();  //��üȭ
		
		/*
		 * new ������ : ��ü�� �޸� �Ҵ�. ��ü�� �ϳ� ����� ��. �������� ��ü ����
		 *   1. �������� �޸� �Ҵ�
		 *   2. ������� �⺻������ �ʱ�ȭ ����.
		 *        �������� : null
		 *        boolean : false
		 *        ���� : byte, short, int, long, float, double : 0
		 *        ���� : char : \u0000 (�����ڵ� 0)   (String�� Ŭ������)
		 *   3. ������ ȣ��
		 */
		p1.color = "����";
		p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color + ", " + p1.power + ", " + p1.no);
		p1.send("01012341234");
		p1.receive("01012341234");
		
		System.out.println();
		
		Phone p2 = new Phone();  //�Ұ�ȣ ������ �޼��� ������ ����
		p2 = p1;  //��ü�� ����Ǵ� ���� �ƴ�. �ϳ��� ��ü�� �� ���� ���������� �����ϰ� �ִ� ��.
		System.out.println(p2.color + ", " + p2.power + ", " + p2.no);
	}
}