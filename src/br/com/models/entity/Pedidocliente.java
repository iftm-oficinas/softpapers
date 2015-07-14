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
 * Pedidocliente generated by hbm2java
 */
@Entity
@Table(name="pedidocliente"
    ,catalog="fenixdb"
)
public class Pedidocliente  implements java.io.Serializable {


     private long idPedidoCliente;
     private Cliente cliente;
     private Item item;
     private Usuario usuario;

    public Pedidocliente() {
    }

    public Pedidocliente(long idPedidoCliente, Cliente cliente, Item item, Usuario usuario) {
       this.idPedidoCliente = idPedidoCliente;
       this.cliente = cliente;
       this.item = item;
       this.usuario = usuario;
    }
   
     @Id 

    
    @Column(name="idPedidoCliente", unique=true, nullable=false)
    public long getIdPedidoCliente() {
        return this.idPedidoCliente;
    }
    
    public void setIdPedidoCliente(long idPedidoCliente) {
        this.idPedidoCliente = idPedidoCliente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Cliente_idCliente", nullable=false)
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="itemPedidoCliente", nullable=false)
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

