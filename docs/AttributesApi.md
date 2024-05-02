# AttributesApi

All URIs are relative to *https://app.hullo.me/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAttributes**](AttributesApi.md#getAttributes) | **GET** /endpoints/attributes | Gets the list of attributes |



## getAttributes

> List&lt;Attribute&gt; getAttributes()

Gets the list of attributes

Retrieves the list of attributes configured against a hullo account. Any configured attributes can be added to a member record.

### Example

```java
// Import classes:
import io.alwaysonmobile.hullo.api.ApiClient;
import io.alwaysonmobile.hullo.api.ApiException;
import io.alwaysonmobile.hullo.api.Configuration;
import io.alwaysonmobile.hullo.api.auth.*;
import io.alwaysonmobile.hullo.api.models.*;
import io.alwaysonmobile.hullo.api.client.AttributesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.hullo.me/api");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        AttributesApi apiInstance = new AttributesApi(defaultClient);
        try {
            List<Attribute> result = apiInstance.getAttributes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttributesApi#getAttributes");
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

[**List&lt;Attribute&gt;**](Attribute.md)

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

