package Inheritance;
class Overloading_Super{
	public void aaa(){
		System.out.println("super : aaa()");
	}
}

class Overloading_Sub extends Overloading_Super{
	public void aaa(String _txt){
		//�����ε� ����
		//Super�� ������ �̸��� �޼ҵ� ���� aaa()�ϳ�
		//�ñ״�ó(signature, �Ű�����)�� �� �޼ҵ带 ���� ����
		//01) �żҵ尡 ���� : Super�� aaa() ȣ��
		//02) �żҵ尡 ���� : Sub�� aaa(String) ȣ��
		
		System.out.println("sub : aaa("+_txt+")");
	}
}
public class Overloading {
	public static void main(String[] ar){
		System.out.println("Sub a = new Sub();");
		Overloading_Sub a = new Overloading_Sub();
		a.aaa(); 
		//Sub�� aaa()�޼ҵ尡 ���⿡ Super�� aaa()�޼ҵ� ȣ��
		
		a.aaa("String"); 
		//Sub�� aaa(String)�޼ҵ� ȣ��
		//�����ε� ����
	}
}

