package cgg.collection;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapForEachKeyExample {

	public static void main(String[] args) {
		
		ConcurrentHashMap<String, UUID> map = new ConcurrentHashMap<>();
		for (int i = 1; i <= 50; i++) {
			map.put("SessionId_"+i, UUID.randomUUID());
		}
		
		map.forEachKey(3, System.out::println);
		
		System.out.println("----------------------------------");
		
		map.forEachValue(3, System.out::println);
		
		System.out.println("----------------------------------");
		
		map.forEachEntry(3, e->System.out.println(e.getKey()+"\t"+e.getValue()));
	}

}