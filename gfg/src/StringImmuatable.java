
public class StringImmuatable {

	public static void main(String[] args) {
		String word = "dfkjdhkgdfjkgdfkgjkdfgjkfjkgdfhgfgjkfhgghfkghkfhgdfghfdkghkfghkfhg"
				+ "gdkfjgfdgjkfghhdfkjghkfjgjkfdgkjkfjkkffdsjkfdfkghdfhkgdfhghfgkgkfghjfj"
				+ "dfgkljdfkgfgghoinvklvklbvlnb vbllkvbnlbnlbvnbnlnlblnblnmbnlbnkblnlbn"
				+ "bcvbkvcnbcvklbklvbklbklnbfvjdfkgkfjgkjfkgbbjkfgjkbjkgjkbfghgj";
		
		StringBuilder sentence = new StringBuilder();
		word = new String(new char[10000000]).replace("\0", word);
		System.out.println(word.length());
		for(int i = 0; i < word.length(); i++){
			sentence = sentence.append(word.charAt(i));
		}
		
		System.out.println(sentence);
			
	}

}
