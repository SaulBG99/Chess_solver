import java.io.*;

public class ChessSolver
{
 public static void main (String[] args) throws IOException
   {
   //Chessgame ss= new Chessgame();
   boolean endGame = false;
   String input = "";
   while(!endGame){
    try {
      BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
      System.out.println("Write next command")
      input = reader.readLine();
      if(input == "end"){
        endGame = true;
      }
			}
		catch( Exception e ){
			System.out.println( "An exception occured!" );
      System.out.println( e.toString() );
      endGame = true;
			}

   }
   System.out.println("Program ended");

   
   }
}