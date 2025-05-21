package day3;

public class demo2 {

	public static void main(String[] args) {
		String s1="Helloworld";	
		int vowel=0,consonants=0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowel++;
			}
			else if (ch>='a'&&ch<='z') {
				consonants++;
				
			}
		}
		
		System.out.println("vowels:"+ vowel +",Consonants:" + consonants);
	}
}

