/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/
package com.eun1310434.Inheritance;

import java.util.Random;
//
abstract class Abstract_Super{
	//class Abstract_Super{
	//ERROR
	//�߻�޼ҵ带 �ϳ��� ����ϸ� �߻�Ŭ������ �ۼ�
	
	public abstract void Print(int i);
	//�߻� �޼ҵ�� ����� ������ ���� ����
	//��� ��� ���� ����Ŭ�������� �����θ� �ۼ�
	//�߻�޼ҵ带 �ϳ��� ����ϸ� �߻�Ŭ������ �ۼ�
	
}

class Abstract_Sub_A extends Abstract_Super{
	public void Print(int i){
		System.out.println(i+" - sub_A");
	}
}

class Abstract_Sub_B extends Abstract_Super{
	public void Print(int i){
		System.out.println(i+" - sub_B");
	}
}

public class Abstract {
	public static void main(String[] ar){
		Abstract_Super[] a = new Abstract_Super[10];

		//��������
		for(int i = 0 ; i < a.length; i++){
			int randomNum = new Random().nextInt(2);			
			if(0 == randomNum){
				a[i] = new Abstract_Sub_A();
				//���������� ����� ��ü"Super A = new Sub()"��
				//��ӹ��� ����Ŭ����(Sub_A, Sub_B....) �� ��� ������ 
				//������ �Ͽ��� ������ �߻����� �ʴ´�.
				
			}else if(1 == randomNum){
				a[i] = new Abstract_Sub_B();
				//���������� ����� ��ü"Super A = new Sub()"��
				//��ӹ��� ����Ŭ����(Sub_A, Sub_B....) �� ��� ������ 
				//������ �Ͽ��� ������ �߻����� �ʴ´�.
				
			}else{
				
				//a[i] = new Abstract_Super();
				//ERROR
				//�߻�Ŭ������ ��ü�� �ɼ� ����(�ν��Ͻ�ȭX)
				//���� ������ �Ұ���
			}
		}

		//���
		for(int i = 0 ; i < a.length; i++){
			System.out.println("-----------------------------");
			
			//�߻�Ŭ���� Ȱ���� ������ - ������ �� �޼ҵ� ���� : O
			a[i].Print(i);
			//�߻�Ŭ���� Ȱ���� ���������� ����� 
			//��ü "Super A = new Sub()"��
			//����Ŭ����(Super)�� �߻�޼ҵ� print(int)�� ���� ȣ�� ���ϸ�,
			//����Ŭ����(Sub)�� ������ print(int)�� ȣ��ȴ�.
		}
	}
}
