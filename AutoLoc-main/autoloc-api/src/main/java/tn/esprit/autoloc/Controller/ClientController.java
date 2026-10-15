package tn.esprit.autoloc.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.IClientService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/clients")

public class ClientController {
    private final IClientService clientService;

    @GetMapping("/afficherToutsAgences")
    public List<Client> getAllClients(){
        return clientService.afficherAllClient();
    }

    @PostMapping("/ajouterClient")
    public Client ajouterClient(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }

    @PutMapping("/modifierClient")
    public Client modifierClient(@RequestBody Client client) {
        return clientService.modifierClient(client);
    }

    @PutMapping("/afficherClient/{id}")
    public Client afficherClient(@PathVariable Long id) {
        return clientService.afficherClientById(id);
    }

    @DeleteMapping("/supprimerClient/{id}")
    public void supprimerClient(@PathVariable Long id){
        clientService.supprimerClient(id);
    }


}
