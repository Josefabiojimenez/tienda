package com.tienda.repository;
import com.Tienda.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lichkhing
 */
@Repository
public interface PaisRepository extends CrudRepository<Pais,Long>{   
}