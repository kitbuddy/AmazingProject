package com.amazing.project.models;

import lombok.*;

@Builder
@AllArgsConstructor
@Data
public class Home {
    int id;
    String name;
    int value;
}
