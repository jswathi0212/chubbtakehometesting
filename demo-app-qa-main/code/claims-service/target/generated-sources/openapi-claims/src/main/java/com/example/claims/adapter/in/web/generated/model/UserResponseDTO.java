package com.example.claims.adapter.in.web.generated.model;

import java.net.URI;
import java.util.Objects;
import com.example.claims.adapter.in.web.generated.model.UserRoleDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * UserResponseDTO
 */

@JsonTypeName("UserResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class UserResponseDTO {

  private UUID userId;

  private String email;

  private String name;

  private UserRoleDTO role;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  public UserResponseDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserResponseDTO(UUID userId, String email, String name, UserRoleDTO role, OffsetDateTime createdAt) {
    this.userId = userId;
    this.email = email;
    this.name = name;
    this.role = role;
    this.createdAt = createdAt;
  }

  public UserResponseDTO userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Unique user identifier
   * @return userId
   */
  @NotNull @Valid 
  @Schema(name = "userId", example = "550e8400-e29b-41d4-a716-446655440000", description = "Unique user identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public UserResponseDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * User's email address
   * @return email
   */
  @NotNull @jakarta.validation.constraints.Email 
  @Schema(name = "email", example = "jane.doe@example.com", description = "User's email address", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserResponseDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * User's full name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "Jane Doe", description = "User's full name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserResponseDTO role(UserRoleDTO role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   */
  @NotNull @Valid 
  @Schema(name = "role", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public UserRoleDTO getRole() {
    return role;
  }

  public void setRole(UserRoleDTO role) {
    this.role = role;
  }

  public UserResponseDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Account creation timestamp (ISO 8601)
   * @return createdAt
   */
  @NotNull @Valid 
  @Schema(name = "createdAt", example = "2026-02-17T10:30Z", description = "Account creation timestamp (ISO 8601)", requiredMode = Schema.RequiredMode.REQUIRED)
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
    UserResponseDTO userResponse = (UserResponseDTO) o;
    return Objects.equals(this.userId, userResponse.userId) &&
        Objects.equals(this.email, userResponse.email) &&
        Objects.equals(this.name, userResponse.name) &&
        Objects.equals(this.role, userResponse.role) &&
        Objects.equals(this.createdAt, userResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, email, name, role, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponseDTO {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

