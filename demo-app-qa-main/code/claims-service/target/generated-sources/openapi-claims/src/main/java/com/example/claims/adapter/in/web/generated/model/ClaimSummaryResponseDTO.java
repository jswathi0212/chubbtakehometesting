package com.example.claims.adapter.in.web.generated.model;

import java.net.URI;
import java.util.Objects;
import com.example.claims.adapter.in.web.generated.model.ClaimStatusDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ClaimSummaryResponseDTO
 */

@JsonTypeName("ClaimSummaryResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class ClaimSummaryResponseDTO {

  private UUID claimId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate incidentDate;

  private String description;

  private Double claimAmount;

  private ClaimStatusDTO status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  public ClaimSummaryResponseDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ClaimSummaryResponseDTO(UUID claimId, LocalDate incidentDate, String description, Double claimAmount, ClaimStatusDTO status, OffsetDateTime createdAt) {
    this.claimId = claimId;
    this.incidentDate = incidentDate;
    this.description = description;
    this.claimAmount = claimAmount;
    this.status = status;
    this.createdAt = createdAt;
  }

  public ClaimSummaryResponseDTO claimId(UUID claimId) {
    this.claimId = claimId;
    return this;
  }

  /**
   * Unique claim identifier
   * @return claimId
   */
  @NotNull @Valid 
  @Schema(name = "claimId", example = "660e8400-e29b-41d4-a716-446655440001", description = "Unique claim identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("claimId")
  public UUID getClaimId() {
    return claimId;
  }

  public void setClaimId(UUID claimId) {
    this.claimId = claimId;
  }

  public ClaimSummaryResponseDTO incidentDate(LocalDate incidentDate) {
    this.incidentDate = incidentDate;
    return this;
  }

  /**
   * Date of the incident
   * @return incidentDate
   */
  @NotNull @Valid 
  @Schema(name = "incidentDate", example = "2026-02-15", description = "Date of the incident", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("incidentDate")
  public LocalDate getIncidentDate() {
    return incidentDate;
  }

  public void setIncidentDate(LocalDate incidentDate) {
    this.incidentDate = incidentDate;
  }

  public ClaimSummaryResponseDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Truncated description (first 100 characters)
   * @return description
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "description", example = "Water damage to basement due to pipe burst", description = "Truncated description (first 100 characters)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ClaimSummaryResponseDTO claimAmount(Double claimAmount) {
    this.claimAmount = claimAmount;
    return this;
  }

  /**
   * Claimed amount in USD
   * @return claimAmount
   */
  @NotNull 
  @Schema(name = "claimAmount", example = "5000.0", description = "Claimed amount in USD", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("claimAmount")
  public Double getClaimAmount() {
    return claimAmount;
  }

  public void setClaimAmount(Double claimAmount) {
    this.claimAmount = claimAmount;
  }

  public ClaimSummaryResponseDTO status(ClaimStatusDTO status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public ClaimStatusDTO getStatus() {
    return status;
  }

  public void setStatus(ClaimStatusDTO status) {
    this.status = status;
  }

  public ClaimSummaryResponseDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Claim creation timestamp
   * @return createdAt
   */
  @NotNull @Valid 
  @Schema(name = "createdAt", example = "2026-02-17T10:30Z", description = "Claim creation timestamp", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClaimSummaryResponseDTO claimSummaryResponse = (ClaimSummaryResponseDTO) o;
    return Objects.equals(this.claimId, claimSummaryResponse.claimId) &&
        Objects.equals(this.incidentDate, claimSummaryResponse.incidentDate) &&
        Objects.equals(this.description, claimSummaryResponse.description) &&
        Objects.equals(this.claimAmount, claimSummaryResponse.claimAmount) &&
        Objects.equals(this.status, claimSummaryResponse.status) &&
        Objects.equals(this.createdAt, claimSummaryResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimId, incidentDate, description, claimAmount, status, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaimSummaryResponseDTO {\n");
    sb.append("    claimId: ").append(toIndentedString(claimId)).append("\n");
    sb.append("    incidentDate: ").append(toIndentedString(incidentDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    claimAmount: ").append(toIndentedString(claimAmount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

