package com.google.cloud.teleport.splunk;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.apache.beam.sdk.options.ValueProvider;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SplunkIO_Write extends SplunkIO.Write {

  private final ValueProvider<String> url;

  private final ValueProvider<String> token;

  private final ValueProvider<Integer> batchCount;

  private final ValueProvider<Integer> parallelism;

  private final ValueProvider<Boolean> disableCertificateValidation;

  private AutoValue_SplunkIO_Write(
      @Nullable ValueProvider<String> url,
      @Nullable ValueProvider<String> token,
      @Nullable ValueProvider<Integer> batchCount,
      @Nullable ValueProvider<Integer> parallelism,
      @Nullable ValueProvider<Boolean> disableCertificateValidation) {
    this.url = url;
    this.token = token;
    this.batchCount = batchCount;
    this.parallelism = parallelism;
    this.disableCertificateValidation = disableCertificateValidation;
  }

  @Nullable
  @Override
  ValueProvider<String> url() {
    return url;
  }

  @Nullable
  @Override
  ValueProvider<String> token() {
    return token;
  }

  @Nullable
  @Override
  ValueProvider<Integer> batchCount() {
    return batchCount;
  }

  @Nullable
  @Override
  ValueProvider<Integer> parallelism() {
    return parallelism;
  }

  @Nullable
  @Override
  ValueProvider<Boolean> disableCertificateValidation() {
    return disableCertificateValidation;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SplunkIO.Write) {
      SplunkIO.Write that = (SplunkIO.Write) o;
      return (this.url == null ? that.url() == null : this.url.equals(that.url()))
          && (this.token == null ? that.token() == null : this.token.equals(that.token()))
          && (this.batchCount == null ? that.batchCount() == null : this.batchCount.equals(that.batchCount()))
          && (this.parallelism == null ? that.parallelism() == null : this.parallelism.equals(that.parallelism()))
          && (this.disableCertificateValidation == null ? that.disableCertificateValidation() == null : this.disableCertificateValidation.equals(that.disableCertificateValidation()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (url == null) ? 0 : url.hashCode();
    h$ *= 1000003;
    h$ ^= (token == null) ? 0 : token.hashCode();
    h$ *= 1000003;
    h$ ^= (batchCount == null) ? 0 : batchCount.hashCode();
    h$ *= 1000003;
    h$ ^= (parallelism == null) ? 0 : parallelism.hashCode();
    h$ *= 1000003;
    h$ ^= (disableCertificateValidation == null) ? 0 : disableCertificateValidation.hashCode();
    return h$;
  }

  static final class Builder extends SplunkIO.Write.Builder {
    private ValueProvider<String> url;
    private ValueProvider<String> token;
    private ValueProvider<Integer> batchCount;
    private ValueProvider<Integer> parallelism;
    private ValueProvider<Boolean> disableCertificateValidation;
    Builder() {
    }
    @Override
    SplunkIO.Write.Builder setUrl(ValueProvider<String> url) {
      this.url = url;
      return this;
    }
    @Override
    @Nullable ValueProvider<String> url() {
      return url;
    }
    @Override
    SplunkIO.Write.Builder setToken(ValueProvider<String> token) {
      this.token = token;
      return this;
    }
    @Override
    @Nullable ValueProvider<String> token() {
      return token;
    }
    @Override
    SplunkIO.Write.Builder setBatchCount(ValueProvider<Integer> batchCount) {
      this.batchCount = batchCount;
      return this;
    }
    @Override
    SplunkIO.Write.Builder setParallelism(ValueProvider<Integer> parallelism) {
      this.parallelism = parallelism;
      return this;
    }
    @Override
    SplunkIO.Write.Builder setDisableCertificateValidation(ValueProvider<Boolean> disableCertificateValidation) {
      this.disableCertificateValidation = disableCertificateValidation;
      return this;
    }
    @Override
    SplunkIO.Write autoBuild() {
      return new AutoValue_SplunkIO_Write(
          this.url,
          this.token,
          this.batchCount,
          this.parallelism,
          this.disableCertificateValidation);
    }
  }

}
