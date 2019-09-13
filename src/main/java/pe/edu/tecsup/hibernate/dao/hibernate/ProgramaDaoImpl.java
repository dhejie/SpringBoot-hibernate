package pe.edu.tecsup.hibernate.dao.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.tecsup.hibernate.dao.ProgramaDao;
import pe.edu.tecsup.hibernate.model.Programa;

@Repository
@Transactional
public class ProgramaDaoImpl extends BaseHibernateDao implements ProgramaDao {

    @Override
    public List<Programa> list() {

        Criteria criteria = this.getSession().createCriteria(Programa.class);
        return criteria.list();
    }

    @Override
    public Programa get(Long t) {
        Criteria criteria = this.getSession().createCriteria(Programa.class);
        criteria.add(Restrictions.eq("id", t));
        return (Programa) criteria.uniqueResult();
    }

    @Override
    public void save(Programa t) {
        this.getSession().save(t);
    }

    @Override
    public void update(Programa t) {
        this.getSession().merge(t);
    }

    @Override
    public void delete(Programa t) {
        this.getSession().delete(t);
    }

}
