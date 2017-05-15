/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 * 
 * @author : ldcle
 * @version : 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] sps = {
			new IPhone("IPhone 7", "애플", 900000),
			new Galaxy("갤럭시 S8", "삼성", 800000),
		};
	
	for(SmartPhone sp : sps){
		System.out.println(sp);
		sp.turnOn();
		sp.pay();
		sp.useSpecialFunction(sp);
		sp.turnOff();
	}

	}
}
	
	
