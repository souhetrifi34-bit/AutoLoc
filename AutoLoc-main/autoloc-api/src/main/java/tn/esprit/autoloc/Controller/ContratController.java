package tn.esprit.autoloc.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.IContratService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/clients")

public class ContratController {
    private final IContratService contratService;

    @GetMapping("/afficherToutsContrat")
    public List<Contrat> getAllContrats(){
        return contratService.afficherAllContrat();
    }

    @PostMapping("/ajouterContrat")
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return contratService.ajouterContrat(contrat);
    }

    @PutMapping("/modifierContrat")
    public Contrat modifierContrat(@RequestBody Contrat contrat) {
        return contratService.modifierContrat(contrat);
    }

    @PutMapping("/afficherContrat/{id}")
    public Contrat afficherContart(@PathVariable Long id) {
        return contratService.afficherContratById(id);
    }

    @DeleteMapping("/supprimerContrat/{id}")
    public void supprimerContrat(@PathVariable Long id){
        contratService.supprimerContrat(id);
    }


}
