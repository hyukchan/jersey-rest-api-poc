package com.hyukchan.rest.repository;

import com.hyukchan.rest.model.Document;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import java.io.InputStream;
import java.util.List;

public interface DocumentRepository {
    List<Document> findAllDocuments();

    Document findDocument(String documentId);

    Document createDocument(InputStream uploadedInputStream,
                            FormDataContentDisposition fileDetail);

    Document updateDocument(String id, Document document);
}
