package com.example.demo.services;
import com.example.demo.dto.request.AuthenticationRequest;
import com.example.demo.dto.request.RegisterRequest;
import com.example.demo.dto.response.AuthenticationResponse;
import org.springframework.stereotype.Component;

@Component
public interface AuthenticationService {

        AuthenticationResponse register(RegisterRequest user);

        AuthenticationResponse authenticate(AuthenticationRequest user);
}
