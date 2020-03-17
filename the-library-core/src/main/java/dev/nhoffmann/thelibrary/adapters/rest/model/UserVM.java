package dev.nhoffmann.thelibrary.adapters.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserVM
{
    @JsonProperty("firstName")
    private String firstname;

    @JsonProperty("lastName")
    private String lastName;
}
