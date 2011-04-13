import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//1.Implement an algorithm to determine if a string has all unique characters 
//What if you can not use additional data structures?

/**
 * @author Wenzhe
 * 
 */
public class UniqueChar {

	public boolean isUniqueChar(String str) {

		ArrayList<Character> charset = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {

			if (!charset.contains(str.charAt(i))) {
				charset.add(str.charAt(i));
			} else
				return false;
		}
		return true;
	}

}
