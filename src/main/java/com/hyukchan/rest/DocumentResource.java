package com.hyukchan.rest;

import com.hyukchan.rest.model.Document;
import com.hyukchan.rest.repository.DocumentRepository;
import com.hyukchan.rest.repository.DocumentRepositoryStub;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("documents")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Slf4j
public class DocumentResource {

    private DocumentRepository documentRepository = new DocumentRepositoryStub();

    @GET
    public List<Document> getAllDocuments() {
        log.info("Get all documents");

        return documentRepository.findAllDocuments();
    }

    @GET
    @Path("{documentId}")
    public Document getDocument(@PathParam("documentId") String documentId) {
        log.info("Get document with id <{}>", documentId);

        return documentRepository.findDocument(documentId);
    }

    @POST
    public Document createDocument(Document document) {
        log.info("Create document <{}>", document);

        return documentRepository.createDocument(document);
    }
}
