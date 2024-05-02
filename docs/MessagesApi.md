# MessagesApi

All URIs are relative to *https://app.hullo.me/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMessage**](MessagesApi.md#createMessage) | **POST** /endpoints/messages | Send a message |
| [**getMessages**](MessagesApi.md#getMessages) | **GET** /endpoints/messages/{phoneNumber} | Gets the messages for a specific subscriber |



## createMessage

> Message createMessage(message)

Send a message

Allows messages to be sent to members. Members must be fully opted-in in order to be sent a message, otherwise this operation will reject the call. If a message is longer than 160 characters - using the GSM character set (https://en.wikipedia.org/wiki/GSM_03.38) - then the message will be split into multiple 140 character parts.  If any characters fall outside of the supported GSM character set then the message will be converted to UTF-16 (https://en.wikipedia.org/wiki/UTF-16) and split into multiple 70 character parts. The parts will be reconstructed and displayed to the member as a single message on their handset. 

### Example

```java
// Import classes:
import io.alwaysonmobile.hullo.api.ApiClient;
import io.alwaysonmobile.hullo.api.ApiException;
import io.alwaysonmobile.hullo.api.Configuration;
import io.alwaysonmobile.hullo.api.auth.*;
import io.alwaysonmobile.hullo.api.models.*;
import io.alwaysonmobile.hullo.api.client.MessagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.hullo.me/api");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        Message message = new Message(); // Message | A JSON object containing message information
        try {
            Message result = apiInstance.createMessage(message);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#createMessage");
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
| **message** | [**Message**](Message.md)| A JSON object containing message information | |

### Return type

[**Message**](Message.md)

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


## getMessages

> List&lt;Message&gt; getMessages(phoneNumber, limit)

Gets the messages for a specific subscriber

Retrieves any messages sent / received for a specific subscriber. The messages will be ordered by date  descending, so the newest messages will appear at the top.

### Example

```java
// Import classes:
import io.alwaysonmobile.hullo.api.ApiClient;
import io.alwaysonmobile.hullo.api.ApiException;
import io.alwaysonmobile.hullo.api.Configuration;
import io.alwaysonmobile.hullo.api.auth.*;
import io.alwaysonmobile.hullo.api.models.*;
import io.alwaysonmobile.hullo.api.client.MessagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.hullo.me/api");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        String phoneNumber = "phoneNumber_example"; // String | The phone number of the member
        Integer limit = 50; // Integer | 
        try {
            List<Message> result = apiInstance.getMessages(phoneNumber, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#getMessages");
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
| **phoneNumber** | **String**| The phone number of the member | |
| **limit** | **Integer**|  | [optional] [default to 50] |

### Return type

[**List&lt;Message&gt;**](Message.md)

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
| **404** | NOT_FOUND |  -  |

