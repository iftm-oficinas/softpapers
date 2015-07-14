package br.com.models.entity;
// Generated 30/04/2015 19:57:40 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Pedidofornecedor generated by hbm2java
 */
@Entity
@Table(name="pedidofornecedor"
    ,catalog="fenixdb"
)
public class Pedidofornecedor  implements java.io.Serializable {


     private long idPedidoFornecedor;
     private Fornecedor fornecedor;
     private Item item;
     private Usuario usuario;

    public Pedidofornecedor() {
    }

    public Pedidofornecedor(long idPedidoFornecedor, Fornecedor fornecedor, Item item, Usuario usuario) {
       this.idPedidoFornecedor = idPedidoFornecedor;
       this.fornecedor = fornecedor;
       this.item = item;
       this.usuario = usuario;
    }
   
     @Id 

    
    @Column(name="idPedidoFornecedor", unique=true, nullable=false)
    public long getIdPedidoFornecedor() {
        return this.idPedidoFornecedor;
    }
    
    public void setIdPedidoFornecedor(long idPedidoFornecedor) {
        this.idPedidoFornecedor = idPedidoFornecedor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Fornecedor_idFornecedor1", nullable=false)
    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }
    
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="itemPedidoFornecedor", nullable=false)
    public Item getItem() {
        return this.item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Usuario_idUsuario", nullable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }




}


