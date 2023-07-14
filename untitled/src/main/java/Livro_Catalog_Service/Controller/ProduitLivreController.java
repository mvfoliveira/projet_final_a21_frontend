package Livro_Catalog_Service.Controller;


import Livro_Catalog_Service.Modele.ProduitLivre;
import Livro_Catalog_Service.Repository.ProduitLivreRepo;
import Livro_Catalog_Service.Service.ProduitLivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProduitLivreController  {
    @Autowired
    private final ProduitLivreRepo produitLivreRepo;
    @Autowired
    private final ProduitLivreService produitLivreService;


    public ProduitLivreController(ProduitLivreRepo produitLivreRepo, ProduitLivreService produitLivreService) {
        this.produitLivreRepo = produitLivreRepo;
        this.produitLivreService = produitLivreService;
    }

    //PagePrincipale
    @GetMapping("/livres")
    public List<ProduitLivre> pageInitial() {
        return produitLivreService.listAllProduitLivre();
    }

    //PagePrincipale
    @GetMapping("/livres/livreById/{id}")
    public Optional<ProduitLivre> livreById(@PathVariable int id)
    {
        return produitLivreService.listLivreById(id);

    }


}
