package pe.edu.tecsup.hibernate;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pe.edu.tecsup.hibernate.dao.ProgramaDao;
import pe.edu.tecsup.hibernate.model.Programa;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProgramaDaoTests {

    @Autowired
    ProgramaDao programaDao;

    @Test
    public void verifyList() {

        List<Programa> programas = programaDao.list();
        for (Programa programa : programas) {
            System.out.println(programa.getNombre());
        }
        Assert.assertTrue(programas.size() > 0);
    }

    @Test
    public void verifyFind() {
        Programa programa = programaDao.get(1l);
        System.out.println(programa.getNombre());
        Assert.assertTrue(programa.getId() == 1l);
    }

    @Test
    public void verifySave() {

        Programa programa = new Programa();
        programa.setCodigo("1020");
        programa.setNombre("Nuevo Programa");
        programa.setDescripcion("......");

        programaDao.save(programa);
        Assert.assertTrue(programa.getId() != null);
    }

    @Test
    public void verifyUpdate() {

        // cambiar el código para validar
        Programa programa = new Programa();
        programa.setId(1l);
        programa.setCodigo("999");
        programa.setNombre("Programa Modificado");

        programaDao.update(programa);
        Assert.assertTrue(programaDao.get(1l).getCodigo().equals("999"));
    }

    @Test
    public void verifyDelete() {

        Programa programa = new Programa();
        programa.setId(3l);
        programaDao.delete(programa);

        Assert.assertTrue(programaDao.get(3l) == null);
    }

}
