package com.mangofactory.service.model;

public class ApiInfo {

  private final String version;
  private final String title;
  private final String description;
  private final String termsOfServiceUrl;
  private final String contact;
  private final String license;
  private final String licenseUrl;

  public ApiInfo(String title, String description, String version, String termsOfServiceUrl, String contact,
                 String license, String licenseUrl) {
    this.title = title;
    this.description = description;
    this.version = version;
    this.termsOfServiceUrl = termsOfServiceUrl;
    this.contact = contact;
    this.license = license;
    this.licenseUrl = licenseUrl;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public String getTermsOfServiceUrl() {
    return termsOfServiceUrl;
  }

  public String getContact() {
    return contact;
  }

  public String getLicense() {
    return license;
  }

  public String getLicenseUrl() {
    return licenseUrl;
  }

  public String getVersion() {
    return version;
  }
}
