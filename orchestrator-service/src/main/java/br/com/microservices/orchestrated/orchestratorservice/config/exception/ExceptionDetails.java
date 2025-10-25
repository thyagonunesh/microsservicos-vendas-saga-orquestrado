package br.com.microservices.orchestrated.orchestratorservice.config.exception;

import java.io.Serializable;

public record ExceptionDetails(Integer status, String message) implements Serializable {
}
