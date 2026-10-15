package tn.esprit.autoloc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agences")

public class AgenceController {
    private final IAgenceService agenceService;

    @GetMapping("/afficherToutsAgences")
    public List<Agence> getAllAgences(){
        return agenceService.afficherAllAgence();
    }

    @PostMapping("/ajouterAgences")
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.ajouterAgence(agence);
    }

    @PutMapping("/modifierAgence")
    public Agence modifierAgence(@RequestBody Agence agence) {
        return agenceService.modifierAgence(agence);
    }

    @PutMapping("/afficherAgence/{id}")
    public Agence afficherAgence(@PathVariable Long id) {
        return agenceService.afficherAgenceById(id);
    }

    @DeleteMapping("/supprimerAgence/{id}")
    public void supprimerAgence(@PathVariable Long id){
        agenceService.supprimerAgence(id);
    }

}
