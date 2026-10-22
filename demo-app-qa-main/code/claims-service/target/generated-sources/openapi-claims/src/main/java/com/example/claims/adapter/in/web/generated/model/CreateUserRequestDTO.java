package com.example.claims.adapter.in.web.generated.model;

import java.net.URI;
import java.util.Objects;
import com.example.claims.adapter.in.web.generated.model.UserRoleDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateUserRequestDTO
 */

@JsonTypeName("CreateUserRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class CreateUserRequestDTO {

  private UUID userId;

  private String email;

  private String name;

  private UserRoleDTO role;

  public CreateUserRequestDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateUserRequestDTO(UUID userId, String email, String name, UserRoleDTO role) {
    this.userId = userId;
    this.email = email;
    this.name = name;
    this.role = role;
  }

  public CreateUserRequestDTO userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User ID from Keycloak (must match Keycloak user ID)
   * @return userId
   */
  @NotNull @Valid 
  @Schema(name = "userId", example = "550e8400-e29b-41d4-a716-446655440000", description = "User ID from Keycloak (must match Keycloak user ID)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public CreateUserRequestDTO email(String email) {
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

  public CreateUserRequestDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * User's full name
   * @return name
   */
  @NotNull @Size(min = 2, max = 100) 
  @Schema(name = "name", example = "Jane Doe", description = "User's full name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateUserRequestDTO role(UserRoleDTO role) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserRequestDTO createUserRequest = (CreateUserRequestDTO) o;
    return Objects.equals(this.userId, createUserRequest.userId) &&
        Objects.equals(this.email, createUserRequest.email) &&
        Objects.equals(this.name, createUserRequest.name) &&
        Objects.equals(this.role, createUserRequest.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, email, name, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserRequestDTO {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

