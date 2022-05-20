package gnoctua.modelo;

import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-11T12:09:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Articulo.class)
public class Articulo_ { 

    public static volatile SingularAttribute<Articulo, String> descripcion;
    public static volatile SingularAttribute<Articulo, Integer> codigo;
    public static volatile SingularAttribute<Articulo, LocalDate> tiempoEnvio;
    public static volatile SingularAttribute<Articulo, Double> gastosEnvio;
    public static volatile SingularAttribute<Articulo, Double> precioVenta;

}