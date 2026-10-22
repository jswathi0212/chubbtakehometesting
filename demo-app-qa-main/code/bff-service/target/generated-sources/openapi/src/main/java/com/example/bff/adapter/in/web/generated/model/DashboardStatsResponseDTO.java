package com.example.bff.adapter.in.web.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DashboardStatsResponseDTO
 */

@JsonTypeName("DashboardStatsResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class DashboardStatsResponseDTO {

  private Integer totalUsers;

  private Integer totalClaims;

  @Valid
  private Map<String, Integer> claimsByStatus = new HashMap<>();

  private Boolean cacheHit;

  private Integer queryTimeMs;

  public DashboardStatsResponseDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DashboardStatsResponseDTO(Integer totalUsers, Integer totalClaims, Map<String, Integer> claimsByStatus, Boolean cacheHit, Integer queryTimeMs) {
    this.totalUsers = totalUsers;
    this.totalClaims = totalClaims;
    this.claimsByStatus = claimsByStatus;
    this.cacheHit = cacheHit;
    this.queryTimeMs = queryTimeMs;
  }

  public DashboardStatsResponseDTO totalUsers(Integer totalUsers) {
    this.totalUsers = totalUsers;
    return this;
  }

  /**
   * Total number of users in the system
   * @return totalUsers
   */
  @NotNull 
  @Schema(name = "totalUsers", example = "50", description = "Total number of users in the system", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalUsers")
  public Integer getTotalUsers() {
    return totalUsers;
  }

  public void setTotalUsers(Integer totalUsers) {
    this.totalUsers = totalUsers;
  }

  public DashboardStatsResponseDTO totalClaims(Integer totalClaims) {
    this.totalClaims = totalClaims;
    return this;
  }

  /**
   * Total number of claims in the system
   * @return totalClaims
   */
  @NotNull 
  @Schema(name = "totalClaims", example = "142", description = "Total number of claims in the system", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalClaims")
  public Integer getTotalClaims() {
    return totalClaims;
  }

  public void setTotalClaims(Integer totalClaims) {
    this.totalClaims = totalClaims;
  }

  public DashboardStatsResponseDTO claimsByStatus(Map<String, Integer> claimsByStatus) {
    this.claimsByStatus = claimsByStatus;
    return this;
  }

  public DashboardStatsResponseDTO putClaimsByStatusItem(String key, Integer claimsByStatusItem) {
    if (this.claimsByStatus == null) {
      this.claimsByStatus = new HashMap<>();
    }
    this.claimsByStatus.put(key, claimsByStatusItem);
    return this;
  }

  /**
   * Count of claims grouped by status
   * @return claimsByStatus
   */
  @NotNull 
  @Schema(name = "claimsByStatus", example = "{\"SUBMITTED\":45,\"UNDER_REVIEW\":32,\"APPROVED\":50,\"REJECTED\":15,\"CLOSED\":0}", description = "Count of claims grouped by status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("claimsByStatus")
  public Map<String, Integer> getClaimsByStatus() {
    return claimsByStatus;
  }

  public void setClaimsByStatus(Map<String, Integer> claimsByStatus) {
    this.claimsByStatus = claimsByStatus;
  }

  public DashboardStatsResponseDTO cacheHit(Boolean cacheHit) {
    this.cacheHit = cacheHit;
    return this;
  }

  /**
   * Whether data was retrieved from Redis cache
   * @return cacheHit
   */
  @NotNull 
  @Schema(name = "cacheHit", example = "true", description = "Whether data was retrieved from Redis cache", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cacheHit")
  public Boolean getCacheHit() {
    return cacheHit;
  }

  public void setCacheHit(Boolean cacheHit) {
    this.cacheHit = cacheHit;
  }

  public DashboardStatsResponseDTO queryTimeMs(Integer queryTimeMs) {
    this.queryTimeMs = queryTimeMs;
    return this;
  }

  /**
   * Time taken to fetch data in milliseconds
   * @return queryTimeMs
   */
  @NotNull 
  @Schema(name = "queryTimeMs", example = "12", description = "Time taken to fetch data in milliseconds", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("queryTimeMs")
  public Integer getQueryTimeMs() {
    return queryTimeMs;
  }

  public void setQueryTimeMs(Integer queryTimeMs) {
    this.queryTimeMs = queryTimeMs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardStatsResponseDTO dashboardStatsResponse = (DashboardStatsResponseDTO) o;
    return Objects.equals(this.totalUsers, dashboardStatsResponse.totalUsers) &&
        Objects.equals(this.totalClaims, dashboardStatsResponse.totalClaims) &&
        Objects.equals(this.claimsByStatus, dashboardStatsResponse.claimsByStatus) &&
        Objects.equals(this.cacheHit, dashboardStatsResponse.cacheHit) &&
        Objects.equals(this.queryTimeMs, dashboardStatsResponse.queryTimeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalUsers, totalClaims, claimsByStatus, cacheHit, queryTimeMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardStatsResponseDTO {\n");
    sb.append("    totalUsers: ").append(toIndentedString(totalUsers)).append("\n");
    sb.append("    totalClaims: ").append(toIndentedString(totalClaims)).append("\n");
    sb.append("    claimsByStatus: ").append(toIndentedString(claimsByStatus)).append("\n");
    sb.append("    cacheHit: ").append(toIndentedString(cacheHit)).append("\n");
    sb.append("    queryTimeMs: ").append(toIndentedString(queryTimeMs)).append("\n");
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

