package com.cust;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Retrieve {
	private static final String ACCESS_KEY = "AKIA5FTZE4ZLNJHYET6Y";
    private static final String SECRET_KEY = "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";
    private static final String REGION = "eu-north-1";
    private static final String BUCKET_NAME = "customer101";

	public static void main(String[] args) throws IOException {
		        BasicAWSCredentials awsCreds = new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY);
		        AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
		                .withRegion(REGION)
		                .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
		                .build();
		        GetObjectRequest request = new GetObjectRequest(BUCKET_NAME, "101.txt");
		        S3Object object = s3Client.getObject(request);
		        File tempFile = new File("Customer Data Retrieve.txt");
		        tempFile.createNewFile();
		        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
		            object.getObjectContent().transferTo(fos);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		        BufferedReader reader = new BufferedReader(new FileReader(tempFile));
		        String customerData = "";
		        try {
		            String line;
		            while ((line = reader.readLine()) != null) {
		                customerData += line;
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		        System.out.println("Retrieved customer data from S3 bucket: " + customerData);
		    }
		}
