import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import antlr.ANTLRException; 
import antlr.CommonAST; 

public class Principal2 {//solo scanner 

	private static String fileName = "prueba1.txt"; 
	private static FileInputStream fis = null; 

	public static void main(String args[]) {  
		try  
		{  
			System.out.println("Scanning file..."); 
			fis = new FileInputStream(fileName);  
			MiScanner scan = new MiScanner(fis); 
			MiParser par = new MiParser(scan); 
			par.programa(); 

			CommonAST a = (CommonAST)par.getAST(); 
			// Debes añadir sección Options 
			// y poner  buildAST = true;  

			System.out.println("Resultado ASA: "+a.toStringTree()); 

		}catch (ANTLRException ae){ 
			System.err.println(ae.getMessage()); 

		}catch(FileNotFoundException fnfe){ 
			System.err.println("No se encontró le fichero"); 
		} 
	} 
}