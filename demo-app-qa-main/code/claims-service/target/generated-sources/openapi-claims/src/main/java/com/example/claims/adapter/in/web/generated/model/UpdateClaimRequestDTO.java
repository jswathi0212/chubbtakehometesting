package com.example.claims.adapter.in.web.generated.model;

import java.net.URI;
import java.util.Objects;
import com.example.claims.adapter.in.web.generated.model.ClaimStatusDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UpdateClaimRequestDTO
 */

@JsonTypeName("UpdateClaimRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class UpdateClaimRequestDTO {

  private Optional<ClaimStatusDTO> status = Optional.empty();

  private Optional<@Size(min = 10, max = 2000) String> description = Optional.empty();

  public UpdateClaimRequestDTO status(ClaimStatusDTO status) {
    this.status = Optional.ofNullable(status);
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public Optional<ClaimStatusDTO> getStatus() {
    return status;
  }

  public void setStatus(Optional<ClaimStatusDTO> status) {
    this.status = status;
  }

  public UpdateClaimRequestDTO description(String description) {
    this.description = Optional.ofNullable(description);
    return this;
  }

  /**
   * Updated description of the incident
   * @return description
   */
  
  @Schema(name = "description", example = "Water damage to basement due to pipe burst - updated with adjuster notes", description = "Updated description of the incident", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public Optional<@Size(min = 10, max = 2000) String> getDescription() {
    return description;
  }

  public void setDescription(Optional<String> description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClaimRequestDTO updateClaimRequest = (UpdateClaimRequestDTO) o;
    return Objects.equals(this.status, updateClaimRequest.status) &&
        Objects.equals(this.description, updateClaimRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateClaimRequestDTO {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

