package com.identicum.keycloak;

import com.google.auto.service.AutoService;
import org.keycloak.Config;
import org.keycloak.authentication.Authenticator;
import org.keycloak.authentication.AuthenticatorFactory;
import org.keycloak.models.AuthenticationExecutionModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.provider.ProviderConfigProperty;

import java.util.Arrays;
import java.util.List;

@AutoService(AuthenticatorFactory.class)
public class CustomAuthenticatorFactory implements AuthenticatorFactory {

	public static final String PROVIDER_ID = "custom-authenticator";
	private static final CustomAuthenticator SINGLETON = new CustomAuthenticator();

	@Override
	public String getId() {
		return PROVIDER_ID;
	}

	@Override
	public String getDisplayType() {
		return "Custom Authenticator";
	}

	@Override
	public String getReferenceCategory() {
		return null;
	}

	@Override
	public boolean isConfigurable() {
		return false;
	}

	@Override
	public AuthenticationExecutionModel.Requirement[] getRequirementChoices() {
		return Arrays.asList(AuthenticationExecutionModel.Requirement.REQUIRED).toArray(new AuthenticationExecutionModel.Requirement[0]);
	}

	@Override
	public boolean isUserSetupAllowed() {
		return false;
	}

	@Override
	public String getHelpText() {
		return null;
	}

	@Override
	public List<ProviderConfigProperty> getConfigProperties() {
		return null;
	}

	@Override
	public void init(Config.Scope scope) {

	}

	@Override
	public void postInit(KeycloakSessionFactory keycloakSessionFactory) {

	}

	@Override
	public void close() {

	}

	@Override
	public Authenticator create(KeycloakSession session) {
		return SINGLETON;
	}
}
