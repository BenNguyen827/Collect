import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class main{
	
	public main(String[] args) {
		
		List words = new List();
		Set<String> targetSet = null;		
		
		
		targetSet.add("sup1");
		targetSet.add("sup2");
		targetSet.add("sup3");
		
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
