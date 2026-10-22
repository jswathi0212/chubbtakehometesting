# DashboardApi

All URIs are relative to *http://localhost:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**flushDashboardCache**](DashboardApi.md#flushDashboardCache) | **POST** /api/admin/dashboard/flush-cache | Flush dashboard statistics cache |
| [**getDashboardStats**](DashboardApi.md#getDashboardStats) | **GET** /api/admin/dashboard/stats | Get dashboard statistics |


<a id="flushDashboardCache"></a>
# **flushDashboardCache**
> flushDashboardCache()

Flush dashboard statistics cache

Manually evicts the dashboard statistics cache. Requires ADMIN role.

### Example
```java
// Import classes:
import com.example.bff.adapter.out.claims.ApiClient;
import com.example.bff.adapter.out.claims.ApiException;
import com.example.bff.adapter.out.claims.Configuration;
import com.example.bff.adapter.out.claims.auth.*;
import com.example.bff.adapter.out.claims.models.*;
import com.example.bff.adapter.out.claims.generated.DashboardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DashboardApi apiInstance = new DashboardApi(defaultClient);
    try {
      apiInstance.flushDashboardCache();
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardApi#flushDashboardCache");
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Cache flushed successfully |  -  |
| **401** | Missing or invalid bearer token |  -  |
| **403** | Forbidden - requires ADMIN role |  -  |

<a id="getDashboardStats"></a>
# **getDashboardStats**
> DashboardStatsResponseDTO getDashboardStats(bypassCache)

Get dashboard statistics

Returns aggregated statistics including total users, total claims, and claims grouped by status. Requires ADMIN role. Supports Redis caching with bypass option.

### Example
```java
// Import classes:
import com.example.bff.adapter.out.claims.ApiClient;
import com.example.bff.adapter.out.claims.ApiException;
import com.example.bff.adapter.out.claims.Configuration;
import com.example.bff.adapter.out.claims.auth.*;
import com.example.bff.adapter.out.claims.models.*;
import com.example.bff.adapter.out.claims.generated.DashboardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DashboardApi apiInstance = new DashboardApi(defaultClient);
    Boolean bypassCache = false; // Boolean | If true, bypass Redis cache and query database directly
    try {
      DashboardStatsResponseDTO result = apiInstance.getDashboardStats(bypassCache);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardApi#getDashboardStats");
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
| **bypassCache** | **Boolean**| If true, bypass Redis cache and query database directly | [optional] [default to false] |

### Return type

[**DashboardStatsResponseDTO**](DashboardStatsResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dashboard statistics |  -  |
| **401** | Missing or invalid bearer token |  -  |
| **403** | Forbidden - requires ADMIN role |  -  |

