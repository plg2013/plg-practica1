import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import antlr.ANTLRException; 
import antlr.Token; 

public class Principal {//solo scanner 

	private static String fileName = "prueba1.txt"; 
	private static FileInputStream fis = null; 

	public static void main(String args[]) {  
		try  
		{  
			System.out.println("Scanning file..."); 
			fis = new FileInputStream(fileName);  
			MiScanner scan = new MiScanner(fis); 
			Token token = scan.nextToken();  
			while(token.getType() != Token.EOF_TYPE){  

				System.out.println(token);  

				token = scan.nextToken(); 
			}                        
		}catch (ANTLRException ae){ 
			System.err.println(ae.getMessage()); 

		}catch(FileNotFoundException fnfe){ 
			System.err.println("No se encontró le fichero"); 
		} 
	}
}