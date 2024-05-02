# MembersApi

All URIs are relative to *https://app.hullo.me/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMember**](MembersApi.md#getMember) | **GET** /endpoints/members/{phoneNumber} | Gets the details for a member |
| [**optOutMember**](MembersApi.md#optOutMember) | **POST** /endpoints/members/{phoneNumber}/optout | Opts the member out from the hullo member store |
| [**upsertMember**](MembersApi.md#upsertMember) | **POST** /endpoints/members | Adds or updates a member |



## getMember

> Member getMember(phoneNumber)

Gets the details for a member

Retrieves the details hullo stores about a specific member. The record will contain any attribute data added  using either the hullo API or the hullo application along with the members phone number and full name. 

### Example

```java
// Import classes:
import io.alwaysonmobile.hullo.api.ApiClient;
import io.alwaysonmobile.hullo.api.ApiException;
import io.alwaysonmobile.hullo.api.Configuration;
import io.alwaysonmobile.hullo.api.auth.*;
import io.alwaysonmobile.hullo.api.models.*;
import io.alwaysonmobile.hullo.api.client.MembersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.hullo.me/api");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        MembersApi apiInstance = new MembersApi(defaultClient);
        String phoneNumber = "phoneNumber_example"; // String | The phone number of the subscriber
        try {
            Member result = apiInstance.getMember(phoneNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MembersApi#getMember");
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
| **phoneNumber** | **String**| The phone number of the subscriber | |

### Return type

[**Member**](Member.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | BAD_REQUEST |  -  |
| **401** | UNAUTHORIZED |  -  |
| **404** | NOT_FOUND |  -  |


## optOutMember

> optOutMember(phoneNumber)

Opts the member out from the hullo member store

Opts out the member from the hullo member store which results in their record being deleted. Any pending  messages will also be deleted for the member and the member will no longer be able to participate in \\ any  campaigns. 

### Example

```java
// Import classes:
import io.alwaysonmobile.hullo.api.ApiClient;
import io.alwaysonmobile.hullo.api.ApiException;
import io.alwaysonmobile.hullo.api.Configuration;
import io.alwaysonmobile.hullo.api.auth.*;
import io.alwaysonmobile.hullo.api.models.*;
import io.alwaysonmobile.hullo.api.client.MembersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.hullo.me/api");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        MembersApi apiInstance = new MembersApi(defaultClient);
        String phoneNumber = "phoneNumber_example"; // String | The phone number of the subscriber
        try {
            apiInstance.optOutMember(phoneNumber);
        } catch (ApiException e) {
            System.err.println("Exception when calling MembersApi#optOutMember");
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
| **phoneNumber** | **String**| The phone number of the subscriber | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | BAD_REQUEST |  -  |
| **401** | UNAUTHORIZED |  -  |
| **404** | NOT_FOUND |  -  |


## upsertMember

> Member upsertMember(member)

Adds or updates a member

Add or update the information hullo stores for a specific member. If the member doesn&#39;t already exist then    they will be added to the members store and an opt-in message will be sent to the number specified in order   to get confirmation that the number exists and wishes to receive messages. If the member responds with a   confirmation message (\&quot;yes\&quot;) then their member record will be updated to opted-in and they will then be able   to receive messages sent to them from any hullo campaign. If the member already exists then their record will  be updated to reflect any new / updated attribute data included in the call. If an attribute is specified but   no value is given or the value is null then that attribute will be deleted from the members record. 

### Example

```java
// Import classes:
import io.alwaysonmobile.hullo.api.ApiClient;
import io.alwaysonmobile.hullo.api.ApiException;
import io.alwaysonmobile.hullo.api.Configuration;
import io.alwaysonmobile.hullo.api.auth.*;
import io.alwaysonmobile.hullo.api.models.*;
import io.alwaysonmobile.hullo.api.client.MembersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.hullo.me/api");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        MembersApi apiInstance = new MembersApi(defaultClient);
        Member member = new Member(); // Member | A JSON object containing member information
        try {
            Member result = apiInstance.upsertMember(member);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MembersApi#upsertMember");
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
| **member** | [**Member**](Member.md)| A JSON object containing member information | |

### Return type

[**Member**](Member.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | BAD_REQUEST |  -  |
| **401** | UNAUTHORIZED |  -  |
| **404** | NOT_FOUND |  -  |

