
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Dao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_entidades_jar_1.0-SNAPSHOTPU");
    EntityManager em =emf.createEntityManager();
    EntityTransaction tx =em.getTransaction();

    public void salvar(Object o){
        tx.begin();
        em.merge(o);
        tx.commit();
    }
    public void salvarI(Object o){
        tx.begin();
        em.persist(o);
        tx.commit();
    }
    public void remove(Object o){
        tx.begin();
        em.remove(o);
        tx.commit();
    }
    public List lista(Class c){ 
        return  em.createQuery("select o from "+c.getSimpleName()+ " o ").getResultList();
    }


    public List listaNative(Class c){ 
        return  em.createNativeQuery("select * from "+c.getSimpleName(),c).getResultList();
    }
     public Object findbyID(Class c,int id){ 
        return  em.find(c, id);
    }

}
