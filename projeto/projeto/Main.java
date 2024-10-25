package projeto;
import caju.parser.*;
import caju.lexer.*;
import caju.node.*;
import java.io.*;

public class Main
{
 public static void main(String[] args)
 {
  try
  {
   String arquivo = "projeto/codigos/mercado.cj";
  
   Lexer lex = new Lexer(
		    new PushbackReader(  
		    new FileReader(arquivo), 1024));
   
   Parser p = new Parser(lex); 
   
   Start tree = p.parse();
   //Imprime árvore na saída padrão
   //tree.apply(new ASTPrinter());
   //Imprime árvore em interface gráfica
   tree.apply(new ASTDisplay());
   tree.apply(new Semantico());
  }
  catch(Exception e)
  {
   System.out.println(e.getMessage());
  }
 }
}