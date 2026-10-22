package com.example.claims.adapter.in.web.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProblemDetailDTO
 */

@JsonTypeName("ProblemDetail")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public class ProblemDetailDTO {

  private URI type;

  private String title;

  private Integer status;

  private String detail;

  private Optional<String> instance = Optional.empty();

  public ProblemDetailDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProblemDetailDTO(URI type, String title, Integer status, String detail) {
    this.type = type;
    this.title = title;
    this.status = status;
    this.detail = detail;
  }

  public ProblemDetailDTO type(URI type) {
    this.type = type;
    return this;
  }

  /**
   * A URI reference that identifies the problem type
   * @return type
   */
  @NotNull @Valid 
  @Schema(name = "type", example = "https://api.demo-app.com/errors/validation-error", description = "A URI reference that identifies the problem type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public URI getType() {
    return type;
  }

  public void setType(URI type) {
    this.type = type;
  }

  public ProblemDetailDTO title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A short, human-readable summary of the problem type
   * @return title
   */
  @NotNull 
  @Schema(name = "title", example = "Validation Error", description = "A short, human-readable summary of the problem type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProblemDetailDTO status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The HTTP status code
   * @return status
   */
  @NotNull 
  @Schema(name = "status", example = "400", description = "The HTTP status code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ProblemDetailDTO detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * A human-readable explanation specific to this occurrence
   * @return detail
   */
  @NotNull 
  @Schema(name = "detail", example = "User ID is required", description = "A human-readable explanation specific to this occurrence", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ProblemDetailDTO instance(String instance) {
    this.instance = Optional.ofNullable(instance);
    return this;
  }

  /**
   * A URI reference that identifies the specific occurrence
   * @return instance
   */
  
  @Schema(name = "instance", example = "/api/claims", description = "A URI reference that identifies the specific occurrence", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instance")
  public Optional<String> getInstance() {
    return instance;
  }

  public void setInstance(Optional<String> instance) {
    this.instance = instance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemDetailDTO problemDetail = (ProblemDetailDTO) o;
    return Objects.equals(this.type, problemDetail.type) &&
        Objects.equals(this.title, problemDetail.title) &&
        Objects.equals(this.status, problemDetail.status) &&
        Objects.equals(this.detail, problemDetail.detail) &&
        Objects.equals(this.instance, problemDetail.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail, instance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemDetailDTO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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

