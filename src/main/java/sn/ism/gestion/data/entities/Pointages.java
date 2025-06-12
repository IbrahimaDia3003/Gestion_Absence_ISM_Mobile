package sn.ism.gestion.data.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import sn.ism.gestion.data.enums.StatusPaiment;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Document(collection = "pointages")
public class Pointages extends AbstractEntity
{
    private String nomComplet;
    private String matricule;
    private String cours;
    private LocalDate dateSession;
    private LocalTime heureSession;
    private StatusPaiment paiementStatut;

    private String vigileId; // ID du vigile qui a pointé
}
