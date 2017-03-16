/**
 * 
 */
package org.dimigo.basic;

import java.util.Scanner;
import java.util.Random;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Loop
 *
 * 1. 개요 : 초간단 게임프로그램
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 * 
 * @author : 이동찬
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int attack;
		int a = 100;
		
		do{
			System.out.println("-------------------");
			System.out.println("<< 게임메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("-------------------");
			System.out.println("메뉴 입력 =>");
			attack = scanner.nextInt();
			
			switch(attack){
			case 1:
				a += 10;
				System.out.printf("공격력이 증가되었습니다. 현재공격력 : %d\n", a);  break;
			case 2:
				a -= 10;
				System.out.printf("공격력이 감소되었습니다. 현재공격력 : %d\n", a);  break;
			case 3:
				Random n = new Random();
				int num = n.nextInt(4) + 1;
				switch(num){
				case 1:
					System.out.println("마법사(으)로 설정되었습니다.");  break;
				case 2:
					System.out.println("영주(으)로 설정되었습니다.");  break;
				case 3:
					System.out.println("기사(으)로 설정되었습니다.");  break;
				case 4:
					System.out.println("농민(으)로 설정되었습니다"); break;
				} break;
			case 9:
				System.out.println("이제 공부하세요!");   scanner.close(); break;
			default: System.out.println("없는 메뉴입니다!");
			}
		} while(attack != 9);

	}
}
