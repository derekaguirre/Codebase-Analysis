package com.google.cloud.teleport.splunk;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.apache.beam.sdk.options.ValueProvider;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SplunkEventWriter extends SplunkEventWriter {

  private final ValueProvider<String> url;

  private final ValueProvider<String> token;

  private final ValueProvider<Boolean> disableCertificateValidation;

  private final ValueProvider<Integer> inputBatchCount;

  private AutoValue_SplunkEventWriter(
      @Nullable ValueProvider<String> url,
      @Nullable ValueProvider<String> token,
      @Nullable ValueProvider<Boolean> disableCertificateValidation,
      @Nullable ValueProvider<Integer> inputBatchCount) {
    this.url = url;
    this.token = token;
    this.disableCertificateValidation = disableCertificateValidation;
    this.inputBatchCount = inputBatchCount;
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
  ValueProvider<Boolean> disableCertificateValidation() {
    return disableCertificateValidation;
  }

  @Nullable
  @Override
  ValueProvider<Integer> inputBatchCount() {
    return inputBatchCount;
  }

  @Override
  public String toString() {
    return "SplunkEventWriter{"
        + "url=" + url + ", "
        + "token=" + token + ", "
        + "disableCertificateValidation=" + disableCertificateValidation + ", "
        + "inputBatchCount=" + inputBatchCount
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SplunkEventWriter) {
      SplunkEventWriter that = (SplunkEventWriter) o;
      return (this.url == null ? that.url() == null : this.url.equals(that.url()))
          && (this.token == null ? that.token() == null : this.token.equals(that.token()))
          && (this.disableCertificateValidation == null ? that.disableCertificateValidation() == null : this.disableCertificateValidation.equals(that.disableCertificateValidation()))
          && (this.inputBatchCount == null ? that.inputBatchCount() == null : this.inputBatchCount.equals(that.inputBatchCount()));
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
    h$ ^= (disableCertificateValidation == null) ? 0 : disableCertificateValidation.hashCode();
    h$ *= 1000003;
    h$ ^= (inputBatchCount == null) ? 0 : inputBatchCount.hashCode();
    return h$;
  }

  static final class Builder extends SplunkEventWriter.Builder {
    private ValueProvider<String> url;
    private ValueProvider<String> token;
    private ValueProvider<Boolean> disableCertificateValidation;
    private ValueProvider<Integer> inputBatchCount;
    Builder() {
    }
    @Override
    SplunkEventWriter.Builder setUrl(ValueProvider<String> url) {
      this.url = url;
      return this;
    }
    @Override
    @Nullable ValueProvider<String> url() {
      return url;
    }
    @Override
    SplunkEventWriter.Builder setToken(ValueProvider<String> token) {
      this.token = token;
      return this;
    }
    @Override
    @Nullable ValueProvider<String> token() {
      return token;
    }
    @Override
    SplunkEventWriter.Builder setDisableCertificateValidation(ValueProvider<Boolean> disableCertificateValidation) {
      this.disableCertificateValidation = disableCertificateValidation;
      return this;
    }
    @Override
    SplunkEventWriter.Builder setInputBatchCount(ValueProvider<Integer> inputBatchCount) {
      this.inputBatchCount = inputBatchCount;
      return this;
    }
    @Override
    SplunkEventWriter autoBuild() {
      return new AutoValue_SplunkEventWriter(
          this.url,
          this.token,
          this.disableCertificateValidation,
          this.inputBatchCount);
    }
  }

}
