package Inheritance;
class Overloading_Super{
	public void aaa(){
		System.out.println("super : aaa()");
	}
}

class Overloading_Sub extends Overloading_Super{
	public void aaa(String _txt){
		//오버로딩 관계
		//Super에 동일한 이름의 메소드 존재 aaa()하나
		//시그니처(signature, 매개변수)로 두 메소드를 구분 가능
		//01) 매소드가 없음 : Super의 aaa() 호출
		//02) 매소드가 있음 : Sub의 aaa(String) 호출
		
		System.out.println("sub : aaa("+_txt+")");
	}
}
public class Overloading {
	public static void main(String[] ar){
		System.out.println("Sub a = new Sub();");
		Overloading_Sub a = new Overloading_Sub();
		a.aaa(); 
		//Sub에 aaa()메소드가 없기에 Super의 aaa()메소드 호출
		
		a.aaa("String"); 
		//Sub에 aaa(String)메소드 호출
		//오버로딩 관계
	}
}

