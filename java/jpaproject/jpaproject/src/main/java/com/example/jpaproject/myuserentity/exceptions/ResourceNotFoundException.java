package com.example.jpaproject.myuserentity.exceptions;

public class ResourceNotFoundException extends RuntimeException {

  public ResourceNotFoundException() {
    super("리소스를 찾을 수 없습니다.");
  }
}
