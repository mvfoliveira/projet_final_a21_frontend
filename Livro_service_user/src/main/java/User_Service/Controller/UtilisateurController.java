package User_Service.Controller;

import User_Service.Modele.Utilisateur;
import User_Service.Repository.UtilisateurRepo;
import User_Service.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UtilisateurController {
    @Autowired
    private final UtilisateurRepo utilisateurRepo;
    @Autowired
    private final UtilisateurService utilisateurService;


    public UtilisateurController(UtilisateurRepo utilisateurRepo, UtilisateurService utilisateurService) {
        this.utilisateurRepo = utilisateurRepo;
        this.utilisateurService = utilisateurService;
    }

    //PagePrincipale
    @GetMapping("/utilisateurs")
    public List<Utilisateur> pageInitial() {
        return utilisateurService.listAllUtilisateur();
    }


}