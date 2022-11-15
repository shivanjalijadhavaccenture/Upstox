package practice;

public class Reverse_string {
	public static void main(String[] args) {
		String s="mumbai";
		
		String str = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			str=str+s.charAt(i);
		}
		System.out.println(str);
	}

}
