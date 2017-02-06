package WebTest.Repository;

import WebTest.Exhibition;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by bankza514 on 1/27/2017.
 */

@Repository
public class ExhibitionRepository {
    @PersistenceContext
    EntityManager entityManager;

    public Exhibition get(int exhibitionId){
        Exhibition exhibition = entityManager.getReference(Exhibition.class, exhibitionId);
        return exhibition;
    }

//    public List<Exhibition> getAll(){
//        Query query = entityManager.createQuery("select Exhibition from Exhibition Exhibition",Exhibition.class);
//    }

    public void add(Exhibition exhibition){
        entityManager.persist(exhibition);
    }
}
