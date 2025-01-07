package com.westeros.diagnostics.services.contract;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Diagnostics {
    private boolean isSuccess;
    private String name;
    private String errorMessage;
    private String description;
}
