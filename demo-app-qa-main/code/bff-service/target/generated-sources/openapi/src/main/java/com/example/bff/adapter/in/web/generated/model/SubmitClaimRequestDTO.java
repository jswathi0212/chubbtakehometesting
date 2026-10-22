package com.example.bff.adapter.in.web.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;
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
 * SubmitClaimRequestDTO
 */

@JsonTypeName("SubmitClaimRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class SubmitClaimRequestDTO {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate incidentDate;

  private String incidentLocation;

  private String description;

  private Double claimAmount;

  public SubmitClaimRequestDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SubmitClaimRequestDTO(LocalDate incidentDate, String incidentLocation, String description, Double claimAmount) {
    this.incidentDate = incidentDate;
    this.incidentLocation = incidentLocation;
    this.description = description;
    this.claimAmount = claimAmount;
  }

  public SubmitClaimRequestDTO incidentDate(LocalDate incidentDate) {
    this.incidentDate = incidentDate;
    return this;
  }

  /**
   * Date of the incident (ISO 8601 date)
   * @return incidentDate
   */
  @NotNull @Valid 
  @Schema(name = "incidentDate", example = "2026-02-15", description = "Date of the incident (ISO 8601 date)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("incidentDate")
  public LocalDate getIncidentDate() {
    return incidentDate;
  }

  public void setIncidentDate(LocalDate incidentDate) {
    this.incidentDate = incidentDate;
  }

  public SubmitClaimRequestDTO incidentLocation(String incidentLocation) {
    this.incidentLocation = incidentLocation;
    return this;
  }

  /**
   * Location where the incident occurred
   * @return incidentLocation
   */
  @NotNull @Size(min = 5, max = 200) 
  @Schema(name = "incidentLocation", example = "123 Main St, Springfield, IL", description = "Location where the incident occurred", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("incidentLocation")
  public String getIncidentLocation() {
    return incidentLocation;
  }

  public void setIncidentLocation(String incidentLocation) {
    this.incidentLocation = incidentLocation;
  }

  public SubmitClaimRequestDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Detailed description of the incident
   * @return description
   */
  @NotNull @Size(min = 10, max = 1000) 
  @Schema(name = "description", example = "Water damage to basement due to pipe burst", description = "Detailed description of the incident", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SubmitClaimRequestDTO claimAmount(Double claimAmount) {
    this.claimAmount = claimAmount;
    return this;
  }

  /**
   * Claimed amount in USD
   * minimum: 0.01
   * maximum: 1000000
   * @return claimAmount
   */
  @NotNull @DecimalMin("0.01") @DecimalMax("1000000") 
  @Schema(name = "claimAmount", example = "5000.0", description = "Claimed amount in USD", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("claimAmount")
  public Double getClaimAmount() {
    return claimAmount;
  }

  public void setClaimAmount(Double claimAmount) {
    this.claimAmount = claimAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitClaimRequestDTO submitClaimRequest = (SubmitClaimRequestDTO) o;
    return Objects.equals(this.incidentDate, submitClaimRequest.incidentDate) &&
        Objects.equals(this.incidentLocation, submitClaimRequest.incidentLocation) &&
        Objects.equals(this.description, submitClaimRequest.description) &&
        Objects.equals(this.claimAmount, submitClaimRequest.claimAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incidentDate, incidentLocation, description, claimAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitClaimRequestDTO {\n");
    sb.append("    incidentDate: ").append(toIndentedString(incidentDate)).append("\n");
    sb.append("    incidentLocation: ").append(toIndentedString(incidentLocation)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    claimAmount: ").append(toIndentedString(claimAmount)).append("\n");
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

