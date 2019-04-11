package tema1;
import java.io.PrintWriter;
import java.util.*;

public class distanta_pctintalnire {
	   public boolean isValid(int row, int col, int n, int m){
	         return (row >= 0) && (row < n) && (col >= 0) && (col < m);
       }
	  
       public void play(Character pct,CityMap cm,int hartapersonaj[][]){
    	   
    	   int rownum[] = {0, 0, 1, 1, 1, -1, -1, -1};
   	       int colnum[] = {1, -1, -1, 0, 1, -1, 0, 1};
   	       
   	       ArrayList<Coada> q = new ArrayList<Coada>();  
	       Coada drum = new Coada();
	       hartapersonaj[pct.x][pct.y]=0;
	       drum.x=pct.x;
	       drum.y=pct.y;
	       q.add(drum);
	       
	       while(!q.isEmpty()){
	    	     Coada curent = q.get(0);
	    	     q.remove(0);
	    	     for (int i = 0; i < 8; i++){
	 	              int row = curent.x + rownum[i];
	 	              int col = curent.y + colnum[i];
	 	              if(isValid(row,col,cm.n,cm.m) && (cm.harta[row][col]!='X') && (hartapersonaj[row][col] > hartapersonaj[curent.x][curent.y] + 1)){
	 	                   hartapersonaj[row][col] = hartapersonaj[curent.x][curent.y] + 1;
	 	                   Coada temp = new Coada();
	 	                   temp.x=row;
	 		               temp.y=col;
	 		               q.add(temp);
	 	              }
	    	     }
	       }
       }
       
       void coordonate(int romeo[][],int julieta[][],CityMap cm){
    	   int tmin = 19999;
           int x, y;
           
           for(int i = 0; i < cm.n; ++i){
               for(int j = 0; j < cm.m; ++j){
                   if(romeo[i][j] == julieta[i][j] && romeo[i][j] <= tmin){
                       tmin = romeo[i][j];
                   }
               }
           }

           try{
        	    PrintWriter writer = new PrintWriter("maze.out");
        	    
           for(int i = 0; i < cm.n; ++i){
               for(int j = 0; j < cm.m; ++j){

                   if(romeo[i][j] == julieta[i][j] && romeo[i][j] == tmin){
                       x = i+1;
                       y = j+1;
                       writer.println( tmin+1 + " " + x + " " + y );
                   }
               }
           }
           writer.close();
           } catch (Exception e) {
        	   
           }
       }
}
