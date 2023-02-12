package br.com.scheronlini.APISpringBootJPA.services.exceptions;

public class DataBaseException extends RuntimeException{

    public DataBaseException(String msg){
        super(msg);
    }
}

