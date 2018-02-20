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
		//오버라이딩 관계
		//Super에 동일한 이름의 메소드 존재 aaa() 하므로
		//Super의 aaa() 메소드를 Sub에서 재정의 하여
		//호출시 Super의 aaa()가 아닌 Sub의 aaa() 호출
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


