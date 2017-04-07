/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Group
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 7.
 * </pre>
 * 
 * @author : ldcle
 * @version : 1.0
 */
public class Group {

	public static void main(String[] args) {
		String[ ] groupName = new String[]{"빅뱅", "2NE1", "걸스데이"};
		
		String[ ][ ] memberName = new String[][]{ {"GD", "태양", "대성", "탑", "승리"}, 
				{"CL", "산다라박", "박봄", "민지"}, {"유라", "혜리", "소진", "민아"} };
				
		for(int k=0;k<groupName.length;k++){
			System.out.printf("<<%s>>\n", groupName[k]);
			for(int i=0;i<memberName[k].length;i++){
				System.out.printf("%s\n", memberName[k][i]);
			}
			System.out.println();
		}


	}

}
