package com.cust;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.PutObjectRequest;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Upload {
    private static final String ACCESS_KEY = "AKIA5FTZE4ZLNJHYET6Y";
    private static final String SECRET_KEY = "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";
    private static final String REGION = "eu-north-1";
    private static final String BUCKET_NAME = "customer101";

    public static void main(String[] args) {
        BasicAWSCredentials awsCreds = new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY);
        AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                .withRegion(REGION)
                .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
                .build();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer ID: ");
        String customerid = scanner.nextLine();

        System.out.print("Enter customer name: ");
        String customername = scanner.nextLine();

        System.out.print("Enter customer age: ");
        String customerage = scanner.nextLine();

        System.out.print("Enter customer city: ");
        String customercity = scanner.nextLine();

        File customerFile = new File("D:\\Customer Data.txt");
        try (FileWriter writer = new FileWriter(customerFile)) {
            writer.write("Customer ID : " + customerid + "\n");
            writer.write("Customer Name : " + customername + "\n");
            writer.write("Customer Age : " + customerage + "\n");
            writer.write("Customer City : " + customercity + "\n");
        } catch (IOException e) {
            System.err.println("Error creating customer file: " + e.getMessage());
            return;
        }

        PutObjectRequest request = new PutObjectRequest(BUCKET_NAME, customerid + ".txt", customerFile);
        s3Client.putObject(request);

        System.out.println("Customer file uploaded to S3: " + BUCKET_NAME + "/" + customerid + ".txt");
}
}