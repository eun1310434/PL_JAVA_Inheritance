/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/
package com.eun1310434.Inheritance;
public class Overloading_MainMethod {
	public static void main(String[] args){
		System.out.println("main with String[]");
	}
	
	public static void main(String args){
		System.out.println("main with String");
	}
	
	public static void main(){
		System.out.println("main without args");
	}
}

//You can have any number of main methods in a class by method overloading. 
//But JVM calls main() method which receives string array as arguments only.
