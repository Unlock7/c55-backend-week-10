package net.hackyourfuture.security.user;

import lombok.AllArgsConstructor;
import net.hackyourfuture.security.user.dto.UserRequest;
import net.hackyourfuture.security.user.dto.UserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponse register(UserRequest request) {
        throw new UnsupportedOperationException("TODO: implement registration");
    }

    public UserResponse getProfile(String username) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        }
        return new UserResponse(user.getId(), user.getUsername());
    }
}
