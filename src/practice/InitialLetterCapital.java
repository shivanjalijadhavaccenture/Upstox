package practice;

public class InitialLetterCapital {
	public static void main(String[] args) {
		String s = "hello good morning";
		String[] str=s.split(" ");
		String s1 = "";
		for(int i=0;i<str.length;i++) {
			 s1=s1+" "+str[i].substring(0,1).toUpperCase()+str[i].substring(1);
		}
	
		System.out.println(s1);
	}

}
