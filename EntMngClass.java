package DAL;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Admin
 */
public class EntMngClass {
    EntityManager em;

    public EntMngClass() {
        this.em = Persistence.createEntityManagerFactory("Cloud_eLearningPU").createEntityManager();
    }
}
