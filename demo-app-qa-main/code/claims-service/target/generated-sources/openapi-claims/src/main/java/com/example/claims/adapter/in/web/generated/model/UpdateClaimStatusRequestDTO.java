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
 * UpdateClaimStatusRequestDTO
 */

@JsonTypeName("UpdateClaimStatusRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class UpdateClaimStatusRequestDTO {

  private ClaimStatusDTO newStatus;

  public UpdateClaimStatusRequestDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateClaimStatusRequestDTO(ClaimStatusDTO newStatus) {
    this.newStatus = newStatus;
  }

  public UpdateClaimStatusRequestDTO newStatus(ClaimStatusDTO newStatus) {
    this.newStatus = newStatus;
    return this;
  }

  /**
   * Get newStatus
   * @return newStatus
   */
  @NotNull @Valid 
  @Schema(name = "newStatus", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("newStatus")
  public ClaimStatusDTO getNewStatus() {
    return newStatus;
  }

  public void setNewStatus(ClaimStatusDTO newStatus) {
    this.newStatus = newStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateClaimStatusRequestDTO updateClaimStatusRequest = (UpdateClaimStatusRequestDTO) o;
    return Objects.equals(this.newStatus, updateClaimStatusRequest.newStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateClaimStatusRequestDTO {\n");
    sb.append("    newStatus: ").append(toIndentedString(newStatus)).append("\n");
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

