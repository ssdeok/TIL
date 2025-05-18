package com.done.swim.global.awss3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

@Configuration
public class AwsS3Config {

    @Value("${REGION}")
    private String REGION;

    @Value("${ACCESS_KEY}")
    private String ACCESS_KEY;

    @Value("${SECRET_KEY}")
    private String SECRET_KEY;

    // AWS S3 서비스에 접근할 수 있는 클라이언트 빈 생성 (
    @Bean
    public S3Client s3Client() {
        StaticCredentialsProvider credential = StaticCredentialsProvider.create(
                AwsBasicCredentials.create(ACCESS_KEY, SECRET_KEY)
        );

        return S3Client.builder()
                .region(Region.of(REGION))
                .credentialsProvider(credential)
                .build();
    }
}