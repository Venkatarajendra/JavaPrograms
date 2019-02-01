package stringsPkg;

// Program to reverse the words of the sentence

public class ReverseWordsInSentence {
	static String reverseString(String st) {
		String res = "";
		for (int i=st.length()-1; i>=0;i--) {
			res = res+st.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) {
		String str = "Dandu Venkata Rajendra";
		String[] words = str.split(" ");
		String output = "";
		String revoutput = "";
		
		// below code is for reverse the sentence with words but not the character of words
		for (int i=words.length-1; i>=0; i--) {
			output = output+words[i]+" ";
			
		}
		System.out.println(output);
		
		// below code is for reverse the sentence with words & character of words
			for (int i=words.length-1; i>=0; i--) {
				String rev = reverseString(words[i]);
				revoutput = revoutput+rev+" ";
				
			}
			System.out.println(revoutput);

	}

}
