package br.com.economiaazul.exceptions;

public class EnderecoValidation extends EnderecoException {

    public EnderecoValidation(String message) {
        super(message);
    }

    public EnderecoValidation(String message, Throwable cause) {
        super(message, cause);
    }
}