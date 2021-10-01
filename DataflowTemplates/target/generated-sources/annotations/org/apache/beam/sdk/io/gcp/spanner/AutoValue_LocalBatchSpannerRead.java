package org.apache.beam.sdk.io.gcp.spanner;

import com.google.cloud.spanner.TimestampBound;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.apache.beam.sdk.values.PCollectionView;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_LocalBatchSpannerRead extends LocalBatchSpannerRead {

  private final SpannerConfig spannerConfig;

  private final PCollectionView<Transaction> txView;

  private final TimestampBound timestampBound;

  AutoValue_LocalBatchSpannerRead(
      SpannerConfig spannerConfig,
      @Nullable PCollectionView<Transaction> txView,
      TimestampBound timestampBound) {
    if (spannerConfig == null) {
      throw new NullPointerException("Null spannerConfig");
    }
    this.spannerConfig = spannerConfig;
    this.txView = txView;
    if (timestampBound == null) {
      throw new NullPointerException("Null timestampBound");
    }
    this.timestampBound = timestampBound;
  }

  @Override
  SpannerConfig getSpannerConfig() {
    return spannerConfig;
  }

  @Nullable
  @Override
  PCollectionView<Transaction> getTxView() {
    return txView;
  }

  @Override
  TimestampBound getTimestampBound() {
    return timestampBound;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LocalBatchSpannerRead) {
      LocalBatchSpannerRead that = (LocalBatchSpannerRead) o;
      return this.spannerConfig.equals(that.getSpannerConfig())
          && (this.txView == null ? that.getTxView() == null : this.txView.equals(that.getTxView()))
          && this.timestampBound.equals(that.getTimestampBound());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= spannerConfig.hashCode();
    h$ *= 1000003;
    h$ ^= (txView == null) ? 0 : txView.hashCode();
    h$ *= 1000003;
    h$ ^= timestampBound.hashCode();
    return h$;
  }

}
