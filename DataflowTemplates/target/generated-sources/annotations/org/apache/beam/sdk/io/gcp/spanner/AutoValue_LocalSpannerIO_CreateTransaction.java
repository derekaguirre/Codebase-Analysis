package org.apache.beam.sdk.io.gcp.spanner;

import com.google.cloud.spanner.TimestampBound;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_LocalSpannerIO_CreateTransaction extends LocalSpannerIO.CreateTransaction {

  private final SpannerConfig spannerConfig;

  private final TimestampBound timestampBound;

  private AutoValue_LocalSpannerIO_CreateTransaction(
      SpannerConfig spannerConfig,
      @Nullable TimestampBound timestampBound) {
    this.spannerConfig = spannerConfig;
    this.timestampBound = timestampBound;
  }

  @Override
  SpannerConfig getSpannerConfig() {
    return spannerConfig;
  }

  @Nullable
  @Override
  TimestampBound getTimestampBound() {
    return timestampBound;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LocalSpannerIO.CreateTransaction) {
      LocalSpannerIO.CreateTransaction that = (LocalSpannerIO.CreateTransaction) o;
      return this.spannerConfig.equals(that.getSpannerConfig())
          && (this.timestampBound == null ? that.getTimestampBound() == null : this.timestampBound.equals(that.getTimestampBound()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= spannerConfig.hashCode();
    h$ *= 1000003;
    h$ ^= (timestampBound == null) ? 0 : timestampBound.hashCode();
    return h$;
  }

  @Override
  LocalSpannerIO.CreateTransaction.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends LocalSpannerIO.CreateTransaction.Builder {
    private SpannerConfig spannerConfig;
    private TimestampBound timestampBound;
    Builder() {
    }
    private Builder(LocalSpannerIO.CreateTransaction source) {
      this.spannerConfig = source.getSpannerConfig();
      this.timestampBound = source.getTimestampBound();
    }
    @Override
    public LocalSpannerIO.CreateTransaction.Builder setSpannerConfig(SpannerConfig spannerConfig) {
      if (spannerConfig == null) {
        throw new NullPointerException("Null spannerConfig");
      }
      this.spannerConfig = spannerConfig;
      return this;
    }
    @Override
    public LocalSpannerIO.CreateTransaction.Builder setTimestampBound(TimestampBound timestampBound) {
      this.timestampBound = timestampBound;
      return this;
    }
    @Override
    public LocalSpannerIO.CreateTransaction build() {
      String missing = "";
      if (this.spannerConfig == null) {
        missing += " spannerConfig";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_LocalSpannerIO_CreateTransaction(
          this.spannerConfig,
          this.timestampBound);
    }
  }

}
