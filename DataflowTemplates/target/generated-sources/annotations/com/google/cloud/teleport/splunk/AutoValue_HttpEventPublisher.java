package com.google.cloud.teleport.splunk;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.apache.v2.ApacheHttpTransport;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_HttpEventPublisher extends HttpEventPublisher {

  private final ApacheHttpTransport transport;

  private final HttpRequestFactory requestFactory;

  private final GenericUrl genericUrl;

  private final String token;

  private final Integer maxElapsedMillis;

  private final Boolean disableCertificateValidation;

  private AutoValue_HttpEventPublisher(
      ApacheHttpTransport transport,
      HttpRequestFactory requestFactory,
      GenericUrl genericUrl,
      String token,
      @Nullable Integer maxElapsedMillis,
      Boolean disableCertificateValidation) {
    this.transport = transport;
    this.requestFactory = requestFactory;
    this.genericUrl = genericUrl;
    this.token = token;
    this.maxElapsedMillis = maxElapsedMillis;
    this.disableCertificateValidation = disableCertificateValidation;
  }

  @Override
  ApacheHttpTransport transport() {
    return transport;
  }

  @Override
  HttpRequestFactory requestFactory() {
    return requestFactory;
  }

  @Override
  GenericUrl genericUrl() {
    return genericUrl;
  }

  @Override
  String token() {
    return token;
  }

  @Nullable
  @Override
  Integer maxElapsedMillis() {
    return maxElapsedMillis;
  }

  @Override
  Boolean disableCertificateValidation() {
    return disableCertificateValidation;
  }

  @Override
  public String toString() {
    return "HttpEventPublisher{"
        + "transport=" + transport + ", "
        + "requestFactory=" + requestFactory + ", "
        + "genericUrl=" + genericUrl + ", "
        + "token=" + token + ", "
        + "maxElapsedMillis=" + maxElapsedMillis + ", "
        + "disableCertificateValidation=" + disableCertificateValidation
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HttpEventPublisher) {
      HttpEventPublisher that = (HttpEventPublisher) o;
      return this.transport.equals(that.transport())
          && this.requestFactory.equals(that.requestFactory())
          && this.genericUrl.equals(that.genericUrl())
          && this.token.equals(that.token())
          && (this.maxElapsedMillis == null ? that.maxElapsedMillis() == null : this.maxElapsedMillis.equals(that.maxElapsedMillis()))
          && this.disableCertificateValidation.equals(that.disableCertificateValidation());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= transport.hashCode();
    h$ *= 1000003;
    h$ ^= requestFactory.hashCode();
    h$ *= 1000003;
    h$ ^= genericUrl.hashCode();
    h$ *= 1000003;
    h$ ^= token.hashCode();
    h$ *= 1000003;
    h$ ^= (maxElapsedMillis == null) ? 0 : maxElapsedMillis.hashCode();
    h$ *= 1000003;
    h$ ^= disableCertificateValidation.hashCode();
    return h$;
  }

  static final class Builder extends HttpEventPublisher.Builder {
    private ApacheHttpTransport transport;
    private HttpRequestFactory requestFactory;
    private GenericUrl genericUrl;
    private String token;
    private Integer maxElapsedMillis;
    private Boolean disableCertificateValidation;
    Builder() {
    }
    @Override
    HttpEventPublisher.Builder setTransport(ApacheHttpTransport transport) {
      if (transport == null) {
        throw new NullPointerException("Null transport");
      }
      this.transport = transport;
      return this;
    }
    @Override
    ApacheHttpTransport transport() {
      if (transport == null) {
        throw new IllegalStateException("Property \"transport\" has not been set");
      }
      return transport;
    }
    @Override
    HttpEventPublisher.Builder setRequestFactory(HttpRequestFactory requestFactory) {
      if (requestFactory == null) {
        throw new NullPointerException("Null requestFactory");
      }
      this.requestFactory = requestFactory;
      return this;
    }
    @Override
    HttpEventPublisher.Builder setGenericUrl(GenericUrl genericUrl) {
      if (genericUrl == null) {
        throw new NullPointerException("Null genericUrl");
      }
      this.genericUrl = genericUrl;
      return this;
    }
    @Override
    GenericUrl genericUrl() {
      if (genericUrl == null) {
        throw new IllegalStateException("Property \"genericUrl\" has not been set");
      }
      return genericUrl;
    }
    @Override
    HttpEventPublisher.Builder setToken(String token) {
      if (token == null) {
        throw new NullPointerException("Null token");
      }
      this.token = token;
      return this;
    }
    @Override
    String token() {
      if (token == null) {
        throw new IllegalStateException("Property \"token\" has not been set");
      }
      return token;
    }
    @Override
    HttpEventPublisher.Builder setMaxElapsedMillis(Integer maxElapsedMillis) {
      this.maxElapsedMillis = maxElapsedMillis;
      return this;
    }
    @Override
    @Nullable Integer maxElapsedMillis() {
      return maxElapsedMillis;
    }
    @Override
    HttpEventPublisher.Builder setDisableCertificateValidation(Boolean disableCertificateValidation) {
      if (disableCertificateValidation == null) {
        throw new NullPointerException("Null disableCertificateValidation");
      }
      this.disableCertificateValidation = disableCertificateValidation;
      return this;
    }
    @Override
    Boolean disableCertificateValidation() {
      if (disableCertificateValidation == null) {
        throw new IllegalStateException("Property \"disableCertificateValidation\" has not been set");
      }
      return disableCertificateValidation;
    }
    @Override
    HttpEventPublisher autoBuild() {
      String missing = "";
      if (this.transport == null) {
        missing += " transport";
      }
      if (this.requestFactory == null) {
        missing += " requestFactory";
      }
      if (this.genericUrl == null) {
        missing += " genericUrl";
      }
      if (this.token == null) {
        missing += " token";
      }
      if (this.disableCertificateValidation == null) {
        missing += " disableCertificateValidation";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_HttpEventPublisher(
          this.transport,
          this.requestFactory,
          this.genericUrl,
          this.token,
          this.maxElapsedMillis,
          this.disableCertificateValidation);
    }
  }

}
