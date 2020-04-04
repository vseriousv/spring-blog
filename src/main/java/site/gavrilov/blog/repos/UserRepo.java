package site.gavrilov.blog.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import site.gavrilov.blog.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
