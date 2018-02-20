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
		
		//렌덤선언
		for(int i = 0 ; i < p.length; i++){
			int randomNum = new Random().nextInt(2);			
			if(0 == randomNum){
				p[i] = new Polymorphism_Sub_A();
				//다형성으로 선언된 객체"Super A = new Sub()"는
				//상속받은 하위클래스(Sub_A, Sub_B....) 중 어떻한 것으로 
				//선언을 하여도 문제가 발생되지 않는다.
				
			}else if(1 == randomNum){
				p[i] = new Polymorphism_Sub_B();
				//다형성으로 선언된 객체"Super A = new Sub()"는
				//상속받은 하위클래스(Sub_A, Sub_B....) 중 어떻한 것으로 
				//선언을 하여도 문제가 발생되지 않는다.
				
			}else{
				//p[i] = new Polymorphism_NotExtends();
				//ERROR
				//상속받지 않은 클래스는 선언 할 수 없다.
			}
		}
		
		

		//출력
		for(int i = 0 ; i < p.length; i++){
			System.out.println("-----------------------------");
			
			//01) 다형성 - 재정의 된 메소드 접근 : O
			p[i].Print(i);
			//다형성으로 선언된 객체"Super A = new Sub()"는
			//하위클래스(Sub)의 재 정의(Override)를 통해서 
			//상위클래스(Super)의 print(int)가 아닌
			//하위클래스(Sub)의 print(int)가 호출된다.


			//02) 다형성 - 상위클래스 메소드 접근 : O
			p[i].SuperPrint(i);
			//다형성으로 선언된 객체"Super A = new Sub()"는
			//하위클래스(Sub)에 SuperPrint(int)가 없어도
			//접근제한자(public, protected)에 따라
			//상위클래스(Super)의 SuperPrint(int)가 호출된다.

			
			//03) 다형성 - 상위클래스 필드 접근 : O
			System.out.println("Type : "+p[i].type);
			//다형성으로 선언된 객체"Super A = new Sub()"는
			//상위 클래스(Super)의 필드에  접근 가능하다.

			
			//04) 다형성 - 하위클래스 메소드 접근 : X
			//p[i].SubPrint(i);
			//ERROR
			//다형성으로 선언된 객체"Super A = new Sub()"는
			//하위 클래스(Sub)의 메소드에 접근 불가능며
			//하위클래스로 선언된 객체"Sub A = new Sub()"일 때 접근 가능
			

			//05) 다형성 - 하위클래스 필드 접근 : X
			//System.out.println(p[i].name);
			//ERROR
			//다형성으로 선언된 객체"Super A = new Sub()"는
			//하위 클래스(Sub)의 필드에 접근 불가능하며
			//하위클래스로 선언된 객체"Sub A = new Sub()"일 때 접근 가능
			
		}
	}
}


