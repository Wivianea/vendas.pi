package vendas.pi.vendas;

import java.time.LocalDate;
import java.util.List;

public class Pedido {

    @Id
    private Long id;
    private LocalDate data;
    private List<Perfumes> perfumes;
    private List<Fornecedor> fornecedores;
    private Fornecedor responsavel;
    private Double preço;
	private Object Perfumes;
	
    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

    public List<Perfumes> getPerfumes() {
        return (List<vendas.pi.vendas.Perfumes>) Perfumes;
    }

    public void setPerfumes(List<Perfumes> perfumes) {
		this.Perfumes = perfumes;
    }

    public Fornecedor getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Fornecedor responsavel) {
        this.responsavel = responsavel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}