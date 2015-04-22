import java.util.Scanner;
public class RUN_BFSDFS {
 static	int v,e,a,b;
	   public static void main(String[] args)
	   {
	
	int x[][]=new int[500][5000];
	Scanner nScanner=new Scanner(System.in);
	v=nScanner.nextInt();
	e=nScanner.nextInt();

	for(int i=1;i<=e;i++){
		a=nScanner.nextInt();
		b=nScanner.nextInt();
	    
	    x[a][b]=1;
	    x[b][a]=1;
	}

    
	BFS_DFS bfs_dfs = new BFS_DFS(x);
	bfs_dfs.AdjMrtix(x, v);
	
	bfs_dfs.Adjlist(x, v);

	      bfs_dfs.BreadthFirstSearch();
	      

	      bfs_dfs.clearVisited();
	      bfs_dfs.DepthFirstSearch();

	   }
	}