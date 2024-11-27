package vendas.pi.vendas;

public class Perfumes {
	
	    @Id
	    private Long id;
	    private String nome;
	    private String marca;
	    private String Fornecimento;
	    private int quantidade;
	    private boolean selecionado;

	    public Long getId() {
	        return id;
	    }
	    public void setId(Long id) {
	        this.id = id;
	    }
	    public String getNome() {
	        return nome;
	    }
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    public String getMarca() {
	        return marca;
	    }
	    public void setMarca(String marca) {
	        this.marca = marca;
	    }
	    public String getFornecimento() {
	        return Fornecimento;
	    }
	    public void setUndFornecimento(String Fornecimento) {
	        this.Fornecimento = Fornecimento;
	    }
	    public int getQuantidade() {
	        return quantidade;
	    }
	    public void setQuantidade(int quantidade) {
	        this.quantidade = quantidade;
	    }
	    public boolean isSelecionado() {
	        return selecionado;
	    }
	    public void setSelecionado(boolean selecionado) {
	        this.selecionado = selecionado;
	    }
}