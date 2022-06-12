package pl.betiuk.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.betiuk.project.model.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    User findUserByNick(String nick);
}
