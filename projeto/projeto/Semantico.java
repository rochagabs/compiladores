package projeto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import caju.analysis.DepthFirstAdapter;
import caju.node.AAtribAAtrib;
import caju.node.ABlocoABloco;
import caju.node.ADecFuncaoADecFuncao;
import caju.node.ADecVariavelADecVariavel;
import caju.node.PAComando;
import caju.node.PADecVariavel;
import caju.node.PAExp;
import caju.node.PAVar;
import caju.node.Start;
import caju.node.TIdentificador;

public class Semantico extends DepthFirstAdapter{
	
	private Stack<TabelaSimbolos> pilha = new Stack<TabelaSimbolos>();

	@Override
	public void inStart(Start node)
	    {
		   System.out.println("-------------------------------------------------");
		   System.out.println("Iniciando análise semântica...");
	    }
	
	 @Override
	 public void outStart(Start node)
	    {
		    System.out.println("-------------------------------------------------");
	        System.out.println("Fim da análise semântica");
	        System.out.println("-------------------------------------------------");
			  
	    }
	 
	 @Override
	 public void outADecFuncaoADecFuncao(ADecFuncaoADecFuncao node) {
		 System.out.println("-------------------------------------------------");
		 System.out.println("O tipo desta declaração de função é " + node.getATipoRetorno());
		 System.out.println("-->Inserir ( "+ node.getIdentificador()+", "+node.getATipoRetorno()+")");
		 
		 System.out.println("Parametros: " + node.getAParametros());
		 
		 System.out.print("Nomes da função: ");
		 List<TIdentificador> ids = new ArrayList<TIdentificador>();
		 ids.add(node.getIdentificador());
		 
		 for(TIdentificador e : ids) {
			 System.out.println(e.toString());
		 }
		 System.out.println("O que fazer na tabela de símbolos:");
		 for(TIdentificador e : ids)
         {
             System.out.println("-->Inserir ( "+ e.toString()+", "+node.getATipoRetorno()+")");
         }
	 }
	 
	 @Override
	 public void outADecVariavelADecVariavel(ADecVariavelADecVariavel node) {
		 System.out.println("-------------------------------------------------");
		 System.out.println("O tipo desta variável é " + node.getATipo());
		 
		 System.out.print("Nomes: " + node.getAListaNomes());
		 System.out.println();
		 
	 }
	 
	 @Override
	 public void outABlocoABloco(ABlocoABloco node) {
		 System.out.println("-------------------------------------------------");
		 List<LinkedList<PADecVariavel>> dec_variaveis = new ArrayList<LinkedList<PADecVariavel>>();
		 dec_variaveis.add(node.getADecVariavel());
		 
		 List<LinkedList<PAComando>> comandos = new ArrayList<LinkedList<PAComando>>();
		 comandos.add(node.getAComando());
		 
		 System.out.print("Declaração de variaveis: ");
		 System.out.println();
		 for(LinkedList<PADecVariavel> list : dec_variaveis) {
			 for(PADecVariavel e : list) {
				 System.out.println(e.toString());
			 }
		 }
		 
		 System.out.print("Comandos: ");
		 System.out.println();
		 for(LinkedList<PAComando> list : comandos) {
			 for(PAComando c : list) {
				 System.out.println(c.toString());
			 }
		 }
	 }
	 
	 @Override
	 public void outAAtribAAtrib(AAtribAAtrib node) {
		 System.out.println("-------------------------------------------------");
		 List<PAVar> variaveis = new ArrayList<PAVar>();
		 variaveis.add(node.getAVar());
		 
		 List<PAExp> expressoes = new ArrayList<PAExp>();
		 expressoes.add(node.getAExp());
		 
		 
		 for(PAVar v : variaveis) {
			 System.out.println("Variavel: " + v.toString());
		 }
		 
		 for(PAExp e : expressoes) {
			 System.out.println("Valor: " + e.toString());
		 }
	 }
	
}
