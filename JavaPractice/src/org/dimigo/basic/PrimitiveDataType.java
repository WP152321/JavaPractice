/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_PrimitiveDataType
 *
 * 1. 개요 : 아이유 프로필 출력하기
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 * 
 * @author : 이동찬
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<<아이유 프로필>>");
		String name = "아이유";
		System.out.println("이름 : " + name);
		boolean b = true ;
		if(b) System.out.println("성별 : 여자");
		else System.out.println("성별 : 남자");
		int z = 25;
		System.out.printf("나이 : %d세\n", z);
		double x = 161.8;
		System.out.printf("키 : %.1fcm\n", x);
		float  c = 44.3f;
		System.out.printf("몸무게 : %.1fkg\n", c);
		char v = 'A';
		System.out.printf("혈액형 : %c형" , v);

	}

}
