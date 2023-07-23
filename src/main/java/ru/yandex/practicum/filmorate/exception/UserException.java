package ru.yandex.practicum.filmorate.exception;

public class UserException extends RuntimeException {

    public UserException() {
        super();
    }

    public UserException(final String message) {
        super(message);
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }

}