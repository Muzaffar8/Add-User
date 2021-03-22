package newera.postgre;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface UsersRepository extends CrudRepository<Users, Integer>{

}
