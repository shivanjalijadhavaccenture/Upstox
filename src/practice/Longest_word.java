package practice;

public class Longest_word {
	public static void main(String[] args) {
		String str = "have a wonderful day";
		char[] ch = str.toCharArray();
		String word = "";
		String longword = "";
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				word=word+ch[i];
			}
			else {
				if(word.length()>longword.length()) {
					longword=word;
				}
				word="";
			}
			
		}
		System.out.println(longword);
	}

}
