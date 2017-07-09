# wildfly-swarm-swagger-demo

WildFly Swarm Swagger Demo

## Build & Run

``` console
./mvnw clean package
java -jar target/wildfly-swarm-swagger-demo-swarm.jar
```

## Access API

``` console
curl localhost:8080/time/now
```

### Response

``` json
{
  "value": "The time is 2017-07-09T11:59:16.037+09:00"
}
```

## Access Swagger.json

``` console
curl -s localhost:8080/swagger.json | jq .
```

### Response

``` json
{
  "swagger": "2.0",
  "info": {},
  "basePath": "/",
  "tags": [
    {
      "name": "time"
    }
  ],
  "paths": {
    "/time/now": {
      "get": {
        "tags": [
          "time"
        ],
        "summary": "Get the current time",
        "description": "Returns the time as a string",
        "operationId": "get",
        "produces": [
          "application/json"
        ],
        "parameters": [],
        "responses": {
          "200": {
            "description": "successful operation",
            "schema": {
              "type": "string"
            }
          }
        }
      }
    }
  }
}
``` 