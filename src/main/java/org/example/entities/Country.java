package org.example.entities;

// name, capital city, and population in millions

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {
    private String name, capital;
    private int pop;
    private Continent continent;
}
