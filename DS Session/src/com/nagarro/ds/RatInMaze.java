package com.nagarro.ds;

//import java.util.*;

//public class RatInMaze {
	   
//	    private static void printSolution(int r1, int c1, int[][] solution)
//	    {
//	        for(int i=0;i<r1;i++)
//	        {
//	            for(int j=0;j<c1;j++)
//	            {
//	                System.out.print(solution[i][j]+" ");
//	            }
//	            System.out.println("");
//	        }
//	    }
//	    private static boolean solveMaze(int r, int c,int r1, int c1, String[][] maze, int[][] solution)
//	    {
//	        if((r==r1-1) && (c==c1-1))
//	        {
//	            solution[r][c] = 1;
//	            return true;
//	        }
//	        if(r>=0 && c>=0 && r<r1 && c<c1 && maze[r][c].equals("X"))
//	        {
//	            solution[r][c] = 1;
//	            //going down
//	            if(solveMaze(r+1, c, r1, c1, maze, solution))
//	                return true;
//	            //going right
//	            if(solveMaze(r, c+1, r1, c1, maze, solution))
//	                return true;
//	            //backtracking
//	            solution[r][c] = 0;
//	            return false;
//	        }
//	        return false;
//	    }
//
//	    public static void main(String[] args)
//	    {
//	    	Scanner sc = new Scanner(System.in);
//			int r = sc.nextInt();
//			int c = sc.nextInt();
//			String[][] maze = new String[r][c];
//			String[] single = new String[r];
//			for (int i = 0; i < r; i++) {
//				single[i] = sc.next();
//			}
//			for (int i = 0; i < r; i++) {
//				for (int j = 0; j < c; j++) {
//					maze[i][j] = single[i].substring(j, j + 1);
//					//System.out.println(maze[i][j]);
//				}
//			}
//			int[][] arr;
//			arr = new int[r][c];
//	        if (solveMaze(0,0,r-1,c-1,maze,arr))
//	            printSolution(r,c,arr);
//	        else
//	            System.out.println("No solution\n");
//	    }
//	}

	import java.util.*;
	
	public class RatInMaze {
			static int resMtrx[][] = new int[1001][1001];
			static boolean visited[][] = new boolean[1001][1001];
	
		public static void main(String args[]) { 
	Scanner sc=new Scanner(System.in); 		
	int n=sc.nextInt(); 		
int m=sc.nextInt(); 		
char a[][]=new char[n][]; 		 		
for(int i=0;i<n;i++) {
	a[i]=sc.next().toCharArray(); 		
}
sc.close();

boolean path=printPath(a, 0, 0, n-1, m-1);
if(path==false)System.out.println("-1");
	}

public static boolean printPath(char[][] mtrx, int cr, int cc, int er, int ec){ 		
if(cr==er && cc==ec){ 			
resMtrx[cr][cc]=1; 			
for(int i=0;i<=er;i++){ 				
for(int j=0;j<=ec;j++){ 					 					
	System.out.print(resMtrx[i][j]+" "); 				
} 				
System.out.println(); 			
} 			
return true; 	
	} 		
if(mtrx[cr][cc]=='X'){ 		
	visited[cr][cc]=true; 			
return false; 	
	}
if( visited[cr][cc]) 		
return false; 
visited[cr][cc]=true; 
resMtrx[cr][cc]=1; 
if(cc+1<=ec && !visited[cr][cc+1]){ 
boolean hr=printPath(mtrx,cr,cc+1,er,ec); 
if(hr==true) 			 
	return true;
} 		 		
if(cr+1<=er && !visited[cr+1][cc]){ 
	boolean vr=printPath(mtrx,cr+1,cc,er,ec); 
	if(vr==true) 			 
		return true; 		
	} 		 		
resMtrx[cr][cc]=0; 		
return false ; 	

}
}