package dev.nhoffmann.thelibrary.adapters.rest.entrypoint;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.nhoffmann.thelibrary.adapters.rest.model.UserVM;

@RestController
@RequestMapping("/api/user")
public class UserEntrypoint
{
    @GetMapping
    public ResponseEntity<UserVM> helloWorld()
    {
        return ResponseEntity.ok(new UserVM("John", "Wick"));
    }
}
