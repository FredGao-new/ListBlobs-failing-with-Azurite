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

        // // Additional test cases excuted on Azurite
        // container.getBlobClient("blobName").uploadFromFile("filePath");
        // container.getBlobClient("blobName").downloadToFile("filePath");

        // List the blob(s) in the container.
        for (BlobItem blobItem : container.listBlobs()) {
            System.out.println("\t" + blobItem.getName());
        }

        // // Same test cases excuted on Azure Portal
        // BlobContainerClient container2 = new BlobServiceClientBuilder()
        //             .connectionString("connectionString")
        //             .buildClient()
        //             .getBlobContainerClient("mycontainer");
        // if (!container2.exists()) container2.create();
        // System.out.println("exists: " + container2.exists());
        // container2.getBlobClient("blobName").uploadFromFile("filePath");
        // container2.getBlobClient("blobName").downloadToFile("filePath");
        // // List the blob(s) in the container.
        // for (BlobItem blobItem : container2.listBlobs()) {
        //     System.out.println("\t" + blobItem.getName());
        // }        
    }
}