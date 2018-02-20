/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
*/
package com.eun1310434.Inheritance;

import java.util.Random;

class Polymorphism_Super{
	public String type = "Super";
	
	public void Print(int i){
		System.out.println(i+" - super");
	}
	protected void SuperPrint(int i){
		System.out.println(i+" - SuperPrint");
	}
}

class Polymorphism_Sub_A extends Polymorphism_Super{
	public String type = "Sub";
	public String name = "A";
	
	public void Print(int i){
		System.out.println(i+" - sub_A");
	}
	
	public void SubPrint(int i){
		System.out.println(i+" - SubPrint_A");
	}
}

class Polymorphism_Sub_B extends Polymorphism_Super{
	public String type = "Sub";
	public String name = "B";
	
	public void Print(int i){
		System.out.println(i+" - sub_B");
	}
	
	public void SubPrint(int i){
		System.out.println(i+" - SubPrint_B");
	}
}

class Polymorphism_NotExtends{
	public String type = "NotExtends";
	public String name = "C";
	public void print(int i){
		System.out.println(i+" - Polymorphism_NotExtends");
	}
}

public class Polymorphism {
	public static void main(String[] ar){
		Polymorphism_Super[] p = new Polymorphism_Super[10];
		
		//��������
		for(int i = 0 ; i < p.length; i++){
			int randomNum = new Random().nextInt(2);			
			if(0 == randomNum){
				p[i] = new Polymorphism_Sub_A();
				//���������� ����� ��ü"Super A = new Sub()"��
				//��ӹ��� ����Ŭ����(Sub_A, Sub_B....) �� ��� ������ 
				//������ �Ͽ��� ������ �߻����� �ʴ´�.
				
			}else if(1 == randomNum){
				p[i] = new Polymorphism_Sub_B();
				//���������� ����� ��ü"Super A = new Sub()"��
				//��ӹ��� ����Ŭ����(Sub_A, Sub_B....) �� ��� ������ 
				//������ �Ͽ��� ������ �߻����� �ʴ´�.
				
			}else{
				//p[i] = new Polymorphism_NotExtends();
				//ERROR
				//��ӹ��� ���� Ŭ������ ���� �� �� ����.
			}
		}
		
		

		//���
		for(int i = 0 ; i < p.length; i++){
			System.out.println("-----------------------------");
			
			//01) ������ - ������ �� �޼ҵ� ���� : O
			p[i].Print(i);
			//���������� ����� ��ü"Super A = new Sub()"��
			//����Ŭ����(Sub)�� �� ����(Override)�� ���ؼ� 
			//����Ŭ����(Super)�� print(int)�� �ƴ�
			//����Ŭ����(Sub)�� print(int)�� ȣ��ȴ�.


			//02) ������ - ����Ŭ���� �޼ҵ� ���� : O
			p[i].SuperPrint(i);
			//���������� ����� ��ü"Super A = new Sub()"��
			//����Ŭ����(Sub)�� SuperPrint(int)�� ���
			//����������(public, protected)�� ����
			//����Ŭ����(Super)�� SuperPrint(int)�� ȣ��ȴ�.

			
			//03) ������ - ����Ŭ���� �ʵ� ���� : O
			System.out.println("Type : "+p[i].type);
			//���������� ����� ��ü"Super A = new Sub()"��
			//���� Ŭ����(Super)�� �ʵ忡  ���� �����ϴ�.

			
			//04) ������ - ����Ŭ���� �޼ҵ� ���� : X
			//p[i].SubPrint(i);
			//ERROR
			//���������� ����� ��ü"Super A = new Sub()"��
			//���� Ŭ����(Sub)�� �޼ҵ忡 ���� �Ұ��ɸ�
			//����Ŭ������ ����� ��ü"Sub A = new Sub()"�� �� ���� ����
			

			//05) ������ - ����Ŭ���� �ʵ� ���� : X
			//System.out.println(p[i].name);
			//ERROR
			//���������� ����� ��ü"Super A = new Sub()"��
			//���� Ŭ����(Sub)�� �ʵ忡 ���� �Ұ����ϸ�
			//����Ŭ������ ����� ��ü"Sub A = new Sub()"�� �� ���� ����
			
		}
	}
}


