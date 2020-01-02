package com.blobs.listex;

import com.azure.storage.blob.*;
import com.azure.storage.blob.models.*;
import java.io.*;

public class App
{
    public static void main( String[] args ) throws NoSuchFieldException {

        BlobContainerClient container = new BlobServiceClientBuilder()
                .connectionString("UseDevelopmentStorage=true;")
                .buildClient()
                .getBlobContainerClient("mycontainer");
        if (!container.exists()) container.create();
        System.out.println("exists: " + container.exists());

        // // More scenarios tried on Azurite
        // container.getBlobClient("blobName").uploadFromFile("filePath");
        // container.getBlobClient("blobName").downloadToFile("filePath");

        // List the blob(s) in the container.
        for (BlobItem blobItem : container.listBlobs()) {
            System.out.println("\t" + blobItem.getName());
        }
 
    }
}