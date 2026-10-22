package com.example.demo.adapter.out.persistence;

import com.example.demo.domain.claim.Claim;
import com.example.demo.domain.claim.ClaimStatus;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-22T22:58:46+0530",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.10 (Oracle Corporation)"
)
@Component
public class ClaimPersistenceMapperImpl implements ClaimPersistenceMapper {

    @Override
    public ClaimEntity toEntity(Claim claim) {
        if ( claim == null ) {
            return null;
        }

        UUID claimId = null;
        UUID userId = null;
        LocalDate incidentDate = null;
        String incidentLocation = null;
        String description = null;
        BigDecimal claimAmount = null;
        ClaimStatus status = null;
        Instant createdAt = null;
        Instant updatedAt = null;

        claimId = claim.getClaimId();
        userId = claim.getUserId();
        incidentDate = claim.getIncidentDate();
        incidentLocation = claim.getIncidentLocation();
        description = claim.getDescription();
        claimAmount = claim.getClaimAmount();
        status = claim.getStatus();
        createdAt = claim.getCreatedAt();
        updatedAt = claim.getUpdatedAt();

        ClaimEntity claimEntity = new ClaimEntity( claimId, userId, incidentDate, incidentLocation, description, claimAmount, status, createdAt, updatedAt );

        return claimEntity;
    }
}
