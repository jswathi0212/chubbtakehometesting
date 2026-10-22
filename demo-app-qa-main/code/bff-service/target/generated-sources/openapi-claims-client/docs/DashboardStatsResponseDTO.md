

# DashboardStatsResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalUsers** | **Integer** | Total number of users in the system |  |
|**totalClaims** | **Integer** | Total number of claims in the system |  |
|**claimsByStatus** | **Map&lt;String, Integer&gt;** | Count of claims grouped by status |  |
|**cacheHit** | **Boolean** | Whether data was retrieved from Redis cache (true) or database (false) |  |
|**queryTimeMs** | **Integer** | Time taken to fetch data in milliseconds (for training visibility) |  |



