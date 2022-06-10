package pl.betiuk.project.service;

import pl.betiuk.project.model.Client;

import java.util.Optional;

public interface ClientService<T> {

    Optional<Client> findById(Long id);
}
