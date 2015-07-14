package br.com.model.vo;
// Generated 09/05/2015 14:52:35 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Item generated by hbm2java
 */
@Entity
@Table(name="item"
    ,catalog="dbloja"
)
public class Item  implements java.io.Serializable {


     private Long idItem;
     private Produto produto;
     private Integer quantidadeProduto;
     private Date dataCriacao;
     private Date dataAtualizacao;
     private Set<Pedidofornecedor> pedidofornecedors = new HashSet<Pedidofornecedor>(0);
     private Set<Pedidocliente> pedidoclientes = new HashSet<Pedidocliente>(0);

    public Item() {
    }

	
    public Item(Produto produto) {
        this.produto = produto;
    }
    public Item(Produto produto, Integer quantidadeProduto, Date dataCriacao, Date dataAtualizacao, Set<Pedidofornecedor> pedidofornecedors, Set<Pedidocliente> pedidoclientes) {
       this.produto = produto;
       this.quantidadeProduto = quantidadeProduto;
       this.dataCriacao = dataCriacao;
       this.dataAtualizacao = dataAtualizacao;
       this.pedidofornecedors = pedidofornecedors;
       this.pedidoclientes = pedidoclientes;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idItem", unique=true, nullable=false)
    public Long getIdItem() {
        return this.idItem;
    }
    
    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="itemProduto", nullable=false)
    public Produto getProduto() {
        return this.produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    
    @Column(name="quantidadeProduto")
    public Integer getQuantidadeProduto() {
        return this.quantidadeProduto;
    }
    
    public void setQuantidadeProduto(Integer quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dataCriacao", length=19)
    public Date getDataCriacao() {
        return this.dataCriacao;
    }
    
    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dataAtualizacao", length=19)
    public Date getDataAtualizacao() {
        return this.dataAtualizacao;
    }
    
    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="item")
    public Set<Pedidofornecedor> getPedidofornecedors() {
        return this.pedidofornecedors;
    }
    
    public void setPedidofornecedors(Set<Pedidofornecedor> pedidofornecedors) {
        this.pedidofornecedors = pedidofornecedors;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="item")
    public Set<Pedidocliente> getPedidoclientes() {
        return this.pedidoclientes;
    }
    
    public void setPedidoclientes(Set<Pedidocliente> pedidoclientes) {
        this.pedidoclientes = pedidoclientes;
    }




}

