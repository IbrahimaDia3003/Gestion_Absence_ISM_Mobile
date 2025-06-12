package sn.ism.gestion.utils.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import sn.ism.gestion.data.entities.Justification;
import sn.ism.gestion.mobile.dto.Response.JustificationSimpleMobileResponse;
import sn.ism.gestion.web.dto.Request.JustificationRequest;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-12T16:13:08+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.2 (Oracle Corporation)"
)
@Component
public class JustificationMapperImpl implements JustificationMapper {

    @Override
    public JustificationSimpleMobileResponse toDtoMobile(Justification Justification) {
        if ( Justification == null ) {
            return null;
        }

        JustificationSimpleMobileResponse justificationSimpleMobileResponse = new JustificationSimpleMobileResponse();

        justificationSimpleMobileResponse.setAbsenceId( Justification.getAbsenceId() );
        justificationSimpleMobileResponse.setCommentaire( Justification.getCommentaire() );
        justificationSimpleMobileResponse.setFichierUrl( Justification.getFichierUrl() );
        justificationSimpleMobileResponse.setStatut( Justification.getStatut() );
        justificationSimpleMobileResponse.setDateSoumission( Justification.getDateSoumission() );

        return justificationSimpleMobileResponse;
    }

    @Override
    public JustificationSimpleMobileResponse toDto(Justification Justification) {
        if ( Justification == null ) {
            return null;
        }

        JustificationSimpleMobileResponse justificationSimpleMobileResponse = new JustificationSimpleMobileResponse();

        justificationSimpleMobileResponse.setAbsenceId( Justification.getAbsenceId() );
        justificationSimpleMobileResponse.setCommentaire( Justification.getCommentaire() );
        justificationSimpleMobileResponse.setFichierUrl( Justification.getFichierUrl() );
        justificationSimpleMobileResponse.setStatut( Justification.getStatut() );
        justificationSimpleMobileResponse.setDateSoumission( Justification.getDateSoumission() );

        return justificationSimpleMobileResponse;
    }

    @Override
    public Justification toEntity(Justification request) {
        if ( request == null ) {
            return null;
        }

        Justification justification = new Justification();

        justification.setId( request.getId() );
        justification.setCreatedAt( request.getCreatedAt() );
        justification.setUpdatedAt( request.getUpdatedAt() );
        justification.setAbsenceId( request.getAbsenceId() );
        justification.setCommentaire( request.getCommentaire() );
        justification.setFichierUrl( request.getFichierUrl() );
        justification.setStatut( request.getStatut() );
        justification.setDateSoumission( request.getDateSoumission() );

        return justification;
    }

    @Override
    public Justification toEntityR(JustificationRequest request) {
        if ( request == null ) {
            return null;
        }

        Justification justification = new Justification();

        justification.setCommentaire( request.getCommentaire() );
        justification.setFichierUrl( request.getFichierUrl() );
        justification.setStatut( request.getStatut() );

        return justification;
    }
}
