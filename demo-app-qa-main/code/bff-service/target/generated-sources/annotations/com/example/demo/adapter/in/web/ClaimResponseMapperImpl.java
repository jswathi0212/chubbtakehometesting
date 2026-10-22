package com.example.demo.adapter.in.web;

import com.example.bff.adapter.in.web.generated.model.ClaimResponseDTO;
import com.example.bff.adapter.in.web.generated.model.ClaimSummaryResponseDTO;
import com.example.demo.application.auth.ClaimsServicePort;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-22T22:59:10+0530",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.10 (Oracle Corporation)"
)
@Component
public class ClaimResponseMapperImpl implements ClaimResponseMapper {

    @Override
    public ClaimResponseDTO toResponse(ClaimsServicePort.ClaimRecord claim) {
        if ( claim == null ) {
            return null;
        }

        ClaimResponseDTO claimResponseDTO = new ClaimResponseDTO();

        claimResponseDTO.setClaimAmount( bigDecimalToDouble( claim.claimAmount() ) );
        claimResponseDTO.setStatus( toStatusDTO( claim.status() ) );
        claimResponseDTO.setClaimId( claim.claimId() );
        claimResponseDTO.setUserId( claim.userId() );
        claimResponseDTO.setIncidentDate( claim.incidentDate() );
        claimResponseDTO.setIncidentLocation( claim.incidentLocation() );
        claimResponseDTO.setDescription( claim.description() );
        claimResponseDTO.setCreatedAt( claim.createdAt() );
        claimResponseDTO.setUpdatedAt( claim.updatedAt() );

        return claimResponseDTO;
    }

    @Override
    public ClaimSummaryResponseDTO toSummaryResponse(ClaimsServicePort.ClaimSummaryRecord claim) {
        if ( claim == null ) {
            return null;
        }

        ClaimSummaryResponseDTO claimSummaryResponseDTO = new ClaimSummaryResponseDTO();

        claimSummaryResponseDTO.setClaimAmount( bigDecimalToDouble( claim.claimAmount() ) );
        claimSummaryResponseDTO.setStatus( toStatusDTO( claim.status() ) );
        claimSummaryResponseDTO.setClaimId( claim.claimId() );
        claimSummaryResponseDTO.setIncidentDate( claim.incidentDate() );
        claimSummaryResponseDTO.setDescription( claim.description() );
        claimSummaryResponseDTO.setCreatedAt( claim.createdAt() );

        return claimSummaryResponseDTO;
    }
}
