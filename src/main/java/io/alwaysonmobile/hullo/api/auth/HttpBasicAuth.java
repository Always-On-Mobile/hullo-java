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


package io.alwaysonmobile.hullo.api.auth;

import io.alwaysonmobile.hullo.api.Pair;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-01T16:22:13.989+01:00[Europe/London]")
public class HttpBasicAuth implements Authentication {
  private String username;
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams) {
    if (username == null && password == null) {
      return;
    }
    String str = (username == null ? "" : username) + ":" + (password == null ? "" : password);
    headerParams.put("Authorization", "Basic " + Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8)));
  }
}
