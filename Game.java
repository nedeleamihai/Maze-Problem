package tema1;
import java.io.File;

public class Game {
	public void main(String[] args) {

		   File myFile = new File("tema0.in");
		   CityMap cm = new CityMap();
		   cm.readInFile(myFile);
		   Character Romeo = new Character('R');
           Character Julieta = new Character('J');

           int[][] romeo = new int[cm.n][cm.m];
           int[][] julieta = new int[cm.n][cm.m];

           for(int i=0;i<cm.n;i++){
        	   for(int j=0;j<cm.m;j++){
        		   if((Romeo.nume) == (cm.harta[i][j])){
        			   Romeo.x=i;
        			   Romeo.y=j;
        		   }
        		   if(Julieta.nume==cm.harta[i][j]){
        			   Julieta.x=i;
        			   Julieta.y=j;
        		   }
        	   }
           }

           for(int i = 0; i < cm.n; ++i){
               for(int j = 0; j < cm.m; ++j){
                   romeo[i][j] = 20000;
                   julieta[i][j] = 20000;
               }
           }

           distanta_pctintalnire g =new distanta_pctintalnire();
           g.play(Romeo,cm,romeo);
           g.play(Julieta,cm,julieta);
           g.coordonate(romeo, julieta, cm);


	}
}
