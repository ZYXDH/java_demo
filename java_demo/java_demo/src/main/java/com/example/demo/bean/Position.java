package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Position {
    private String name;
    private float rotate;
    private float x;
    private float y;
    private float z;
    private String type;
}
