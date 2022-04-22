package main.payload.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Long id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String block;
    private String apartment;
    private List<String> roles;

    public JwtResponse(String accessToken,
                       Long id,
                       String username,
                       String email,
                       String firstName,
                       String lastName,
                       String block,
                       String apartment,
                       List<String> roles) {

        this.token = accessToken;
        this.id = id;
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.block = block;
        this.apartment = apartment;
        this.roles = roles;
    }

}