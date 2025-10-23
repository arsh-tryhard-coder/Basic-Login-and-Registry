package BasicAuthenticator.com.Repository;

import BasicAuthenticator.com.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}