
package renta.auditorio.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import renta.auditorio.model.Client;
import renta.auditorio.repository.ClientRepository;

@Service

public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll() {
        return clientRepository.getAll();
    }

    public Optional<Client> getClient(int id) {
        return clientRepository.getClient(id);
    }

    public Client save(Client clt) {
        if (clt.getIdClient() == null) {
            return clientRepository.save(clt);
        } else {
            Optional<Client> consulta = clientRepository.getClient(clt.getIdClient());
            if (consulta.isEmpty()) {
                return clientRepository.save(clt);
            } else {
                return clt;

            }
        }
    }
}
