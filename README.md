# keycloak-custom-authenticator
Custom Authenticator implementation to be used as a reference. 
This sample adds a custom informational message to the login form.

# Deployment
```shell script
mvn clean package
cp target/*.jar $KEYCLOAK_HOME/providers/
```

# Keycloak Configuration

1. Go to Authentication menu
2. Create o edit a custom flow
3. Add execution
4. Pick up from the list the Custom Authenticator