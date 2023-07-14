export class Livres {
    code: number;
    titre: string;
    description: string;
    auteur: string;
    dateEdition: Date;
    maisonEdition: string;
    categorie: string;
    numeroCommande: number;
  
    constructor(
      code: number,
      titre: string,
      description: string,
      auteur: string,
      dateEdition: Date,
      maisonEdition: string,
      categorie: string,
      numeroCommande: number
    ) {
      this.code = code;
      this.titre = titre;
      this.description = description;
      this.auteur = auteur;
      this.dateEdition = dateEdition;
      this.maisonEdition = maisonEdition;
      this.categorie = categorie;
      this.numeroCommande = numeroCommande;
    }
  }
  