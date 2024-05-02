# AccountApi

All URIs are relative to *https://app.hullo.me/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccount**](AccountApi.md#getAccount) | **GET** /endpoints/account | Get details about the account |



## getAccount

> Account getAccount()

Get details about the account

Allows the caller to get information about the account being used to access the API. Currently this allows access to the name given when creating the API key in the hullo application. This can be useful for allowing a client application to verify the key being used.

### Example

```java
// Import classes:
import io.alwaysonmobile.hullo.api.ApiClient;
import io.alwaysonmobile.hullo.api.ApiException;
import io.alwaysonmobile.hullo.api.Configuration;
import io.alwaysonmobile.hullo.api.auth.*;
import io.alwaysonmobile.hullo.api.models.*;
import io.alwaysonmobile.hullo.api.client.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.hullo.me/api");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        AccountApi apiInstance = new AccountApi(defaultClient);
        try {
            Account result = apiInstance.getAccount();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#getAccount");
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

[**Account**](Account.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | UNAUTHORIZED |  -  |

