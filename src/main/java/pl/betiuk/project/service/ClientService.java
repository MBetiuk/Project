package pl.betiuk.project.service;

import org.springframework.data.jpa.repository.Query;
import pl.betiuk.project.model.Address;
import pl.betiuk.project.model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService<T> {

    @Query("select c from Client c where c.address = ?1")
    Optional<Client> findByAddress(Address address);


    List<T> findAll();

    T findById(Long id);
}
