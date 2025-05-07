package com.example.documentgateway.controller;

import com.example.documentgateway.model.DocumentRequest;
import com.example.documentgateway.service.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/documents")
@RequiredArgsConstructor
public class DocumentController {
    private final DocumentService documentService;

    @PostMapping("/generate")
    public ResponseEntity<Void> generateDocument(@RequestBody DocumentRequest request) {
        documentService.processDocumentRequest(request);
        return ResponseEntity.accepted().build();
    }
}