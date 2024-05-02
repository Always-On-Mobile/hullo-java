/*
 * Always On Mobile - hullo API
 * Welcome to the hullo API.    With this API you can perform operations on your hullo account programmatically that you can call using the hullo console. The operations currently available include:    * Add / Update a member * Get the details of a member * Get the messages sent / received from a member * Send a message to a member  The hullo API is an easy to use RESTful API that can be called by any modern programming language that  supports HTTP calls, and also has out of the box support for several programming languages including:   * Java * Javascript    In order to use the API you will first need to generate an API key using the hullo console application, assigning it the the relevant scopes required for the operations you wish to call. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.alwaysonmobile.hullo.api.client;

import com.fasterxml.jackson.core.type.TypeReference;

import io.alwaysonmobile.hullo.api.ApiException;
import io.alwaysonmobile.hullo.api.ApiClient;
import io.alwaysonmobile.hullo.api.Configuration;
import io.alwaysonmobile.hullo.api.client.*;
import io.alwaysonmobile.hullo.api.Pair;

import io.alwaysonmobile.hullo.api.client.GenericError;
import io.alwaysonmobile.hullo.api.client.Message;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-01T16:22:13.989+01:00[Europe/London]")
public class MessagesApi {


  private ApiClient apiClient;

  public MessagesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessagesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Send a message
   * Allows messages to be sent to members. Members must be fully opted-in in order to be sent a message, otherwise this operation will reject the call. If a message is longer than 160 characters - using the GSM character set (https://en.wikipedia.org/wiki/GSM_03.38) - then the message will be split into multiple 140 character parts.  If any characters fall outside of the supported GSM character set then the message will be converted to UTF-16 (https://en.wikipedia.org/wiki/UTF-16) and split into multiple 70 character parts. The parts will be reconstructed and displayed to the member as a single message on their handset. 
   * @param message A JSON object containing message information (required)
   * @return Message
   * @throws ApiException if fails to make API call
   */
  public Message createMessage(Message message) throws ApiException {
    return this.createMessage(message, Collections.emptyMap());
  }


  /**
   * Send a message
   * Allows messages to be sent to members. Members must be fully opted-in in order to be sent a message, otherwise this operation will reject the call. If a message is longer than 160 characters - using the GSM character set (https://en.wikipedia.org/wiki/GSM_03.38) - then the message will be split into multiple 140 character parts.  If any characters fall outside of the supported GSM character set then the message will be converted to UTF-16 (https://en.wikipedia.org/wiki/UTF-16) and split into multiple 70 character parts. The parts will be reconstructed and displayed to the member as a single message on their handset. 
   * @param message A JSON object containing message information (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Message
   * @throws ApiException if fails to make API call
   */
  public Message createMessage(Message message, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = message;
    
    // verify the required parameter 'message' is set
    if (message == null) {
      throw new ApiException(400, "Missing the required parameter 'message' when calling createMessage");
    }
    
    // create path and map variables
    String localVarPath = "/endpoints/messages";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    TypeReference<Message> localVarReturnType = new TypeReference<Message>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Gets the messages for a specific subscriber
   * Retrieves any messages sent / received for a specific subscriber. The messages will be ordered by date  descending, so the newest messages will appear at the top.
   * @param phoneNumber The phone number of the member (required)
   * @param limit  (optional, default to 50)
   * @return List&lt;Message&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Message> getMessages(String phoneNumber, Integer limit) throws ApiException {
    return this.getMessages(phoneNumber, limit, Collections.emptyMap());
  }


  /**
   * Gets the messages for a specific subscriber
   * Retrieves any messages sent / received for a specific subscriber. The messages will be ordered by date  descending, so the newest messages will appear at the top.
   * @param phoneNumber The phone number of the member (required)
   * @param limit  (optional, default to 50)
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;Message&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Message> getMessages(String phoneNumber, Integer limit, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling getMessages");
    }
    
    // create path and map variables
    String localVarPath = "/endpoints/messages/{phoneNumber}"
      .replaceAll("\\{" + "phoneNumber" + "\\}", apiClient.escapeString(phoneNumber.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    TypeReference<List<Message>> localVarReturnType = new TypeReference<List<Message>>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

}
