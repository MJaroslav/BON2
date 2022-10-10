package io.github.mjaroslav.bon2.cli;

import io.github.mjaroslav.bon2.data.IErrorHandler;

public class CLIErrorHandler implements IErrorHandler {

    @Override
    public boolean handleError(String message, boolean warning) {
        System.err.println(message);
        return true;
    }
}
