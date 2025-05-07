package com.example.documentgateway.service;

import com.example.documentgateway.model.DocumentRequest;
import com.example.documentgateway.model.Template;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DocumentService {
    private final KafkaTemplate<String, DocumentRequest> kafkaTemplate;
    
    public void processDocumentRequest(DocumentRequest request) {
        // Enviar a requisição para o Kafka para processamento assíncrono
        kafkaTemplate.send("document-generation-requests", request);
    }
}