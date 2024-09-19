package com.example.spring_mvc.controller;

import com.example.spring_mvc.model.MyCustomObject;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerMapping;

@RestController
public class MvcMappingDemoController {

    @GetMapping("/{name:[a-z-]+}-{version:\\d\\.\\d\\.\\d}{ext:\\.[a-z]+}")
    public String handle(@PathVariable String name, @PathVariable String version, @PathVariable String ext) {
        return """
                Name: %s
                Version: %s
                Extension: %s
                """.formatted(name, version, ext);
    }

    @RequestMapping("/api/v${api.version}/users")
    public String handleApi() {
        return "Api Version Mapping";
    }

    @GetMapping(value = {"/users", "/users/{id}"})
    public String getUser(@PathVariable(required = false) Long id) {
        if (id != null) {
            return "User with id: " + id;
        }
        return "All users";
    }

    @GetMapping("/files/**")
    public String handleFileRequest(HttpServletRequest request) {
        //Capture the full path beyond "/files/"
        String fullPath = (String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
        return fullPath;
    }

    @PostMapping(value = "/custom", consumes = "application/custom-json", produces = "application/custom-json")
    public MyCustomObject handleCustom(@RequestBody MyCustomObject myCustomObject) {
        // Simply return the received object for testing
        return myCustomObject;
    }

}
