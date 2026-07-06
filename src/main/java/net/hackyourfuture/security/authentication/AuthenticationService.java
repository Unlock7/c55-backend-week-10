package net.hackyourfuture.security.authentication;

import lombok.AllArgsConstructor;
import net.hackyourfuture.security.authentication.dto.LoginRequest;
import net.hackyourfuture.security.authentication.dto.LoginResponse;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthenticationService {

    public LoginResponse login(LoginRequest request) {
        throw new UnsupportedOperationException("TODO: implement login");
    }

    public void logout() {
        throw new UnsupportedOperationException("TODO: implement logout");
    }
}
