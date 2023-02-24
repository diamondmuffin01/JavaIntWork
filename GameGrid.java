import java.security.SecureRandom;
import java.util.Scanner;

public class GameGrid 
{
    

    
    
    public static void run()
    {
        //Scanner obj
        Scanner keyboard = new Scanner(System.in);
        
        //Create SecureRandom obj
        SecureRandom oRand = new SecureRandom(); 
        
        //Create #s that will be compared (for %) 
        int iWallChance = 30;
        int iNum;
        
        //(a) Create grid 
        int[][] AGrid = new int[10][10];
        for (int row = 0; row < AGrid.length; row++)
        {
	        for (int col = 0; col < AGrid[row].length; col++)
	        {
	            //Create Random # from 0 - 99
	            iNum = oRand.nextInt(100);
	   
	            //Display grid for user 
	            if(iNum > iWallChance)
	            {
	                AGrid[row][col] = 0;
	            }
	            
	            else
	            {
	                AGrid[row][col] = 1;
	            }
	            //System.out.print(AGrid[row][col] + " ");
	        }
        }
    
        //(b)
        AGrid[0][0] = 0;
        
        for (int row = 0; row < AGrid.length; row++)
        {
	        for (int col = 0; col < AGrid[row].length; col++)
	        {    
                System.out.print(AGrid[row][col] + " ");
	        }
	        
	        System.out.println();
        }
        
        System.out.println();
        System.out.println();
        
        //(c)
        int iUserRow = 0;
        int iUserCol = 0;
        
        
        //(d)
        boolean exitLoop = true;
        
        //(e)
        String answer;
        
        while(exitLoop)
        {
            System.out.println("Move down or right?(s=down//d=right)");
            answer = keyboard.nextLine();
            
            if(answer.equals("s"))
            {
                System.out.println("You went down");
                iUserRow++;
            }
            
            else if (answer.equals("d"))
            {
                System.out.println("You went right");
                iUserCol++;
            }
            
            else 
            {
                System.out.println("Enter a valid answer");
            }
            
            if(AGrid[iUserRow][iUserCol] == 1)
            {
                System.out.println("You lose");
                exitLoop = false;
            }
            
            else if (iUserRow == 9 || iUserCol ==9)
            {
                System.out.println("You won");
                exitLoop = false;
            }
            
        }
        
                
        for (int row = 0; row < AGrid.length; row++)
        {
	        for (int col = 0; col < AGrid[row].length; col++)
	        { 
	           if(iUserRow == row && iUserCol == col)
	           {
	               System.out.print("x ");
	           }
	           
	           else
	           {
	               System.out.print(AGrid[row][col] + " ");
	           }
	           
	        }
	        
	       System.out.println();
        }
        
        
    }
}






