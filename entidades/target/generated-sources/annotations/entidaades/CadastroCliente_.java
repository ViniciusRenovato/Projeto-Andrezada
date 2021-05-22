package entidaades;

import entidaades.Agendamento;
import java.sql.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-22T13:22:22", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(CadastroCliente.class)
public class CadastroCliente_ { 

    public static volatile SingularAttribute<CadastroCliente, Date> Data_Nasc;
    public static volatile SingularAttribute<CadastroCliente, String> telefone;
    public static volatile ListAttribute<CadastroCliente, Agendamento> agendamentos;
    public static volatile SingularAttribute<CadastroCliente, String> nome;
    public static volatile SingularAttribute<CadastroCliente, Integer> Id;
    public static volatile SingularAttribute<CadastroCliente, Integer> Idcliente;

}