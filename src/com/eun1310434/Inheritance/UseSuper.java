/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/
package com.eun1310434.Inheritance;

class UseSuper_Super{
	
	private int x;
	private int y;
	
	//���� �����ڿ� ���� �ʵ��� ���
	//private   : ��� �Ǵ� ���� Ŭ���� ���� X
	//protected : ��� �Ǵ� ���� Ŭ�������� ����O
	//package   : ������ ��Ű���� ������ �������� ����O
	//public    : ��𼭵� ����O
	
	
	public UseSuper_Super(){
		this.x = 0;
		this.y = 0;
	}
	
	public UseSuper_Super(int _x, int _y){
		this();
		//this();�� ���� �ۼ��� UseSuper_Super()��
		
		this.x = _x;
		this.y = _y;
	}
	
	public void display(){
		System.out.println("super : x = "+ x );
		System.out.println("super : y = "+ y);
	}
}


class UseSuper_Sub extends UseSuper_Super{
	//extends�� ���� UseSuper_Super�� ����� ��� ����
	private int z;
	
	public UseSuper_Sub(){
		//super();
		this.z = 0;
	}
	
	public UseSuper_Sub(int _x, int _y, int _z){
		super(_x, _y);
		//UseSuper_Super Ŭ������ 
		//UseSuper_Super(int _x, int _y)�� ��Ī��
		
		this.z = _z;
		//�� Ŭ������ z�� �� �Է� 
		
		//super(_x, _y); 
		//ERROR
		//���� �κ��� super�޼ҵ�� ���� ù��° �ٿ� �� ����� ��
	}

	public void display(){
		super.display();
		//UseSuper_Super Ŭ������ display()�� ��Ī��
		//super��� ��ü�� ���� �����ϴ� �޼ҵ�� ���� �ۼ��ص� ���� ����
		
		System.out.println("sub : z = "+ z);
	}
}


public class UseSuper{

	public static void main(String[] ar){
		System.out.println("Sub a1 = new Sub();");
		UseSuper_Sub a1 = new UseSuper_Sub();
		a1.display();
		System.out.println("");

		System.out.println("Sub a2 = new Sub(1,1,1);");
		UseSuper_Sub a2 = new UseSuper_Sub(1,1,1);
		a2.display();
		System.out.println("");
	}

}
