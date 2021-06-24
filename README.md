### Accessing API using OAuth2

To access main api using OAuth2 an access-token is needed to be sent as part of the bearer token in authorization header.

Sample curl to fetch access-token:

`curl --request GET \
--url localhost:8081/token \
--header 'accept: application/json' \
-u $CLIENT_ID:$CLIENT_SECRET \
--header 'cache-control: no-cache' \
--header 'content-type: application/x-www-form-urlencoded' \ `

The resulting access-token will have an expiration date, so the token needs to be refreshed in order to continue using the API

The token gathered in the previous step must be used in authentication header as part of bearer token while using the API

Sample curl:
`curl --location --request GET 'localhost:8081/edge-tokens/123' \
--header 'partner-id: 12345' \
--header 'Authorization: Bearer $ACCESS_TOKEN' \`