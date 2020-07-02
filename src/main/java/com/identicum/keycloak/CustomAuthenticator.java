package com.identicum.keycloak;

import org.keycloak.authentication.authenticators.browser.UsernamePasswordForm;
import org.keycloak.services.messages.Messages;

public class CustomAuthenticator extends UsernamePasswordForm {

	@Override
	protected String tempDisabledError() {
		return Messages.ACCOUNT_TEMPORARILY_DISABLED;
	}
}
