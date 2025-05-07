package com.example.documentgateway.model;

import lombok.Data;
import java.util.Map;

@Data
public class DocumentRequest {
    private String templateId;
    private Map<String, Object> metadata;
    private String callbackUrl;
}