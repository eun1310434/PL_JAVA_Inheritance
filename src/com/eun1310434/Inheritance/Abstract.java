/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/
package com.eun1310434.Inheritance;

import java.util.Random;
//
abstract class Abstract_Super{
	//class Abstract_Super{
	//ERROR
	//추상메소드를 하나라도 사용하면 추상클래스로 작성
	
	public abstract void Print(int i);
	//추상 메소드는 내용부 구현을 하지 않음
	//대신 상속 받은 하위클래스에서 구현부를 작성
	//추상메소드를 하나라도 사용하면 추상클래스로 작성
	
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

		//렌덤선언
		for(int i = 0 ; i < a.length; i++){
			int randomNum = new Random().nextInt(2);			
			if(0 == randomNum){
				a[i] = new Abstract_Sub_A();
				//다형성으로 선언된 객체"Super A = new Sub()"는
				//상속받은 하위클래스(Sub_A, Sub_B....) 중 어떻한 것으로 
				//선언을 하여도 문제가 발생되지 않는다.
				
			}else if(1 == randomNum){
				a[i] = new Abstract_Sub_B();
				//다형성으로 선언된 객체"Super A = new Sub()"는
				//상속받은 하위클래스(Sub_A, Sub_B....) 중 어떻한 것으로 
				//선언을 하여도 문제가 발생되지 않는다.
				
			}else{
				
				//a[i] = new Abstract_Super();
				//ERROR
				//추상클래스는 객체가 될수 없음(인스턴스화X)
				//직접 접근은 불가능
			}
		}

		//출력
		for(int i = 0 ; i < a.length; i++){
			System.out.println("-----------------------------");
			
			//추상클래스 활용한 다형성 - 구현된 된 메소드 접근 : O
			a[i].Print(i);
			//추상클래스 활용한 다형성으로 선언된 
			//객체 "Super A = new Sub()"는
			//상위클래스(Super)의 추상메소드 print(int)를 결코 호출 못하며,
			//하위클래스(Sub)에 구현된 print(int)가 호출된다.
		}
	}
}
