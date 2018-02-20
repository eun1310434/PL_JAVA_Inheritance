/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/
package com.eun1310434.Inheritance;

class ObjectExtends_Sub extends Object{
	//��� Ŭ�������� ObjectŬ������ �⺻������ ��� �Ǿ� ����
	//"class ObjectExtends_Sub{" �� �ۼ��ص� ���� ����
	
	//Object�� �����ϴ� ��ɵ�
	//01) equals(obj);
	//02) getClass();
	//03) hashCode();
	//04) notify();
	//05) notifyAll();
	//06) toString();
	//07) wait();
	//08) wait(timeout);
	//09) wait(timeout, nanos);

}

public class ObjectExtends {
	public static void main(String[] ar){
		ObjectExtends_Sub a = new ObjectExtends_Sub();
		System.out.println("toString() = " + a.toString());
	}

}


