package com.example.demo;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import org.apache.tomcat.util.http.fileupload.FileUtils;

import java.io.File;

public class Main {
    public static void main(String[] args){
        AWSCredentials credentials = new BasicAWSCredentials("AKIA2MLUUZYHARGATPQN","Q3v6Ucwv397ovyf84AdLHq+jiX0Zo/o4ZjPItA5/");

        AmazonS3 s3client = AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.US_WEST_2)
                .build();

        String bucketName = "sopdop-bucket";

        if(s3client.doesBucketExistV2(bucketName)) {
            System.out.println("Bucket name is not available."
                    + " Try again with a different Bucket name.");
        }

        ObjectListing objectListing = s3client.listObjects(bucketName);
        for(S3ObjectSummary os : objectListing.getObjectSummaries()) {
            System.out.println(os.getKey());
        }

        S3Object s3object = s3client.getObject(bucketName, "resume_001.docx");
        S3ObjectInputStream inputStream = s3object.getObjectContent();
        //FileUtils.copyInputStreamToFile(inputStream, new File("/Users/user/Desktop/hello.txt"));
    }
}
