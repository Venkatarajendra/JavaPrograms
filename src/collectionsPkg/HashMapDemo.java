package collectionsPkg;

import java.util.HashMap;

public class HashMapDemo {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
	HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
	
	hashMap.put(0,"Apple");
	hashMap.put(1, "Banana");
	hashMap.put(2, "Grapes");
	hashMap.put(3, "Orange");
	hashMap.put(3, "Orange123");
	
	System.out.println(hashMap);
	
	hashMap.remove(2);
	hashMap.remove(3, "Orange");
	
	System.out.println(hashMap.remove(1, "Orange"));//returns false since the key value pair is different
	System.out.println(hashMap);
	
	System.out.println(hashMap.get(0)); // returns the value of key 0
	
	//to check whether the given key or value existing or not
	System.out.println(hashMap.containsKey(0));
	System.out.println(hashMap.containsValue("Apple"));
	
	//Convert the HashMap to String using toString()
	System.out.println(hashMap.toString());
	
	//Convert the HashMap to Array
	System.out.println(hashMap.entrySet());
	//hashMap.entrySet().toArray();
	
	hashMap.clear(); // removes all key-value pairs of hashmap
	System.out.println(hashMap);
	
	hashMap.put(0,"Apple");
	hashMap.put(1, "Banana");
	hashMap.put(2, "Grapes");
	hashMap.put(3, "Orange");
	System.out.println(hashMap);
	//Cloning the hashMap
	
	HashMap hashMap1 = (HashMap)hashMap.clone();
	System.out.println(hashMap1);
	
	}
}
