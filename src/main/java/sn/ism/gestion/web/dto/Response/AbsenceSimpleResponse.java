package sn.ism.gestion.web.dto.Response;

import sn.ism.gestion.data.enums.Situation;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
public class AbsenceSimpleResponse
{

    private String id;
    // Informations sur l’absence
    private Situation type;
    private boolean justifiee;
    private String justificationId;
    // Informations sur la session de cours
    private String sessionId;
    private LocalDate sessionDate;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    // Informations sur l’étudiant
    private String nomEtudiant;
    private String prenomEtudiant;
    private String classeEtudiant;

}
