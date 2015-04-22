
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS_DFS {

	int Matrix[][];
	int rNode = 0;
	int Node;

	boolean[] visited;

	BFS_DFS(int A[][]) {
		int i, j;

		Node = A.length;

		Matrix = new int[Node][Node];
		visited = new boolean[Node];

		for (i = 0; i < Node; i++)
			for (j = 0; j < Node; j++)
			Matrix[i][j] = A[i][j];
	}

	public void BreadthFirstSearch() {

		Queue<Integer> queue = new LinkedList<Integer>();

		clearVisited();

		queue.add(0);

		while (!queue.isEmpty()) {

			int nextNode;

			int i;

			nextNode = queue.remove();

			if (!visited[nextNode]) {

				visited[nextNode] = true;

				System.out.println("nextNode = " + nextNode);

				for (i = 0; i < Node; i++)

					if (Matrix[nextNode][i] > 0 && !visited[i])
						queue.add(i);
			}
		}
	}

	public void DepthFirstSearch() {

		Stack<Integer> stack = new Stack<Integer>();

		stack.push(rNode);
		visited[rNode] = true;

		System.out.println(rNode);

		while (!stack.isEmpty()) {
			int number, child;

			number = (stack.peek()).intValue();

			child = getUnvisitedChildNode(number);

			if (child != -1) {
				visited[child] = true;

				System.out.println(number);

				stack.push(child);
			} else {
				stack.pop();
			}
		}

		for (int i = 0; i < visited.length; i++)
			visited[i] = false;
	}

	void clearVisited() {
		int i;

	      for (i = 0; i < visited.length; i++){
	         visited[i] = false;
	      }

	}
	public void AdjMrtix(int x[][],int v){
		
		System.out.println("\n");
		System.out.println("Adjacency Matrix:\n\n");
		for (int j = 1; j <= v; j++) {
			for (int k = 1; k <= v; k++) {
				System.out.println(x[j][k]);
			}
			System.out.println("\n");
		}

			
	}
	
public void Adjlist(int x[][],int v){
		
	System.out.println("Adjacency List:\n\n");
	for (int i = 1; i <= v; i++) {
		System.out.println(i);
		for (int j = 1; j <= v; j++) {
			if (x[i][j] == 1) {
				System.out.println(" ->");
				System.out.println(j);
			}
		}
		System.out.println("\n");
	}


			
	}

	

	int getUnvisitedChildNode(int n) {
		int j;

		for (j = 0; j < Node; j++) {
			if (Matrix[n][j] > 0) {
				if (!visited[j])
					return (j);
			}
		}

		return (-1);
	}

}
