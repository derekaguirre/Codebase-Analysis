package org.apache.beam.sdk.io.gcp.spanner;

import com.google.cloud.spanner.TimestampBound;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.apache.beam.sdk.values.PCollectionView;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_LocalSpannerIO_ReadAll extends LocalSpannerIO.ReadAll {

  private final SpannerConfig spannerConfig;

  private final PCollectionView<Transaction> transaction;

  private final TimestampBound timestampBound;

  private final Boolean batching;

  private AutoValue_LocalSpannerIO_ReadAll(
      SpannerConfig spannerConfig,
      @Nullable PCollectionView<Transaction> transaction,
      @Nullable TimestampBound timestampBound,
      Boolean batching) {
    this.spannerConfig = spannerConfig;
    this.transaction = transaction;
    this.timestampBound = timestampBound;
    this.batching = batching;
  }

  @Override
  SpannerConfig getSpannerConfig() {
    return spannerConfig;
  }

  @Nullable
  @Override
  PCollectionView<Transaction> getTransaction() {
    return transaction;
  }

  @Nullable
  @Override
  TimestampBound getTimestampBound() {
    return timestampBound;
  }

  @Override
  Boolean getBatching() {
    return batching;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LocalSpannerIO.ReadAll) {
      LocalSpannerIO.ReadAll that = (LocalSpannerIO.ReadAll) o;
      return this.spannerConfig.equals(that.getSpannerConfig())
          && (this.transaction == null ? that.getTransaction() == null : this.transaction.equals(that.getTransaction()))
          && (this.timestampBound == null ? that.getTimestampBound() == null : this.timestampBound.equals(that.getTimestampBound()))
          && this.batching.equals(that.getBatching());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= spannerConfig.hashCode();
    h$ *= 1000003;
    h$ ^= (transaction == null) ? 0 : transaction.hashCode();
    h$ *= 1000003;
    h$ ^= (timestampBound == null) ? 0 : timestampBound.hashCode();
    h$ *= 1000003;
    h$ ^= batching.hashCode();
    return h$;
  }

  @Override
  LocalSpannerIO.ReadAll.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends LocalSpannerIO.ReadAll.Builder {
    private SpannerConfig spannerConfig;
    private PCollectionView<Transaction> transaction;
    private TimestampBound timestampBound;
    private Boolean batching;
    Builder() {
    }
    private Builder(LocalSpannerIO.ReadAll source) {
      this.spannerConfig = source.getSpannerConfig();
      this.transaction = source.getTransaction();
      this.timestampBound = source.getTimestampBound();
      this.batching = source.getBatching();
    }
    @Override
    LocalSpannerIO.ReadAll.Builder setSpannerConfig(SpannerConfig spannerConfig) {
      if (spannerConfig == null) {
        throw new NullPointerException("Null spannerConfig");
      }
      this.spannerConfig = spannerConfig;
      return this;
    }
    @Override
    LocalSpannerIO.ReadAll.Builder setTransaction(PCollectionView<Transaction> transaction) {
      this.transaction = transaction;
      return this;
    }
    @Override
    LocalSpannerIO.ReadAll.Builder setTimestampBound(TimestampBound timestampBound) {
      this.timestampBound = timestampBound;
      return this;
    }
    @Override
    LocalSpannerIO.ReadAll.Builder setBatching(Boolean batching) {
      if (batching == null) {
        throw new NullPointerException("Null batching");
      }
      this.batching = batching;
      return this;
    }
    @Override
    LocalSpannerIO.ReadAll build() {
      String missing = "";
      if (this.spannerConfig == null) {
        missing += " spannerConfig";
      }
      if (this.batching == null) {
        missing += " batching";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_LocalSpannerIO_ReadAll(
          this.spannerConfig,
          this.transaction,
          this.timestampBound,
          this.batching);
    }
  }

}
