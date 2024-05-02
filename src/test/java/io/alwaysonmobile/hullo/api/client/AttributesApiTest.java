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

import io.alwaysonmobile.hullo.api.ApiException;
import io.alwaysonmobile.hullo.api.client.Attribute;
import io.alwaysonmobile.hullo.api.client.GenericError;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AttributesApi
 */
@Ignore
public class AttributesApiTest {

    private final AttributesApi api = new AttributesApi();

    /**
     * Gets the list of attributes
     *
     * Retrieves the list of attributes configured against a hullo account. Any configured attributes can be added to a member record.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttributesTest() throws ApiException {
        List<Attribute> response = api.getAttributes();

        // TODO: test validations
    }
}