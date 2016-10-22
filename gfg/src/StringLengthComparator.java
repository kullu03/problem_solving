import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		List<String> list = new ArrayList<String>();
		list.add(s1);
		list.add(s2);
		Collections.sort(list);
		if(list.get(0).equals(s1)){
			return -1;
		}
		if(list.get(1).equals(s1)){
			return 1;
		}
		
		return 0;
		
		//return s1.length() - s2.length();
	}

}
