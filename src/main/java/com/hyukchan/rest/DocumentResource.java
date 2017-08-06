package com.hyukchan.rest;

import com.hyukchan.rest.model.Document;
import com.hyukchan.rest.repository.DocumentRepository;
import com.hyukchan.rest.repository.DocumentRepositoryStub;
import lombok.extern.slf4j.Slf4j;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.InputStream;
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
    @Path("{id}")
    public Document getDocument(@PathParam("id") String documentId) {
        log.info("Get document with id <{}>", documentId);

        return documentRepository.findDocument(documentId);
    }

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Document createDocument(@FormDataParam("file") InputStream uploadedInputStream,
                                   @FormDataParam("file") FormDataContentDisposition fileDetail) {
        log.info("Create document <{}>", fileDetail.getFileName());

        return documentRepository.createDocument(uploadedInputStream, fileDetail);
    }

    @PUT
    @Path("{id}")
    public Document updateDocument(@PathParam("id") String id, Document document) {
        log.info("Update document <{}> <{}>", id, document);

        return documentRepository.updateDocument(id, document);
    }
}
