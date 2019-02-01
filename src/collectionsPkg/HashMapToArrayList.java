package collectionsPkg;
import java.util.*;
import java.util.Map.Entry;
public class HashMapToArrayList {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		ArrayList<String> al = new ArrayList<String>();
		hm.put("Raj", "King");
		hm.put("Bobby", "Prince");
		hm.put("Varsha", "Princess");
		hm.put("Bangaru", "Queen");
		
		al.addAll(hm.keySet());
		System.out.println(al);
		al.removeAll(hm.keySet());
		al.addAll(hm.values());
		System.out.println(al);		
		Set<Entry<String,String>> entrySet = hm.entrySet();
		ArrayList<Entry<String,String>> al1 = new ArrayList<Entry<String,String>>(entrySet);
		System.out.println(al1);
		for (Entry<String,String> ent : al1) {
			System.out.println(ent.getKey()+":"+ent.getValue());
		}

	}

}
