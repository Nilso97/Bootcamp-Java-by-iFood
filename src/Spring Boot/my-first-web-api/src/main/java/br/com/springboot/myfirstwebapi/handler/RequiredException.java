package br.com.springboot.myfirstwebapi.handler;

public class RequiredException extends BusinessException {

    public RequiredException(String message) {
        super("O campo %s é obrigatório!", message);
    }
    
}
