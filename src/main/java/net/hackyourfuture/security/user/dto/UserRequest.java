package net.hackyourfuture.security.user.dto;

/**
 * Incoming payload for user registration.
 */
public record UserRequest(String username, String password) {
}
