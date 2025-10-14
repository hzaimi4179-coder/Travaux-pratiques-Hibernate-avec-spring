
package ma.projet.dao;

import java.io.Serializable;
import java.util.List;

public interface IDao<T, ID extends Serializable> {

    T save(T entity);

    T update(T entity);

    void delete(T entity);

    void deleteById(ID id);

    T findById(ID id);

    List<T> findAll();
}
