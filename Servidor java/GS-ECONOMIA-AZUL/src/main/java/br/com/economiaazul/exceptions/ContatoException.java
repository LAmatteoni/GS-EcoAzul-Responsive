package br.com.economiaazul.exceptions;

public class ContatoException extends Exception {

	 public ContatoException(String message) {
	        super(message);
	    }

	    public ContatoException(String message, Throwable cause) {
	        super(message, cause);
	    }
}
