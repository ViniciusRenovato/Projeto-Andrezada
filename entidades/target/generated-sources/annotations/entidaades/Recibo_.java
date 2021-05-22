package entidaades;

import entidaades.Agendamento;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-05-21T20:33:30", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Recibo.class)
public class Recibo_ { 

    public static volatile SingularAttribute<Recibo, Integer> Id;
    public static volatile SingularAttribute<Recibo, Agendamento> agendamento;
    public static volatile SingularAttribute<Recibo, String> TipoPagamento;

}