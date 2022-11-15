package practice;

public class No_of_words_in_string {
	public static void main(String[] args) {
		String str = " java is easy language";
		//String[] s1 = str.split(" ");
		//System.out.println(s1.length);
		int count=0;
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ' && ch[i+1]!=' ') {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
