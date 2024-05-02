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

import io.alwaysonmobile.hullo.api.client.Attribute;
import io.alwaysonmobile.hullo.api.client.GenericError;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-01T16:22:13.989+01:00[Europe/London]")
public class AttributesApi {


  private ApiClient apiClient;

  public AttributesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AttributesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Gets the list of attributes
   * Retrieves the list of attributes configured against a hullo account. Any configured attributes can be added to a member record.
   * @return List&lt;Attribute&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Attribute> getAttributes() throws ApiException {
    return this.getAttributes(Collections.emptyMap());
  }


  /**
   * Gets the list of attributes
   * Retrieves the list of attributes configured against a hullo account. Any configured attributes can be added to a member record.
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;Attribute&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Attribute> getAttributes(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/endpoints/attributes";

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    TypeReference<List<Attribute>> localVarReturnType = new TypeReference<List<Attribute>>() {};
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
