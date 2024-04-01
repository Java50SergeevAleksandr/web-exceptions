package telran.probes.exceptions;

@SuppressWarnings("serial")
public class AccountNotFoundException extends NotFoundException {

	public AccountNotFoundException(String message) {
		super(String.format("Account %s not found", message));
	}

}
