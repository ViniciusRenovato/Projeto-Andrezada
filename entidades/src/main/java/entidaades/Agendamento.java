
package entidaades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Agendamento implements Serializable {

    @OneToOne(mappedBy = "agendamento")
    private Recibo recibo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private Integer IDAgendamento;
    
    @Temporal(TemporalType.DATE)
    private Date DataAtendimento;
    
    @ManyToOne
    private CadastroCliente cadastroCliente;    
    
    @ManyToOne
    private Servicos servicos;

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getIDAgendamento() {
        return IDAgendamento;
    }

    public void setIDAgendamento(Integer IDAgendamento) {
        this.IDAgendamento = IDAgendamento;
    }

    public Date getDataAtendimento() {
        return DataAtendimento;
    }

    public void setDataAtendimento(Date DataAtendimento) {
        this.DataAtendimento = DataAtendimento;
    }

    public CadastroCliente getCadastroCliente() {
        return cadastroCliente;
    }

    public void setCadastroCliente(CadastroCliente cadastroCliente) {
        this.cadastroCliente = cadastroCliente;
    }

    public Servicos getServicos() {
        return servicos;
    }

    public void setServicos(Servicos servicos) {
        this.servicos = servicos;
    }
 
    
}
