package dev.nhoffmann.thelibrary.adapters.rest.entrypoint;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserEntrypoint
{
    @GetMapping
    public ResponseEntity<String> helloWorld()
    {
        return ResponseEntity.ok("hello World");
    }
}
