/**
 * ProductRepository
 */
package mx.tec.web.lab.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.tec.web.lab.entity.Product;

/**
 * Product JPA Repository
 * @author Scyruz
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> 
{

}
