/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
*/
package com.eun1310434.Inheritance;
class Overriding_Super{
	public void aaa(){
		System.out.println("super : aaa()");
	}
}

class Overriding_Sub extends Overriding_Super{
	public void aaa(){		
		//�������̵� ����
		//Super�� ������ �̸��� �޼ҵ� ���� aaa() �ϹǷ�
		//Super�� aaa() �޼ҵ带 Sub���� ������ �Ͽ�
		//ȣ��� Super�� aaa()�� �ƴ� Sub�� aaa() ȣ��
		System.out.println("sub : aaa()");
	}
}

public class Overriding {
	public static void main(String[] ar){
		System.out.println("Sub a = new Sub();");
		Overriding_Sub a = new Overriding_Sub();
		a.aaa();
	}

}


