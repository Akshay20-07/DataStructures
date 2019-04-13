import java.util.*;

public class SetExample{
	public static void main(String[] args){
		Set<String> hSet=new HashSet<String>();
		hSet.add("Geeks");
		hSet.add("For");
		hSet.add("Geeks");
		hSet.add("Example");
		hSet.add("Set");
		System.out.println("Set o/p without duplicates");

		System.out.println(hSet);
		System.out.println("Sorted Set after passing into treeSet");

		Set<String> tSet=new TreeSet<String>(hSet);
		System.out.println(tSet); 

	}
}