package br.com.economiaazul.exceptions;

public class EnderecoDatabase extends EnderecoException {
    
    public EnderecoDatabase(String message) {
        super(message);
    }

    public EnderecoDatabase(String message, Throwable cause) {
        super(message, cause);
    }
}