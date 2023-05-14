package com.example.weather.controller;

import com.example.weather.dto.SwaggerExampleRequestDTO;
import com.example.weather.dto.SwaggerExampleResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SwaggerExampleController {

    @Operation(summary = "Swagger Example", description = "This is a description")
    @PostMapping("/hello")
    public ResponseEntity<SwaggerExampleResponseDTO> helloWorld(
            @RequestBody SwaggerExampleRequestDTO requestDTO, @RequestParam String age){

        SwaggerExampleResponseDTO responseDTO = new SwaggerExampleResponseDTO();
        responseDTO.setGreetings("Hello "+ requestDTO.getName() + age);

        return ResponseEntity.ok(responseDTO);
    }

}
