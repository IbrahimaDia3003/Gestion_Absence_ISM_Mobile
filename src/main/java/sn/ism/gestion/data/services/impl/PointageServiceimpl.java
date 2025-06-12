package sn.ism.gestion.data.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.ism.gestion.data.entities.Pointages;
import sn.ism.gestion.data.repositories.PointageRepository;
import sn.ism.gestion.data.services.PointageService;
import sn.ism.gestion.mobile.dto.Request.EtudiantQrCodeRequest;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PointageServiceimpl implements PointageService
{

    @Autowired
    private PointageRepository pointageRepository;
    @Override
    public Pointages createPointage(String vigileId, EtudiantQrCodeRequest etudiantQrCode)
    {

        Pointages pointage = new Pointages();

        pointage.setMatricule(etudiantQrCode.getMatricule());
        pointage.setNomComplet(etudiantQrCode.getNomComplet());
        pointage.setHeureSession(etudiantQrCode.getHeureSession());
        pointage.setPaiementStatut((etudiantQrCode.getPaiementStatut()));
        pointage.setCours(etudiantQrCode.getCours());
        pointage.setDateSession(etudiantQrCode.getDateSession());

        pointage.setVigileId(vigileId);

        return pointageRepository.save(pointage);
    }

    @Override
    public List<Pointages> getPointagesByVigile(String vigileId)
    {
        if (vigileId != null && !vigileId.isEmpty())
            return pointageRepository.findPointagesByVigileId(vigileId);
        return null;
    }
}
