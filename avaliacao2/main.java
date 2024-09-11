package caju;

import caju.lexer.*;
import caju.parser.*;
import caju.node.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			String arquivo = "teste/teste.calc";

			Lexer lexer =
					new Lexer(
							new PushbackReader(  
									new FileReader(arquivo), 1024)); 
			Token token;
			while(!((token = lexer.next()) instanceof EOF)) {
				System.out.println(token.getClass());
				System.out.println(" ( "+token.toString()+")");
			}
			
			Parser parser = new Parser(lexer);
			Start tree = parser.parse();
			System.out.println(tree);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}