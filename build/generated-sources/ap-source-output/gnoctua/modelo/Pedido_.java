package gnoctua.modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-04T17:27:58", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Integer> codigo;
    public static volatile SingularAttribute<Pedido, Integer> numero;
    public static volatile SingularAttribute<Pedido, LocalTime> hora;
    public static volatile SingularAttribute<Pedido, String> nif;
    public static volatile SingularAttribute<Pedido, LocalDate> fechaPedido;
    public static volatile SingularAttribute<Pedido, Boolean> enviado;
    public static volatile SingularAttribute<Pedido, Integer> cantidad;

}