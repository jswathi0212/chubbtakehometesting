package com.example.demo.adapter.in.web;

import com.example.bff.adapter.in.web.generated.model.ClaimResponseDTO;
import com.example.bff.adapter.out.claims.generated.model.AdminClaimResponseDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-22T22:59:09+0530",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.10 (Oracle Corporation)"
)
@Component
public class AdminClaimResponseMapperImpl implements AdminClaimResponseMapper {

    @Override
    public ClaimResponseDTO toClaimResponse(AdminClaimResponseDTO adminClaim) {
        if ( adminClaim == null ) {
            return null;
        }

        ClaimResponseDTO claimResponseDTO = new ClaimResponseDTO();

        claimResponseDTO.setStatus( toBffClaimStatus( adminClaim.getStatus() ) );
        claimResponseDTO.setClaimId( adminClaim.getClaimId() );
        claimResponseDTO.setUserId( adminClaim.getUserId() );
        claimResponseDTO.setIncidentDate( adminClaim.getIncidentDate() );
        claimResponseDTO.setIncidentLocation( adminClaim.getIncidentLocation() );
        claimResponseDTO.setDescription( adminClaim.getDescription() );
        claimResponseDTO.setClaimAmount( adminClaim.getClaimAmount() );
        claimResponseDTO.setCreatedAt( adminClaim.getCreatedAt() );
        claimResponseDTO.setUpdatedAt( adminClaim.getUpdatedAt() );

        return claimResponseDTO;
    }

    @Override
    public List<ClaimResponseDTO> toClaimResponseList(List<AdminClaimResponseDTO> adminClaims) {
        if ( adminClaims == null ) {
            return null;
        }

        List<ClaimResponseDTO> list = new ArrayList<ClaimResponseDTO>( adminClaims.size() );
        for ( AdminClaimResponseDTO adminClaimResponseDTO : adminClaims ) {
            list.add( toClaimResponse( adminClaimResponseDTO ) );
        }

        return list;
    }

    @Override
    public ClaimResponseDTO toClaimResponse(com.example.bff.adapter.out.claims.generated.model.ClaimResponseDTO claimsServiceResponse) {
        if ( claimsServiceResponse == null ) {
            return null;
        }

        ClaimResponseDTO claimResponseDTO = new ClaimResponseDTO();

        claimResponseDTO.setStatus( toBffClaimStatus( claimsServiceResponse.getStatus() ) );
        claimResponseDTO.setClaimId( claimsServiceResponse.getClaimId() );
        claimResponseDTO.setUserId( claimsServiceResponse.getUserId() );
        claimResponseDTO.setIncidentDate( claimsServiceResponse.getIncidentDate() );
        claimResponseDTO.setIncidentLocation( claimsServiceResponse.getIncidentLocation() );
        claimResponseDTO.setDescription( claimsServiceResponse.getDescription() );
        claimResponseDTO.setClaimAmount( claimsServiceResponse.getClaimAmount() );
        claimResponseDTO.setCreatedAt( claimsServiceResponse.getCreatedAt() );
        claimResponseDTO.setUpdatedAt( claimsServiceResponse.getUpdatedAt() );

        return claimResponseDTO;
    }
}
