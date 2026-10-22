package com.example.bff.adapter.in.web.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SignupRequestDTO
 */

@JsonTypeName("SignupRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class SignupRequestDTO {

  private String email;

  private String password;

  private String name;

  public SignupRequestDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SignupRequestDTO(String email, String password, String name) {
    this.email = email;
    this.password = password;
    this.name = name;
  }

  public SignupRequestDTO email(String email) {
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

  public SignupRequestDTO password(String password) {
    this.password = password;
    return this;
  }

  /**
   * User's password (minimum 8 characters)
   * @return password
   */
  @NotNull @Size(min = 8) 
  @Schema(name = "password", example = "SecurePass123!", description = "User's password (minimum 8 characters)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public SignupRequestDTO name(String name) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignupRequestDTO signupRequest = (SignupRequestDTO) o;
    return Objects.equals(this.email, signupRequest.email) &&
        Objects.equals(this.password, signupRequest.password) &&
        Objects.equals(this.name, signupRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, password, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignupRequestDTO {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append("*").append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

