package platform.test;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;
import platform.DAO.HibernateUtils.HibernateUtil;
import org.hibernate.Transaction;
import platform.model.users.entity.UserEnity;


/**
 * Created by dylanyang on 8/13/15.
 */
public class UsersTest {
    Session session = null;
    Transaction tx = null;
    @Test
    public void sechmDDL() {
        Configuration cfg = new Configuration().configure();
        SchemaExport schema = new SchemaExport(cfg);
        schema.setFormat(true).create(true,true);
    }
    @Test
    public void addUser(){
        session = HibernateUtil.getSession();
        tx = session.beginTransaction();

        UserEnity ue = new UserEnity();
        ue.setName("Dylan");
        ue.setPasswd("123");
        ue.setAge(12);
        session.save(ue);

        tx.commit();
        session.close();
    }
}
