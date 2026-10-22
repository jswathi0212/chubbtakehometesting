package com.example.demo.adapter.in.web;

import com.example.claims.adapter.in.web.generated.model.ClaimResponseDTO;
import com.example.claims.adapter.in.web.generated.model.ClaimSummaryResponseDTO;
import com.example.demo.domain.claim.Claim;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-22T22:58:47+0530",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.10 (Oracle Corporation)"
)
@Component
public class ClaimWebMapperImpl implements ClaimWebMapper {

    @Override
    public ClaimResponseDTO toResponse(Claim claim) {
        if ( claim == null ) {
            return null;
        }

        ClaimResponseDTO claimResponseDTO = new ClaimResponseDTO();

        claimResponseDTO.setStatus( toStatusDTO( claim.getStatus() ) );
        claimResponseDTO.setCreatedAt( toOffsetDateTime( claim.getCreatedAt() ) );
        claimResponseDTO.setUpdatedAt( toOffsetDateTime( claim.getUpdatedAt() ) );
        claimResponseDTO.setClaimId( claim.getClaimId() );
        claimResponseDTO.setUserId( claim.getUserId() );
        claimResponseDTO.setIncidentDate( claim.getIncidentDate() );
        claimResponseDTO.setIncidentLocation( claim.getIncidentLocation() );
        claimResponseDTO.setDescription( claim.getDescription() );

        claimResponseDTO.setClaimAmount( claim.getClaimAmount().doubleValue() );

        return claimResponseDTO;
    }

    @Override
    public ClaimSummaryResponseDTO toSummaryResponse(Claim claim) {
        if ( claim == null ) {
            return null;
        }

        ClaimSummaryResponseDTO claimSummaryResponseDTO = new ClaimSummaryResponseDTO();

        claimSummaryResponseDTO.setDescription( truncateDescription( claim ) );
        claimSummaryResponseDTO.setStatus( toStatusDTO( claim.getStatus() ) );
        claimSummaryResponseDTO.setCreatedAt( toOffsetDateTime( claim.getCreatedAt() ) );
        claimSummaryResponseDTO.setClaimId( claim.getClaimId() );
        claimSummaryResponseDTO.setIncidentDate( claim.getIncidentDate() );

        claimSummaryResponseDTO.setClaimAmount( claim.getClaimAmount().doubleValue() );

        return claimSummaryResponseDTO;
    }
}
