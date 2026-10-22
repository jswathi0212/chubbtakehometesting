# UsersApi

All URIs are relative to *http://localhost:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUser**](UsersApi.md#createUser) | **POST** /api/users | Create a new user |
| [**getUser**](UsersApi.md#getUser) | **GET** /api/users/{userId} | Get user details |
| [**listAllUsers**](UsersApi.md#listAllUsers) | **GET** /api/users | List all users (Admin only) |


<a id="createUser"></a>
# **createUser**
> UserResponseDTO createUser(createUserRequestDTO)

Create a new user

Creates a new user in the Claims Service.

### Example
```java
// Import classes:
import com.example.bff.adapter.out.claims.ApiClient;
import com.example.bff.adapter.out.claims.ApiException;
import com.example.bff.adapter.out.claims.Configuration;
import com.example.bff.adapter.out.claims.auth.*;
import com.example.bff.adapter.out.claims.models.*;
import com.example.bff.adapter.out.claims.generated.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    CreateUserRequestDTO createUserRequestDTO = new CreateUserRequestDTO(); // CreateUserRequestDTO | 
    try {
      UserResponseDTO result = apiInstance.createUser(createUserRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createUser");
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
| **createUserRequestDTO** | [**CreateUserRequestDTO**](CreateUserRequestDTO.md)|  | |

### Return type

[**UserResponseDTO**](UserResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | User created successfully |  -  |
| **400** | Validation error |  -  |
| **401** | Missing or invalid bearer token |  -  |
| **409** | User with this email already exists |  -  |

<a id="getUser"></a>
# **getUser**
> UserResponseDTO getUser(userId)

Get user details

Returns the details of a user by their ID.

### Example
```java
// Import classes:
import com.example.bff.adapter.out.claims.ApiClient;
import com.example.bff.adapter.out.claims.ApiException;
import com.example.bff.adapter.out.claims.Configuration;
import com.example.bff.adapter.out.claims.auth.*;
import com.example.bff.adapter.out.claims.models.*;
import com.example.bff.adapter.out.claims.generated.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UUID userId = UUID.fromString("550e8400-e29b-41d4-a716-446655440000"); // UUID | The unique identifier of the user
    try {
      UserResponseDTO result = apiInstance.getUser(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUser");
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
| **userId** | **UUID**| The unique identifier of the user | |

### Return type

[**UserResponseDTO**](UserResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User details |  -  |
| **401** | Missing or invalid bearer token |  -  |
| **404** | User not found |  -  |

<a id="listAllUsers"></a>
# **listAllUsers**
> List&lt;UserResponseDTO&gt; listAllUsers()

List all users (Admin only)

Returns a list of all users in the system. Requires ADMIN role.

### Example
```java
// Import classes:
import com.example.bff.adapter.out.claims.ApiClient;
import com.example.bff.adapter.out.claims.ApiException;
import com.example.bff.adapter.out.claims.Configuration;
import com.example.bff.adapter.out.claims.auth.*;
import com.example.bff.adapter.out.claims.models.*;
import com.example.bff.adapter.out.claims.generated.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8081");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    try {
      List<UserResponseDTO> result = apiInstance.listAllUsers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listAllUsers");
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

[**List&lt;UserResponseDTO&gt;**](UserResponseDTO.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of users |  -  |
| **401** | Missing or invalid bearer token |  -  |
| **403** | Access denied - requires ADMIN role |  -  |

