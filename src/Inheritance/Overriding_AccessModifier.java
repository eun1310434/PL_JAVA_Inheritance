package Inheritance;
class Overriding_AccessModifier_Super{
	protected void aaa(){
		System.out.println("super : aaa()");
	}
}

class Overriding_AccessModifier_Sub extends Overriding_AccessModifier_Super{
	public void aaa(){
		//private void aaa(){
		//하위클래스의 접근제한자(Access Modifier)가 
		//상위클래스의 접근제한자보다 포괄적인 범위를 갖어야 함
		System.out.println("sub : aaa()");
	}
}

public class Overriding_AccessModifier {
	public static void main(String[] ar){		
		System.out.println("Sub a = new Sub();");
		Overriding_AccessModifier_Sub a = new Overriding_AccessModifier_Sub();
		a.aaa();
	}

}


