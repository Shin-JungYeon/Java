package chap11;
/*
 * String Ŭ������ �ֿ� �޼���
 */
public class StringEx2 {
	public static void main(String[] args) {
	String s = new String("ABCDEFGH");
	
	System.out.println("s.charAt(4) : " + s.charAt(4));  //(�ε����� 4��)5��° ���� �ϳ��� ����
	
	System.out.println("s.compareTo('abc') : " + s.compareTo("abc"));
	//���� ���ڿ����� �ҹ��� abc�� �� (ABCDEFGH - abc = -32) : ���İ��� �޼���
	//��ü�� ���� ���ڿ����� ���� ���ڿ��� ��. -> ����:��ü�� ��, ���:�񱳹��ڿ��� ��.
	
	System.out.println("s.compareToIgnoreCese('ABC') : " + s.compareToIgnoreCase("abcdefgh"));  //IgnoreCese : ��ҹ��� ������� ���� ��.
	
	System.out.println("s.concat('abc') : " + s.concat("abc"));  //�� ���� ���ڿ��� �ٿ� s + "abc" �� ����.
	
	System.out.println("s.endsWith('FGH') : " + s.endsWith("FGH"));  //s ���ڿ��� �� ���ڿ��� "FGH" ?
	
	System.out.println("s.startsWith('ABC') : " + s.startsWith("ABC"));  //s �������� ���� ���ڿ��� "ABC" ?
	
	System.out.println("s.equalsIgnoreCase('abcdefgh') : " + s.equalsIgnoreCase("abcdefgh"));  //��ҹ��� ������� ������ �ٸ��� Ȯ��.
	
	
	System.out.println();
	
	
	s = "This is a String";
	System.out.println("s.indexOf('i') : " + s.indexOf('i'));
	System.out.println("s.indexOf('is') : " + s.indexOf("is"));
	//indexof(����) : ������ ��ġ�� ���������� ����
	
	System.out.println("s.indexOf('is', 3) : " + s.indexOf("is", 3));
	//indexof(����, �ε���) : �ε���(����)���� ���ڸ� ã�Ƽ� �� ������ ���� ��ġ ����
	
	System.out.println("s.lastindexOf('is') : " + s.lastIndexOf("is"));
	System.out.println("s.lastindexOf('i') : " + s.lastIndexOf("i"));  //13
	//lastindexOf() : ���� ���ڸ� �켱���� ��ġ ����. ��ġ �ε����� �״�� �պ��� ����.
	
	System.out.println("s.length() : " + s.length());  //���ڿ� ����
	
	System.out.println("s.replace('is', 'IS') : " + s.replace("is", "IS"));  //ġȯ
	
	System.out.println("s.substring(5) : " + s.substring(5));  //substring(�ε���) : �κй��ڿ�, �ε��� ���� ���ڸ� ��� ����
	System.out.println("s.substring(5,  13) : " + s.substring(5,  13));
	//substring(�����ε���, ���ε���) : �����ε������� ���ε��� ��(���ε���-1)������ ���ڸ� ����
	
	System.out.println("s.toLowerCase() : " + s.toLowerCase());  //���� �ҹ��ڷ� �ٲ���.
	System.out.println("s.toUpperCase() : " + s.toUpperCase());  //���� �빮�ڷ� �ٲ���.
	
	s = "        ���ڿ��� trim �޼���            ";
	System.out.println("s.trim() : " + s.trim());  //���� ������ ����, �߰��� �ִ� ������ ���ŵ��� ����.
	
	//��ū : �ǹ��ִ� ���ڿ�. -> ��ūȭ : �ǹ��ִ� ���ڿ��� �з�. (split�� �̰��� �ƴ�.)
	s = "HTML,CSS,JavaScript,Java,JSP,Spring";
	String[] subject = s.split(",");  //split(Regex) : Regex�� �������� ���ڿ��� ������ �迭�� ����.
	for(int i=0; i<subject.length; i++) {
		System.out.println((i+1) + " : " + subject[i]);
	}
	
	//���ڿ� <- �⺻��
	s = "" + 123;  //�̷��� �ᵵ ��������
	s = String.valueOf(123);  //�̰� ���� �´� ��.
	
	//�⺻�� <- ���ڿ�  (String Ŭ���� �ƴϰ� ��� Wrapper Ŭ����)
	int i = Integer.parseInt("123");
	double d = Double.parseDouble("123.5");
	
	//format() : ���Ĺ��ڸ� ����Ͽ� ����ȭ �� �� �ִ� ���
	s = String.format("%.2f", d);
	System.out.println(s);
	s = String.format("%-10d", i);
	System.out.println(s);
	
	}
}
