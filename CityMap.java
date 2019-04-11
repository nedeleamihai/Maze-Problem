package tema1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CityMap {
	   
       public int n,m;
       char[][] harta;
       public Scanner input;
       public String linie;
       
       public void readInFile(File myFile){
    	   try {
               input = new Scanner(myFile);
               n=input.nextInt();
	           m=input.nextInt();
               harta=new char[n][m];
               linie=input.nextLine();
               
               for(int i=0;i<n;i++){
            	   linie=input.nextLine();
            	   for(int j=0;j<m;j++){
            		   harta[i][j]=linie.charAt(j);
            	   }
               }
    	   } catch (FileNotFoundException e) {
               e.printStackTrace();
           }

       }
       
}
