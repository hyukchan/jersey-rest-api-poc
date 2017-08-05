package com.hyukchan.rest.repository;

import com.hyukchan.rest.model.Document;
import com.hyukchan.rest.model.Property;

import java.util.ArrayList;
import java.util.List;

public class DocumentRepositoryStub implements DocumentRepository {

    @Override
    public List<Document> findAllDocuments() {
        List<Document> documents = new ArrayList<>();

        Document doc1 = new Document();
        doc1.setFilename("Document1.txt");

        List<Property> properties1 = new ArrayList<>();
        properties1.add(new Property("key1", "value1"));
        properties1.add(new Property("key2", "value2"));

        doc1.setProperties(properties1);

        documents.add(doc1);

        Document doc2 = new Document();
        doc2.setFilename("Document2.txt");

        List<Property> properties2 = new ArrayList<>();
        properties2.add(new Property("key3", "value3"));
        properties2.add(new Property("key4", "value4"));

        doc2.setProperties(properties2);

        documents.add(doc2);

        return documents;
    }

    @Override
    public Document findDocument(String documentId) {
        Document doc1 = new Document();
        doc1.setFilename("Document1.txt");

        List<Property> properties1 = new ArrayList<>();
        properties1.add(new Property("key1", "value1"));
        properties1.add(new Property("key2", "value2"));

        doc1.setProperties(properties1);

        return doc1;
    }
}
