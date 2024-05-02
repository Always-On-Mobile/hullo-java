

# GenericError

**Provides information about the error that occurred when calling an operation. The code can be one of the following:** | Status           | Code        | Reason                                                                                                                                                     | | ---------------- | ------------| -----------------------------------------------------------------------------------------------------------------------------------------------------------| | 500              | SE001       | HTTP 500 Internal Server Error                                                                                                                             | | 500              | SE002       | HTTP 500 Internal Server Error - Configuration Error                                                                                                       | | 500              | SE003       | HTTP 500 Internal Server Error - External System Error                                                                                                     | | 400              | BR001       | JSON request invalid, it must contain %s in a valid JSON format                                                                                            | | 400              | BR002       | The '%s' parameter must be provided                                                                                                                        | | 400              | BR003       | The request body was not valid                                                                                                                             | | 400              | BR004       | The '%s' parameter must be in the ISO-8601 extended offset date-time format                                                                                | | 400              | BR012       | The account does not have enough credit to send the requested message. Estimated credit required: %s Credit available: %s                                  | | 400              | BR013       | The '%s' parameter must be at least %s seconds or more in the future                                                                                       | | 400              | BR016       | The '%s' parameter must be between %s and %s characters                                                                                                    | | 400              | BR025       | The '%s' parameter must contain a valid value                                                                                                              | | 400              | BR027       | Member not opted in                                                                                                                                        | | 400              | BR039       | Member opted out                                                                                                                                           | | 400              | BR044       | At least one of the specified parameters '%s' must be provided                                                                                             | | 400              | BR049       | %s is a mandatory attribute and must be provided                                                                                                           | | 401              | UA001       | Access denied: check API key                                                                                                                               | | 401              | UA002       | Access denied: '%s'                                                                                                                                        | | 401              | UA005       | Account disabled                                                                                                                                           | | 403              | FB001       | Access denied                                                                                                                                              | | 404              | NF001       | %s not found                                                                                                                                               | | 429              | TR001       | Too Many Requests                                                                                                                                          | 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** |  |  [optional] |
|**text** | **String** |  |  [optional] |


