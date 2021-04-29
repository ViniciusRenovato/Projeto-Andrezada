
package entidaades;

import java.util.Date;


public class Agenda {
    private CadastroCliente cadastrocliente;
    private Date Data;

    public CadastroCliente getCadastrocliente() {
        return cadastrocliente;
    }

    public void setCadastrocliente(CadastroCliente cadastrocliente) {
        this.cadastrocliente = cadastrocliente;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }
    
}
