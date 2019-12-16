package local.alfonso.safezoos.repositories;

import local.alfonso.safezoos.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
    User findByUsername(String username);
}
