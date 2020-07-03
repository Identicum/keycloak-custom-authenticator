# keycloak-custom-authenticator
Custom Authenticator implementation to be used as a reference. 
This sample sends a custom error message when the user is locked.

# Deployment
```shell script
mvn clean package
cp target/*.jar $KEYCLOAK_HOME/standalone/deployments/
```

# Keycloak Configuration

1. Go to Authentication menu
2. Create o edit a custom flow
3. Add execution
4. Pick up from the list the Custom Authenticator