/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 * 
 * @author : ldcle
 * @version : 1.0
 */
public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System. in); 
		String[] questions = {".가장 좋아하는 가수는?", ".가장 좋아하는 배우는?", ".가장 좋아하는 과목은?"};
		String[] answers = {"스탠딩에그", "김고은", "체육"}; 
		
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + questions[i]);
			String answer = scanner.nextLine();
			if(answers[i].equals(answer)) {
				System.out.println("정답입니다!");
			}
			else System.out.println("오답입니다!");
		}
		
		System.out.println("<<결과출력>>");
		for(int i = 0; i < 3; i++){
			System.out.println((i + 1) + questions[i] +  answers[i]);
		}

	}

}
