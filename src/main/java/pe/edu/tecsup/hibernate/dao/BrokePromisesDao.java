package pe.edu.tecsup.hibernate.dao;

import pe.edu.tecsup.hibernate.model.BrokePromises;
import pe.edu.tecsup.hibernate.model.Curso;

import java.util.List;

/**
 * @ProjectName: springboot-hibernate
 * @Package: pe.edu.tecsup.hibernate.dao
 * @ClassName: BrokePromisesDao
 * @Author: dhejie
 * @CreateDate: 2019/9/12 23:15
 * @UpdateDate: 2019/9/12 23:15
 * @Version: 1.0
 */
public interface BrokePromisesDao {
    List<BrokePromises> getById(Integer id);
}
