package br.com.models.vo;
// Generated 24/06/2015 14:14:02 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Extrato generated by hbm2java
 */
@Entity
@Table(name="extrato"
    ,catalog="dbloja"
)
public class Extrato  implements java.io.Serializable {


     private Long idExtrato;
     private Lancamento lancamento;
     private BigDecimal valorExtarto;
     private BigDecimal saldoExtrato;
     private Date criacaoExtrato;
     private Date atualizacaoExtrato;

    public Extrato() {
    }

    public Extrato(Lancamento lancamento, BigDecimal valorExtarto, BigDecimal saldoExtrato, Date criacaoExtrato, Date atualizacaoExtrato) {
       this.lancamento = lancamento;
       this.valorExtarto = valorExtarto;
       this.saldoExtrato = saldoExtrato;
       this.criacaoExtrato = criacaoExtrato;
       this.atualizacaoExtrato = atualizacaoExtrato;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idExtrato", unique=true, nullable=false)
    public Long getIdExtrato() {
        return this.idExtrato;
    }
    
    public void setIdExtrato(Long idExtrato) {
        this.idExtrato = idExtrato;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="lancamentoExtrato")
    public Lancamento getLancamento() {
        return this.lancamento;
    }
    
    public void setLancamento(Lancamento lancamento) {
        this.lancamento = lancamento;
    }

    
    @Column(name="valorExtarto", precision=10)
    public BigDecimal getValorExtarto() {
        return this.valorExtarto;
    }
    
    public void setValorExtarto(BigDecimal valorExtarto) {
        this.valorExtarto = valorExtarto;
    }

    
    @Column(name="saldoExtrato", precision=10)
    public BigDecimal getSaldoExtrato() {
        return this.saldoExtrato;
    }
    
    public void setSaldoExtrato(BigDecimal saldoExtrato) {
        this.saldoExtrato = saldoExtrato;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="criacaoExtrato", length=19)
    public Date getCriacaoExtrato() {
        return this.criacaoExtrato;
    }
    
    public void setCriacaoExtrato(Date criacaoExtrato) {
        this.criacaoExtrato = criacaoExtrato;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="atualizacaoExtrato", length=19)
    public Date getAtualizacaoExtrato() {
        return this.atualizacaoExtrato;
    }
    
    public void setAtualizacaoExtrato(Date atualizacaoExtrato) {
        this.atualizacaoExtrato = atualizacaoExtrato;
    }




}

