package com.empresa;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.jupiter.api.Assertions.*;


@RunWith(Arquillian.class)
public class AnalistaTest {

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Analista.class)
                .addClass(Funcionario.class)
                .addAsManifestResource(EmptyAsset.INSTANCE,"beans.xml");
    }

    @Test
    public void testDominaMesmaDiagrama() {
        Analista analista1 = new Analista();
        analista1.setDiagrama(new String[]{"Diagrama 1", "Diagrama 2", "Diagrama 3"});

        Analista analista2 = new Analista();
        analista2.setDiagrama(new String[]{"Diagrama 1", "Diagrama 2", "Diagrama 3"});

        assertTrue(analista1.dominaMesmaDiagrama(analista2));
    }
}
