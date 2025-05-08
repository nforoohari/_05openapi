package ir.digixo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Tag(name = "My New Controller", description = "Adding 10 services to the RestApi")
public class MyController {

    @GetMapping("/s1")
    @Operation(summary = "Service 1 Summary")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "403", description = "Bad Request"),
            @ApiResponse(responseCode = "200", description = "Ok Response")})
    public String service1(@Parameter(name = "service name", description = "Name of service to invoke") String str) {
        return "Service 1";
    }
}
