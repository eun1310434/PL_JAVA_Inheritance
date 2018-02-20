/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/
package com.eun1310434.Inheritance;

class UseSuper_Super{
	
	private int x;
	private int y;
	
	//접근 제한자에 따른 필드의 상속
	//private   : 상속 되는 하위 클래스 접근 X
	//protected : 상속 되는 하위 클래스까지 접근O
	//package   : 동일한 패키지나 동일한 폴더까지 접근O
	//public    : 어디서든 접근O
	
	
	public UseSuper_Super(){
		this.x = 0;
		this.y = 0;
	}
	
	public UseSuper_Super(int _x, int _y){
		this();
		//this();는 위에 작성한 UseSuper_Super()임
		
		this.x = _x;
		this.y = _y;
	}
	
	public void display(){
		System.out.println("super : x = "+ x );
		System.out.println("super : y = "+ y);
	}
}


class UseSuper_Sub extends UseSuper_Super{
	//extends를 통해 UseSuper_Super의 기능을 상속 받음
	private int z;
	
	public UseSuper_Sub(){
		//super();
		this.z = 0;
	}
	
	public UseSuper_Sub(int _x, int _y, int _z){
		super(_x, _y);
		//UseSuper_Super 클래스의 
		//UseSuper_Super(int _x, int _y)를 지칭함
		
		this.z = _z;
		//현 클래스의 z에 값 입력 
		
		//super(_x, _y); 
		//ERROR
		//선언 부분의 super메소드는 제일 첫번째 줄에 꼭 적어야 함
	}

	public void display(){
		super.display();
		//UseSuper_Super 클래스의 display()를 지칭함
		//super라는 객체를 통해 접근하는 메소드는 어디든 작성해도 문제 없음
		
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
