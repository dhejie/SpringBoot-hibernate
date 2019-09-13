package pe.edu.tecsup.hibernate;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pe.edu.tecsup.hibernate.dao.CursoDao;
import pe.edu.tecsup.hibernate.model.Curso;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CursoDaoTests {

    @Autowired
    CursoDao cursoDao;

//    @Test
    public void verifyList() {

        List<Curso> cursos = cursoDao.list();
        for (Curso curso : cursos) {

            System.out.println(curso.getId()
                    + " " + curso.getNombre()
                    + " " + curso.getPrograma().getNombre());
        }
        Assert.assertTrue(cursos.size() > 0);
    }

    @Test
    public void verifyListByNombre() {

        String nombre = "";
        List<Curso> cursos = cursoDao.getByNombre(nombre);
        for (Curso curso : cursos) {

            System.out.println(curso.getId()
                    + " " + curso.getNombre());
            if (curso.getPrograma() != null) {
                System.out.println(curso.getPrograma().getNombre());
            }
        }
        Assert.assertTrue(cursos.size() > 0);
    }

//    @Test
    public void verifyFind() {
        Curso curso = cursoDao.get(1l);
        System.out.println(curso.getNombre());
        Assert.assertTrue(curso.getId() == 1l);
    }

//    @Test
    public void verifySave() {

        Curso curso = new Curso();
        curso.setCodigo("1020");
        curso.setNombre("Nuevo Curso");

        cursoDao.save(curso);
        Assert.assertTrue(curso.getId() != null);
    }

//    @Test
    public void verifyUpdate() {

        // cambiar el código para validar
        Curso curso = new Curso();
        curso.setId(1l);
        curso.setCodigo("999");
        curso.setNombre("Curso Modificado");

        cursoDao.update(curso);
        Assert.assertTrue(cursoDao.get(1l).getCodigo().equals("999"));
    }

//    @Test
    public void verifyDelete() {

        Curso curso = new Curso();
        curso.setId(3l);
        cursoDao.delete(curso);

        Assert.assertTrue(cursoDao.get(3l) == null);
    }

}
