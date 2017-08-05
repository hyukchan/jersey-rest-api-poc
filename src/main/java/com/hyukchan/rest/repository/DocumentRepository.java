package com.hyukchan.rest.repository;

import com.hyukchan.rest.model.Document;

import java.util.List;

public interface DocumentRepository {
    List<Document> findAllDocuments();

    Document findDocument(String documentId);
}
