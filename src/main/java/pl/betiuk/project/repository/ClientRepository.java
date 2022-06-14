package pl.betiuk.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.betiuk.project.model.Client;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository <Client, Long> {
    @Override
    void deleteById(Long id);
}
