package net.hackyourfuture.security.authentication;

import lombok.AllArgsConstructor;
import net.hackyourfuture.security.authentication.dto.LoginRequest;
import net.hackyourfuture.security.authentication.dto.LoginResponse;
import net.hackyourfuture.security.user.User;
import net.hackyourfuture.security.user.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@AllArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public LoginResponse login(LoginRequest request) {
        User user = userRepository.findByUsername(request.username());

        if (user == null || !passwordEncoder.matches(request.password(), user.getPassword())) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid username or password");
        }

        return new LoginResponse(jwtService.generateToken(user.getUsername()));
    }

    public void logout() {
        // JWT logout: client deletes token
    }
}