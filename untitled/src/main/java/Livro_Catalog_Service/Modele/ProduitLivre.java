package Livro_Catalog_Service.Modele;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="produitlivre")
public class ProduitLivre {

    @Id
    @Column(name="Code")
    private int code;

    @Column(name="Titre")
    private String titre;

    @Column(name="Description")
    private String description;

    @Column(name="Auteur")
    private String auteur;

    @Column(name="Date_edition")
    private LocalDate dateEdition;

    @Column(name="Maison_edition")
    private String maisonEdition;

    @Column(name="Categorie")
    private String categorie;


    @Column(name="Numero_commande")
    private int numeroCommande;

    public ProduitLivre() {
    }

    public ProduitLivre(int code, String titre, String description, String auteur, LocalDate dateEdition, String maisonEdition, String categorie, int numeroCommande) {
        this.code = code;
        this.titre = titre;
        this.description = description;
        this.auteur = auteur;
        this.dateEdition = dateEdition;
        this.maisonEdition = maisonEdition;
        this.categorie = categorie;
        this.numeroCommande = numeroCommande;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public LocalDate getDateEdition() {
        return dateEdition;
    }

    public void setDateEdition(LocalDate dateEdition) {
        this.dateEdition = dateEdition;
    }

    public String getMaisonEdition() {
        return maisonEdition;
    }

    public void setMaisonEdition(String maisonEdition) {
        this.maisonEdition = maisonEdition;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    @Override
    public String toString() {
        return "ProduitLivre{" +
                "code=" + code +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", auteur='" + auteur + '\'' +
                ", dateEdition=" + dateEdition +
                ", maisonEdition='" + maisonEdition + '\'' +
                ", categorie='" + categorie + '\'' +
                ", numeroCommande=" + numeroCommande +
                '}';
    }
}
