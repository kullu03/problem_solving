package facebook;

import java.util.HashMap;
import java.util.Scanner;

public class DigitToWordConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		String [] golden = new String[]{"one","ten","Hundred","thousands","ten thousands","lac","ten lakhs","crore"};
		String [] charr = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
		String [] tens = new String[]{"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		HashMap<Integer,String>lastTwoDigits = new HashMap<Integer,String>();
		lastTwoDigits.put(10, "ten");
		lastTwoDigits.put(11, "eleven");
		lastTwoDigits.put(12, "tweleve");
		lastTwoDigits.put(13, "thirteen");
		lastTwoDigits.put(14, "fourteen");
		lastTwoDigits.put(15, "fifteen");
		lastTwoDigits.put(16, "sixteen");
		lastTwoDigits.put(17, "seventeen");
		lastTwoDigits.put(18, "eighteen");
		lastTwoDigits.put(18, "Nineteen");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if(input.length() >8){
			new Exception("Number length greater than 8 is not supported !!!");
			System.exit(1);
		}
		
		int n = input.length()-1;
		
		StringBuilder output = new StringBuilder();
		int i =0;
		String lt = input.substring(n-2);
		int ltb = Integer.parseInt(lt);
		
		while( n-2 >= 0){
			char c = input.charAt(i);
			i++;
			//int a = Character.getNumericValue('3');
			try{
			int a = Integer.parseInt(String.valueOf(c));
			
			output.append(charr[a]).append(" ").append(golden[n--]).append(" ");
			}
			catch(NumberFormatException nfe){
				System.err.println(nfe.getMessage());
			}
			
			
		}
		
		// handle last two digits
		if(ltb >= 10 && ltb <= 19){
			output.append(lastTwoDigits.get(ltb));
		}
		else{
			char c = input.charAt(input.length()-2);
			i++;
			//int a = Character.getNumericValue('3');
			
			int b = Integer.parseInt(String.valueOf(c));
			output.append(" ").append(tens[b-1]).append(" ");
		 c = input.charAt(input.length()-2);
			i++;
			//int a = Character.getNumericValue('3');
			
			 b = Integer.parseInt(String.valueOf(c));
			output.append(charr[b+1]);
			
		}
		
		System.out.println(output.toString());

	}

}
