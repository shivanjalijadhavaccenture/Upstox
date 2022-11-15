package practice;

import java.util.HashMap;

public class Occurances_of_char {
	public static void main(String[] args) {
		//String str = "communication status protocol";
		String str = "All is well when end is well";
		//char[] ch = str.toCharArray();
		String[] ch = str.split(" ");
		//HashMap<Character, Integer> hm=new HashMap<>();
		HashMap<String, Integer> hm=new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			if(hm.containsKey(ch[i])) {
				hm.put(ch[i], hm.get(ch[i])+1);
			}
			else {
				hm.put(ch[i], 1);
			}
		}
		System.out.println(hm);
	}

}
