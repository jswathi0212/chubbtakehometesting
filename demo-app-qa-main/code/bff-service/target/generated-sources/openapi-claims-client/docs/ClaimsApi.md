# ClaimsApi

All URIs are relative to *http://localhost:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createClaim**](ClaimsApi.md#createClaim) | **POST** /api/claims | Create a new insurance claim |
| [**getClaim**](ClaimsApi.md#getClaim) | **GET** /api/claims/{claimId} | Get claim details |
| [**listClaims**](ClaimsApi.md#listClaims) | **GET** /api/claims | List all claims for authenticated user |
| [**updateClaim**](ClaimsApi.md#updateClaim) | **PATCH** /api/claims/{claimId} | Update a claim |


<a id="createClaim"></a>
# **createClaim**
> ClaimResponseDTO createClaim(createClaimRequestDTO)

Create a new insurance claim

Creates a new insurance claim for the authenticated user. User ID is extracted from JWT token.

### Example
```java
// Import classes:
import com.example.bff.adapter.out.claims.ApiClient;
import com.example.bff.adapter.out.claims.ApiException;
import com.example.bff.adapter.out.claims.Configuration;
import com.example.bff.adapter.out.claims.auth.*;
import com.example.bff.adapter.out.claims.models.*;
import com.example.bff.adapter.out.claims.generated.ClaimsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ClaimsApi apiInstance = new ClaimsApi(defaultClient);
    CreateClaimRequestDTO createClaimRequestDTO = new CreateClaimRequestDTO(); // CreateClaimRequestDTO | 
    try {
      ClaimResponseDTO result = apiInstance.createClaim(createClaimRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClaimsApi#createClaim");
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
| **createClaimRequestDTO** | [**CreateClaimRequestDTO**](CreateClaimRequestDTO.md)|  | |

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
| **201** | Claim created successfully |  -  |
| **400** | Validation error |  -  |
| **401** | Missing or invalid bearer token |  -  |
| **403** | Forbidden - userId mismatch or insufficient permissions |  -  |

<a id="getClaim"></a>
# **getClaim**
> ClaimResponseDTO getClaim(claimId)

Get claim details

Returns the details of a specific claim by its ID.

### Example
```java
// Import classes:
import com.example.bff.adapter.out.claims.ApiClient;
import com.example.bff.adapter.out.claims.ApiException;
import com.example.bff.adapter.out.claims.Configuration;
import com.example.bff.adapter.out.claims.auth.*;
import com.example.bff.adapter.out.claims.models.*;
import com.example.bff.adapter.out.claims.generated.ClaimsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ClaimsApi apiInstance = new ClaimsApi(defaultClient);
    UUID claimId = UUID.fromString("660e8400-e29b-41d4-a716-446655440001"); // UUID | The unique identifier of the claim
    try {
      ClaimResponseDTO result = apiInstance.getClaim(claimId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClaimsApi#getClaim");
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

### Return type

[**ClaimResponseDTO**](ClaimResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Claim details |  -  |
| **401** | Missing or invalid bearer token |  -  |
| **403** | Forbidden - claim belongs to different user |  -  |
| **404** | Claim not found |  -  |

<a id="listClaims"></a>
# **listClaims**
> List&lt;ClaimSummaryResponseDTO&gt; listClaims()

List all claims for authenticated user

Returns all claims belonging to the authenticated user (extracted from JWT token), sorted by creation date (newest first).

### Example
```java
// Import classes:
import com.example.bff.adapter.out.claims.ApiClient;
import com.example.bff.adapter.out.claims.ApiException;
import com.example.bff.adapter.out.claims.Configuration;
import com.example.bff.adapter.out.claims.auth.*;
import com.example.bff.adapter.out.claims.models.*;
import com.example.bff.adapter.out.claims.generated.ClaimsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ClaimsApi apiInstance = new ClaimsApi(defaultClient);
    try {
      List<ClaimSummaryResponseDTO> result = apiInstance.listClaims();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClaimsApi#listClaims");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ClaimSummaryResponseDTO&gt;**](ClaimSummaryResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of claims |  -  |
| **401** | Missing or invalid bearer token |  -  |

<a id="updateClaim"></a>
# **updateClaim**
> ClaimResponseDTO updateClaim(claimId, updateClaimRequestDTO)

Update a claim

Updates the status and/or description of a specific claim.

### Example
```java
// Import classes:
import com.example.bff.adapter.out.claims.ApiClient;
import com.example.bff.adapter.out.claims.ApiException;
import com.example.bff.adapter.out.claims.Configuration;
import com.example.bff.adapter.out.claims.auth.*;
import com.example.bff.adapter.out.claims.models.*;
import com.example.bff.adapter.out.claims.generated.ClaimsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ClaimsApi apiInstance = new ClaimsApi(defaultClient);
    UUID claimId = UUID.fromString("660e8400-e29b-41d4-a716-446655440001"); // UUID | The unique identifier of the claim
    UpdateClaimRequestDTO updateClaimRequestDTO = new UpdateClaimRequestDTO(); // UpdateClaimRequestDTO | 
    try {
      ClaimResponseDTO result = apiInstance.updateClaim(claimId, updateClaimRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClaimsApi#updateClaim");
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
| **updateClaimRequestDTO** | [**UpdateClaimRequestDTO**](UpdateClaimRequestDTO.md)|  | |

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
| **200** | Claim updated successfully |  -  |
| **400** | Validation error (e.g., invalid status transition) |  -  |
| **401** | Missing or invalid bearer token |  -  |
| **404** | Claim not found |  -  |

