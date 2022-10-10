package io.github.mjaroslav.bon2.data;

public interface IErrorHandler {

    boolean handleError(String message, boolean warning);
}
