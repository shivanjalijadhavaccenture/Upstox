package practice;

public class Reverse_word_in_string {
	public static void main(String[] args) {
		String str = "happy diwali to all";
		String[] sent = str.split(" ");
		
		for(int i=0;i<=sent.length-1;i++) {
			char[] word = sent[i].toCharArray();
			String rev = "";
			for(int j=word.length-1;j>=0;j--) {
				rev=rev+word[j];
			}
			System.out.print(rev+" ");
			
		}
	}

}
