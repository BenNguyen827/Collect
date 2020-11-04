import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.List;


public class main{
	
	public main(String[] args) {
		
		
		int count = 0;
		List<String> words = Arrays.asList("1", "2", "3");		
		Set<String> targetSet = null;		
		for (String t : words) { 
			for (String a : words) { 
				
	           if(a == t)
	        	   count++;
	            
			}
			if (count ==1) {
			 targetSet.add(t);
			}
		}
		
		
		
		
HashMap<String,Integer> hash = new HashMap<String,Integer>();
 hash.put("Hello",1 );
 hash.put("Bye",2);
 
 for(String word : hash.keySet()) {
	 System.out.println(word);
 }
 
//treeMap

TreeMap<String,Integer> tree = new TreeMap<String,Integer>();
tree.put("Hello",1 );
tree.put("Bye",2);

for(String word2 : tree.keySet()) {
	 System.out.println(word2);
}

	}
	
	
//hashmap provides no order to its list elements while treemap can
//if you wanted to guarantee the order of key,value pairs you would use treeMap
}
