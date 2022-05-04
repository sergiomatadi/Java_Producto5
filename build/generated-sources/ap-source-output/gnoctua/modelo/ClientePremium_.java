package gnoctua.modelo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-05-03T18:00:18", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(ClientePremium.class)
public class ClientePremium_ extends Cliente_ {

    public static volatile SingularAttribute<ClientePremium, Integer> cuota;
    public static volatile SingularAttribute<ClientePremium, Double> descuentoEnvio;

}