

# ClaimResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**claimId** | **UUID** | Unique claim identifier |  |
|**userId** | **UUID** | ID of the user who submitted the claim |  |
|**incidentDate** | **LocalDate** | Date of the incident |  |
|**incidentLocation** | **String** | Location where the incident occurred |  |
|**description** | **String** | Description of the incident |  |
|**claimAmount** | **Double** | Claimed amount in USD |  |
|**status** | **ClaimStatusDTO** |  |  |
|**createdAt** | **OffsetDateTime** | Claim creation timestamp |  |
|**updatedAt** | **OffsetDateTime** | Last update timestamp |  |



