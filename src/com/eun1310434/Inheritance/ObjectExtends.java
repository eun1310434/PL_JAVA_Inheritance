/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/
package com.eun1310434.Inheritance;

class ObjectExtends_Sub extends Object{
	//모든 클래스에는 Object클래스가 기본적으로 상속 되어 있음
	//"class ObjectExtends_Sub{" 라 작성해도 문제 없음
	
	//Object가 제공하는 기능들
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


