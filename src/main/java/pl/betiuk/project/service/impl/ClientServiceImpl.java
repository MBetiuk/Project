package pl.betiuk.project.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.betiuk.project.model.Address;
import pl.betiuk.project.model.Client;
import pl.betiuk.project.repository.ClientRepository;
import pl.betiuk.project.service.ClientService;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ClientServiceImpl<T> implements ClientService<Client> {

    private final ClientRepository clientRepository;



    @Override
    public Optional<Client> findByAddress(Address address) {
        return Optional.empty();
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id).get();
    }
}
