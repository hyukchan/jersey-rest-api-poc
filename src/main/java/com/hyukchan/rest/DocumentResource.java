package com.hyukchan.rest;

import com.hyukchan.rest.model.Document;
import com.hyukchan.rest.repository.DocumentRepository;
import com.hyukchan.rest.repository.DocumentRepositoryStub;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("documents")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DocumentResource {

    private DocumentRepository documentRepository = new DocumentRepositoryStub();

    @GET
    public List<Document> getAllDocuments() {
        return documentRepository.findAllDocuments();
    }

    @GET
    @Path("{documentId}")
    public Document getDocument(@PathParam("documentId") String documentId) {
        return documentRepository.findDocument(documentId);
    }
}
