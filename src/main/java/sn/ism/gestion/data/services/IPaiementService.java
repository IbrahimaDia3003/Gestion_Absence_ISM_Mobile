package sn.ism.gestion.data.services;

import sn.ism.gestion.Config.Service;
import sn.ism.gestion.data.entities.Etudiant;
import sn.ism.gestion.data.entities.Paiement;

public interface IPaiementService extends Service<Paiement> {
     Etudiant estAjourDansPaiement(String etudiantId) ;

}
