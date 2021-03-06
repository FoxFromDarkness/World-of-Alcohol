package dreamteam.Repositories;

import dreamteam.DAO.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

    List<User> findAll();

    User findUserByUsername(String name);
}
