# AdminClaimsApi

All URIs are relative to *http://localhost:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAllClaims**](AdminClaimsApi.md#listAllClaims) | **GET** /api/admin/claims | List all claims with optional filtering (admin only) |
| [**updateClaimStatus**](AdminClaimsApi.md#updateClaimStatus) | **PATCH** /api/admin/claims/{claimId}/status | Update claim status (admin only) |


<a id="listAllClaims"></a>
# **listAllClaims**
> List&lt;AdminClaimResponseDTO&gt; listAllClaims(status, userId)

List all claims with optional filtering (admin only)

Returns all claims in the system. Supports filtering by status and userId. Requires ADMIN role.

### Example
```java
// Import classes:
import com.example.bff.adapter.out.claims.ApiClient;
import com.example.bff.adapter.out.claims.ApiException;
import com.example.bff.adapter.out.claims.Configuration;
import com.example.bff.adapter.out.claims.auth.*;
import com.example.bff.adapter.out.claims.models.*;
import com.example.bff.adapter.out.claims.generated.AdminClaimsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdminClaimsApi apiInstance = new AdminClaimsApi(defaultClient);
    ClaimStatusDTO status = ClaimStatusDTO.fromValue("SUBMITTED"); // ClaimStatusDTO | Filter claims by status
    UUID userId = UUID.fromString("550e8400-e29b-41d4-a716-446655440000"); // UUID | Filter claims by user ID
    try {
      List<AdminClaimResponseDTO> result = apiInstance.listAllClaims(status, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminClaimsApi#listAllClaims");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **status** | [**ClaimStatusDTO**](.md)| Filter claims by status | [optional] [enum: SUBMITTED, UNDER_REVIEW, APPROVED, REJECTED, CLOSED] |
| **userId** | **UUID**| Filter claims by user ID | [optional] |

### Return type

[**List&lt;AdminClaimResponseDTO&gt;**](AdminClaimResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of claims retrieved successfully |  -  |
| **401** | Missing or invalid bearer token |  -  |
| **403** | Forbidden - requires ADMIN role |  -  |

<a id="updateClaimStatus"></a>
# **updateClaimStatus**
> ClaimResponseDTO updateClaimStatus(claimId, updateClaimStatusRequestDTO)

Update claim status (admin only)

Updates the status of a specific claim. Requires ADMIN role. Enforces valid status transitions.

### Example
```java
// Import classes:
import com.example.bff.adapter.out.claims.ApiClient;
import com.example.bff.adapter.out.claims.ApiException;
import com.example.bff.adapter.out.claims.Configuration;
import com.example.bff.adapter.out.claims.auth.*;
import com.example.bff.adapter.out.claims.models.*;
import com.example.bff.adapter.out.claims.generated.AdminClaimsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdminClaimsApi apiInstance = new AdminClaimsApi(defaultClient);
    UUID claimId = UUID.fromString("660e8400-e29b-41d4-a716-446655440001"); // UUID | The unique identifier of the claim
    UpdateClaimStatusRequestDTO updateClaimStatusRequestDTO = new UpdateClaimStatusRequestDTO(); // UpdateClaimStatusRequestDTO | 
    try {
      ClaimResponseDTO result = apiInstance.updateClaimStatus(claimId, updateClaimStatusRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminClaimsApi#updateClaimStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **claimId** | **UUID**| The unique identifier of the claim | |
| **updateClaimStatusRequestDTO** | [**UpdateClaimStatusRequestDTO**](UpdateClaimStatusRequestDTO.md)|  | |

### Return type

[**ClaimResponseDTO**](ClaimResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Claim status updated successfully |  -  |
| **400** | Bad Request - invalid status transition |  -  |
| **401** | Missing or invalid bearer token |  -  |
| **403** | Forbidden - requires ADMIN role |  -  |
| **404** | Claim not found |  -  |

