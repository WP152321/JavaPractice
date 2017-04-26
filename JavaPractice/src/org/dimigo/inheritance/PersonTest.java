/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_PersonTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 26.
 * </pre>
 * 
 * @author : ldcle
 * @version : 1.0
 */
public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("Tom");
		Korean k = new Korean("홍길동");
		Japanese j = new Japanese("다나카");
		Chinese c = new Chinese("왕밍");
		
		System.out.println(p);
		System.out.println(k);
		System.out.println(j);
		System.out.println(c);
		
		p.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();
		
		p.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye();

	}

}
