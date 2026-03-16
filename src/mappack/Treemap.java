package mappack;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Double> hm=new TreeMap<String,Double>();
		System.out.println("size of the hashmap:"+hm.size());
		hm.put("john doe",234.213);
		hm.put("julyn",2344.213);
		hm.put("kumaer",2134.13);
		hm.put("smith",134.213);
		hm.put("williams",34.213);
		System.out.println("elements in the hashmap :"+hm);
		System.out.println("size of the hashmap :"+hm.size());
		Set<Map.Entry<String,Double>> set=hm.entrySet();
		for(Map.Entry<String,Double>me:set) {
			System.out.println(me.getKey()+" :"+me.getValue());
			
		}//key ascending order/ sorted map

	}

}
