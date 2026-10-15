package tn.esprit.autoloc.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.service.IEmployeService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/employe")

public class EmployeController {
    private final IEmployeService employeService ;

    @GetMapping("/afficherToutsContrat")
    public List<Employe> getAllEmployes(){
        return employeService.afficherAllEmploye();
    }

    @PostMapping("/ajouterEmplye")
    public Employe ajouterEmploye(@RequestBody Employe employe) {
        return employeService.ajouterEmploye(employe);
    }

    @PutMapping("/modifierEmploye")
    public Employe modifierEmploye(@RequestBody Employe employe) {
        return employeService.modifierEmploye(employe);
    }

    @PutMapping("/afficherEmploye/{id}")
    public Employe afficherEmploye(@PathVariable Long id) {
        return employeService.afficherEmployeById(id);
    }

    @DeleteMapping("/supprimerEmploye/{id}")
    public void supprimerEmploye(@PathVariable Long id){
        employeService.supprimerEmploye(id);
    }


}
