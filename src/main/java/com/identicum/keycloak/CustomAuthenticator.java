package com.identicum.keycloak;

import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.Response;
import org.keycloak.authentication.AuthenticationFlowContext;
import org.keycloak.authentication.authenticators.browser.UsernamePasswordForm;
import org.keycloak.forms.login.LoginFormsProvider;
import org.keycloak.forms.login.MessageType;

public class CustomAuthenticator extends UsernamePasswordForm {
	@Override
	protected Response challenge(AuthenticationFlowContext context, MultivaluedMap<String, String> formData) {
		LoginFormsProvider forms = context.form();
		if (!formData.isEmpty()) forms.setFormData(formData);
		forms.setMessage(MessageType.INFO, "Identicum Custom Authenticator SPI");
		return forms.createLoginUsernamePassword();
	}
}
