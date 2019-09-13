package pe.edu.tecsup.hibernate.dao.hibernate;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.tecsup.hibernate.dao.BrokePromisesDao;
import pe.edu.tecsup.hibernate.model.BrokePromises;

import java.util.List;

/**
 * @ProjectName: springboot-hibernate
 * @Package: pe.edu.tecsup.hibernate.dao.hibernate
 * @ClassName: BrokePromisesDaoImpl
 * @Author: dhejie
 * @CreateDate: 2019/9/12 23:17
 * @UpdateDate: 2019/9/12 23:17
 * @Version: 1.0
 */
@Repository
@Transactional
public class BrokePromisesDaoImpl extends BaseHibernateDao implements BrokePromisesDao {
    @Override
    public List<BrokePromises> getById(Integer id) {
        Criteria criteria = this.getSession().createCriteria(BrokePromises.class);
        criteria.add(Restrictions.eq("id", id));//做判断条件
        return criteria.list();
    }
}
