package vendas.pi.vendas;

import java.util.List;

public class Fornecedor {
	    @Id
	    private Long id;
	    private String CNPJ;
	    private String endereço;
	    private String nome;
	    private Long telefone;
	    private boolean aceito;

	    public boolean isAceito() {
	        return aceito;
	    }

	    public void setAceito(boolean aceito) {
	        this.aceito = aceito;
	    }
	    List<Pedido> pedidos;

	    public long getTelefone() {
	        return telefone;
	    }

	    public void setTelefone(long telefone) {
	        this.telefone = telefone;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getCNPJ() {
	        return CNPJ;
	    }

	    public void setCNPJ(String cNPJ) {
	        CNPJ = cNPJ;
	    }

	    public String getEndereço() {
	        return endereço;
	    }

	    public void setEndereco(String endereço) {
	        this.endereço = endereço;
	    }

	    public void setTelefone(Long telefone) {
	        this.telefone = telefone;
	    }

	    public List<Pedido> getPedidos() {
	        return pedidos;
	    }

	    public void setPedidos(List<Pedido> pedidos) {
	        this.pedidos = pedidos;
	    }
}

