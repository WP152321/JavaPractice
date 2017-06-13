/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_MelonGenreChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 * 
 * @author : ldcle
 * @version : 1.0
 */
public class MelonGenreChart {

	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> balad = new ArrayList<Music>();
		List<Music> dance = new ArrayList<Music>();
		map.put("발라드", balad);
		balad.add(new Music("팔레트", "아이유"));
		map.put("댄스", dance);
		dance.add(new Music("I LUV IT", "PSY"));
		dance.add(new Music("맞지?", "언니쓰"));
		System.out.println("--<<멜론 장르별 차트>>--");
		printMap(map);
		System.out.println();
		dance.add(1, new Music("SIGNAL", "트와이스"));
		dance.remove(2);
		System.out.println("--<< 댄스 2위곡 변경>>--");
		printMap(map);
		System.out.println();
		dance.remove(0);
		System.out.println("--<< 댄스 1위곡 삭제>>--");
		printMap(map);
		System.out.println();
		map.clear();
		System.out.println("--<< 전체 리스트 삭제>>--");
		printMap(map);
		
	}
	
	public static void printMap(Map<String, List<Music>>  map) {
	      for(String key : map.keySet()) {
	    	  System.out.println("[" + key + "]");
	    	  int count = 1;
	    	  for(Music a : map.get(key)) {
	    		  System.out.print(count + ". ");
	    		  System.out.println(a);
	    		  
	    	  }
	      }
	   }

}
