package pe.edu.tecsup.hibernate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pe.edu.tecsup.hibernate.dao.BrokePromisesDao;
import pe.edu.tecsup.hibernate.model.BrokePromises;

import java.net.SocketTimeoutException;
import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
public class BrokePromisesDaoTest {
    @Autowired
    BrokePromisesDao brokePromisesDao;

    @Test
    public void test() {
        List<BrokePromises> list = brokePromisesDao.getById(1);
        for (BrokePromises brokePromises : list) {
            System.out.println(brokePromises);

        }
    }
}
