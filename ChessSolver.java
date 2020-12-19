import java.io.*;

public class ChessSolver
{
 public static void main (String[] args) throws IOException
   {
   Chessgame ss= new Chessgame();
   boolean endGame = false;
   String input = "";
   while(!endGame){
    try {
      BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
      System.out.println("Write next command");
      input = reader.readLine();
      if(input.equals("end")){
        endGame = true;
      }else if(input.equals("help") || input.equals("h")){
        System.out.println( "\nList of possible commands" );
        System.out.println( "end -> Terminate the play\n" );

      }else if(input.equals("restart") || input.equals("r")){
        ss = new Chessgame();

      }else if(input.equals("display") || input.equals("d")){
        ss.display();

      }else if(input.equals("take") || input.equals("t")){ //As in "take recommendation"
        ss.command(ss.recommendation());

      }else{
        ss.command(input);
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