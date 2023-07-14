package User_Service.Service;

import User_Service.Modele.Utilisateur;
import User_Service.Repository.UtilisateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepo utilisateurRepo;

    public List<Utilisateur> listAllUtilisateur() {
        return utilisateurRepo.findAll();
    }
}
