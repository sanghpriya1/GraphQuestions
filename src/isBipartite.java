import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class isBipartite {
	private static boolean dfs(int index,  ArrayList<List<Integer>> graph, int[] color) {

		int parentColor = color[index];
		 Iterator<Integer> i = graph.get(index).listIterator();
		 while(i.hasNext()) {
			 int childNode = i.next();
			 if(color[childNode] == parentColor)return false;
				if(color[childNode] == -1) {
					color[childNode] = 1 - parentColor;
					if(!dfs(childNode, graph, color))return false;
				}
			 
		 }
		return true;
	}
	
	private static boolean is_bipartite(int[][] A, int  n) {
		ArrayList<List<Integer>> graph = new ArrayList<List<Integer>>();
		for(int i = 0 ; i < n; ++i) {
			graph.add(new ArrayList<Integer>());
		}
		for(int i = 0; i < A.length; i++) {
				graph.get(A[i][0]).add(A[i][1]);
				graph.get(A[i][1]).add(A[i][0]);
				
		}
		int[] color = new int[n];
		Arrays.fill(color, -1);
		for(int i = 0; i < n; ++i) {
			if(color[i] == -1) {
				color[i] = 1;
				if(!dfs(i, graph, color))return false;
			}
		}
	return true;
	}
	
	public static void main(String[] args) {
		int[][] A = new int[][] {{8, 2}, {2, 5},{2, 3}, {2, 1},{8, 7},{2, 0},{0, 6},{1, 4}};
		int n = 9;
		boolean t = is_bipartite(A, n);
		System.out.println(t);
	}

}
