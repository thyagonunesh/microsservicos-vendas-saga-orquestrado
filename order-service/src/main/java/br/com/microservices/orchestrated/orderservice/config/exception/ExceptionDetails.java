package br.com.microservices.orchestrated.orderservice.config.exception;

import java.io.Serializable;

public record ExceptionDetails(Integer status, String message) implements Serializable {
}
