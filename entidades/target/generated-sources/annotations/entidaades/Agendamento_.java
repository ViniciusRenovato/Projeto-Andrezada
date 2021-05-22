package entidaades;

import entidaades.CadastroCliente;
import entidaades.Recibo;
import entidaades.Servicos;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-22T13:22:22", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Agendamento.class)
public class Agendamento_ { 

    public static volatile SingularAttribute<Agendamento, Recibo> recibo;
    public static volatile SingularAttribute<Agendamento, Servicos> servicos;
    public static volatile SingularAttribute<Agendamento, Date> DataAtendimento;
    public static volatile SingularAttribute<Agendamento, CadastroCliente> cadastroCliente;
    public static volatile SingularAttribute<Agendamento, Integer> IDAgendamento;
    public static volatile SingularAttribute<Agendamento, Integer> Id;

}