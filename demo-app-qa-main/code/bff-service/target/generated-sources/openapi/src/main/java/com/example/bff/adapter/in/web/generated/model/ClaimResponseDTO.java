package com.example.bff.adapter.in.web.generated.model;

import java.net.URI;
import java.util.Objects;
import com.example.bff.adapter.in.web.generated.model.ClaimStatusDTO;
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
 * ClaimResponseDTO
 */

@JsonTypeName("ClaimResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class ClaimResponseDTO {

  private UUID claimId;

  private UUID userId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate incidentDate;

  private String incidentLocation;

  private String description;

  private Double claimAmount;

  private ClaimStatusDTO status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public ClaimResponseDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ClaimResponseDTO(UUID claimId, UUID userId, LocalDate incidentDate, String incidentLocation, String description, Double claimAmount, ClaimStatusDTO status, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
    this.claimId = claimId;
    this.userId = userId;
    this.incidentDate = incidentDate;
    this.incidentLocation = incidentLocation;
    this.description = description;
    this.claimAmount = claimAmount;
    this.status = status;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public ClaimResponseDTO claimId(UUID claimId) {
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

  public ClaimResponseDTO userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * ID of the user who submitted the claim
   * @return userId
   */
  @NotNull @Valid 
  @Schema(name = "userId", example = "550e8400-e29b-41d4-a716-446655440000", description = "ID of the user who submitted the claim", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public ClaimResponseDTO incidentDate(LocalDate incidentDate) {
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

  public ClaimResponseDTO incidentLocation(String incidentLocation) {
    this.incidentLocation = incidentLocation;
    return this;
  }

  /**
   * Location where the incident occurred
   * @return incidentLocation
   */
  @NotNull 
  @Schema(name = "incidentLocation", example = "123 Main St, Springfield, IL", description = "Location where the incident occurred", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("incidentLocation")
  public String getIncidentLocation() {
    return incidentLocation;
  }

  public void setIncidentLocation(String incidentLocation) {
    this.incidentLocation = incidentLocation;
  }

  public ClaimResponseDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the incident
   * @return description
   */
  @NotNull 
  @Schema(name = "description", example = "Water damage to basement due to pipe burst", description = "Description of the incident", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ClaimResponseDTO claimAmount(Double claimAmount) {
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

  public ClaimResponseDTO status(ClaimStatusDTO status) {
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

  public ClaimResponseDTO createdAt(OffsetDateTime createdAt) {
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

  public ClaimResponseDTO updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Last update timestamp
   * @return updatedAt
   */
  @NotNull @Valid 
  @Schema(name = "updatedAt", example = "2026-02-17T10:30Z", description = "Last update timestamp", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClaimResponseDTO claimResponse = (ClaimResponseDTO) o;
    return Objects.equals(this.claimId, claimResponse.claimId) &&
        Objects.equals(this.userId, claimResponse.userId) &&
        Objects.equals(this.incidentDate, claimResponse.incidentDate) &&
        Objects.equals(this.incidentLocation, claimResponse.incidentLocation) &&
        Objects.equals(this.description, claimResponse.description) &&
        Objects.equals(this.claimAmount, claimResponse.claimAmount) &&
        Objects.equals(this.status, claimResponse.status) &&
        Objects.equals(this.createdAt, claimResponse.createdAt) &&
        Objects.equals(this.updatedAt, claimResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimId, userId, incidentDate, incidentLocation, description, claimAmount, status, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaimResponseDTO {\n");
    sb.append("    claimId: ").append(toIndentedString(claimId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    incidentDate: ").append(toIndentedString(incidentDate)).append("\n");
    sb.append("    incidentLocation: ").append(toIndentedString(incidentLocation)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    claimAmount: ").append(toIndentedString(claimAmount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

