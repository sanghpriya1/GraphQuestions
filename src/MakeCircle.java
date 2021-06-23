import java.util.ArrayList;

public class MakeCircle {
	private static boolean if_circle(ArrayList<String> A) {
		int[] alphabet = new int[26];
		for(int i = 0; i < A.size(); i++) {
			String s = A.get(i);
			int x = s.charAt(0) - 'a';
			alphabet[x]++;
			int y = s.charAt(s.length()-1)- 'a';
			alphabet[y]--;
			 
			
		}
		
		for(int i = 0; i < 26; ++i) {
			if(alphabet[i] != 0) return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		ArrayList<String> A = new ArrayList<String>();
		A.add("aab");
		A.add("bac");
		A.add("zaz");
		A.add("cda");
		if(if_circle(A))System.out.println(1);
		else System.out.println(0);
		
	}
}
