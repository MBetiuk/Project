package pl.betiuk.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.betiuk.project.model.Client;

import java.awt.print.Book;
import java.util.List;
@Repository
public interface ClientRepository extends JpaRepository <Client, Long> {






}
