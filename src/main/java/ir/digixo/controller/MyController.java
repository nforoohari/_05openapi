//package ir.digixo.controller;
//
//
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.Parameter;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.responses.ApiResponses;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/")
//@Tag(name = "My Controller to define 10 services",description = "Rest Api for ...Services")
//public class MyController {
//
//
//    @GetMapping("/m")
//    @Operation(summary = "service1 summary")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "403",description = "Oauth2 contact"),
//            @ApiResponse(responseCode = "200",description = "ok response")
//    })
//    public String Service1(@Parameter(name = "input1" ,description = "name of service for invoking") String str)
//    {
//        return "Service 1";
//    }
//}
