package aula9;
public class Produtos {
	
	    private String nome;
	    private double preco;
	    
	    public Produtos (String nome, double preco) {
	    	this.nome = nome;
	    	this.preco = preco;
	    }
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		public void exibirInformacoes() {
			System.out.println("Nome do Produto: " + nome);
			System.out.println("Preco do " + nome + "R$" + preco);
		}
}

