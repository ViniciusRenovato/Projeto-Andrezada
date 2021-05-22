package entidaades;

import entidaades.Agendamento;
import entidaades.Funcionario;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-22T13:28:23", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Servicos.class)
public class Servicos_ { 

    public static volatile SingularAttribute<Servicos, Integer> IdServico;
    public static volatile ListAttribute<Servicos, Agendamento> agendamentos;
    public static volatile SingularAttribute<Servicos, Float> valor;
    public static volatile SingularAttribute<Servicos, String> NomeServico;
    public static volatile SingularAttribute<Servicos, Integer> Id;
    public static volatile SingularAttribute<Servicos, Funcionario> funcionario;

}