
package entidaades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Funcionario implements Serializable {

    @OneToOne(mappedBy = "funcionario")
    private Servicos servicos;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer Id;
    private String Funcao;
    private String NomeFuncionario;
    private Integer IDFuncionario;

    public Servicos getServicos() {
        return servicos;
    }

    public void setServicos(Servicos servicos) {
        this.servicos = servicos;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    public String getNomeFuncionario() {
        return NomeFuncionario;
    }

    public void setNomeFuncionario(String NomeFuncionario) {
        this.NomeFuncionario = NomeFuncionario;
    }

    public Integer getIDFuncionario() {
        return IDFuncionario;
    }

    public void setIDFuncionario(Integer IDFuncionario) {
        this.IDFuncionario = IDFuncionario;
    }

    
}
