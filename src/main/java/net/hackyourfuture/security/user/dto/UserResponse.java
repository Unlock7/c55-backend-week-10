package net.hackyourfuture.security.user.dto;

/**
 * Public representation of a user. Deliberately omits the password.
 */
public record UserResponse(String id, String username) {
}
