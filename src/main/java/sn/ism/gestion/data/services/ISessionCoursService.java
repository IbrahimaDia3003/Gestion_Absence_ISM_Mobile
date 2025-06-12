package sn.ism.gestion.data.services;

import java.time.LocalDate;
import java.util.List;

import sn.ism.gestion.Config.Service;
import sn.ism.gestion.data.entities.SessionCours;
import sn.ism.gestion.mobile.dto.Response.SessionEtudiantQrCodeMobileResponse;

public interface ISessionCoursService extends Service<SessionCours> {

    List<SessionCours> getAllSessionCours(LocalDate date);
    List<SessionEtudiantQrCodeMobileResponse> getSessionsDuJourWithEtudiant() ;
//    List<SessionCours> findSessionCoursByEtudiantId(String etudiantId);

}
