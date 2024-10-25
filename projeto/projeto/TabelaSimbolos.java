package projeto;

import java.util.HashMap;
import java.util.Map;

public class TabelaSimbolos {
	public Map<String, Simbolo> tabela;
	
	public TabelaSimbolos() {
		this.tabela = new HashMap<>();
	}
	
	public void addSimbolo(String nome, String tipo, Object valor, int nivel) {
		Simbolo simbolo = new Simbolo(nome,tipo,valor,nivel);
		tabela.put(nome, simbolo);
	}
	
	public Simbolo getSimbolo(String nome) {
		return tabela.get(nome);
	}
	
}
