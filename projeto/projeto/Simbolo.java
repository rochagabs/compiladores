package projeto;

public class Simbolo {
    private String nome;
    private String tipo;
    private Object valor;
    private int nivel;

    public Simbolo(String nome, String tipo, Object valor, int nivel) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.nivel = nivel;
    }

    public String getNome() { return nome; }
    public String getTipo() { return tipo; }
    public Object getValor() { return valor; }
    public int getNivel() { return nivel; }


    @Override
    public String toString() {
        return "Simbolo{nome='" + nome + "', tipo='" + tipo + "', valor=" + valor + ", nivel=" + nivel + "}";
    }
}


