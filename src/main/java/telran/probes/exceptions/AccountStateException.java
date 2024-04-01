package telran.probes.exceptions;

@SuppressWarnings("serial")
public class AccountStateException extends IllegalStateException {
	public AccountStateException(String email) {
		super(String.format("Account %s already exists", email));
	}
}
