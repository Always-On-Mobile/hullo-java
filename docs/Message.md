

# Message

A record containing information about a message

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique ID for the message once submitted |  [optional] |
|**issueDate** | **OffsetDateTime** | The date the message was will be / was issued. When sending a message this date should be at least 2 minutes in the future |  [optional] |
|**phoneNumber** | **String** | The phone number the message was sent to / received from |  |
|**messageText** | **String** | The message text to send / was sent to the member |  |
|**fullName** | **String** | The full name of the member the message was sent to (read only) |  [optional] |
|**inbound** | **Boolean** | If the message was received from a members phone then this will be marked as true (read only) |  [optional] |
|**deliveryStatus** | **MessageStatus** |  |  [optional] |



