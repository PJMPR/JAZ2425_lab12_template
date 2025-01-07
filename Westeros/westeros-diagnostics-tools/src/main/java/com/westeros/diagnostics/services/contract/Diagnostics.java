package com.westeros.diagnostics.services.contract;

import lombok.Data;

@Data
public class Diagnostics {
    private boolean isSuccess;
    private String name;
    private String errorMessage;
    private String description;
}
