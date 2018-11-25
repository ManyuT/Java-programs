package String_Programs;
/**
 * @author abhimanyu.thite
 *
 * Problem: Count Number of Words in a String - Java Program
 *
 */
public class CountNumberOfWords {

	public static void main(String[] args) {
		
		System.out.println("Number of words without using split: "+countNumberOfWordsWithoutSplit("Hello this is string"));
		
		System.out.println("Number of words with using split: "+countNumberOfWordsWithUsingSplit("Hello this is string"));

	}

	/**
	 * This method returns the number of words using the split
	 * 
	 * @param string
	 * @return
	 */
	private static int countNumberOfWordsWithUsingSplit(String string) {

		String[] splitStr = string.trim().split("\\s+");
		return splitStr.length;
	}

	/**
	 * This method returns the number of words not using the split
	 * 
	 * @param str
	 * @return
	 */
	private static int countNumberOfWordsWithoutSplit(String str) {
		
		int i, counter=0;
		char ch[]=new char[str.length()];
		
		for(i=0;i<str.length();i++) {
			ch[i] = str.charAt(i);
			
			if (i+1 < str.length()) {
				ch[i+1]=str.charAt(i+1);
			}
			
			if (i+1<str.length() && 
					(ch[i]!=' ' || ch[i]!='\t') && (ch[i+1]==' ' || ch[i+1]=='\t') ||
					(i+1 == str.length() && ch[i] != ' ')) {
				counter ++;
			}
		}
		
		return counter;
		
	}

}
