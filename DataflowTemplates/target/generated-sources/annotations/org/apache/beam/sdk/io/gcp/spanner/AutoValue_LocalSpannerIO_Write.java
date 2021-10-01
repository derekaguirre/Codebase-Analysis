package org.apache.beam.sdk.io.gcp.spanner;

import java.util.OptionalInt;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.apache.beam.sdk.values.PCollection;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_LocalSpannerIO_Write extends LocalSpannerIO.Write {

  private final SpannerConfig spannerConfig;

  private final long batchSizeBytes;

  private final long maxNumMutations;

  private final long maxNumRows;

  private final LocalSpannerIO.FailureMode failureMode;

  private final PCollection schemaReadySignal;

  private final OptionalInt groupingFactor;

  private AutoValue_LocalSpannerIO_Write(
      SpannerConfig spannerConfig,
      long batchSizeBytes,
      long maxNumMutations,
      long maxNumRows,
      LocalSpannerIO.FailureMode failureMode,
      @Nullable PCollection schemaReadySignal,
      OptionalInt groupingFactor) {
    this.spannerConfig = spannerConfig;
    this.batchSizeBytes = batchSizeBytes;
    this.maxNumMutations = maxNumMutations;
    this.maxNumRows = maxNumRows;
    this.failureMode = failureMode;
    this.schemaReadySignal = schemaReadySignal;
    this.groupingFactor = groupingFactor;
  }

  @Override
  SpannerConfig getSpannerConfig() {
    return spannerConfig;
  }

  @Override
  long getBatchSizeBytes() {
    return batchSizeBytes;
  }

  @Override
  long getMaxNumMutations() {
    return maxNumMutations;
  }

  @Override
  long getMaxNumRows() {
    return maxNumRows;
  }

  @Override
  LocalSpannerIO.FailureMode getFailureMode() {
    return failureMode;
  }

  @Nullable
  @Override
  PCollection getSchemaReadySignal() {
    return schemaReadySignal;
  }

  @Override
  OptionalInt getGroupingFactor() {
    return groupingFactor;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LocalSpannerIO.Write) {
      LocalSpannerIO.Write that = (LocalSpannerIO.Write) o;
      return this.spannerConfig.equals(that.getSpannerConfig())
          && this.batchSizeBytes == that.getBatchSizeBytes()
          && this.maxNumMutations == that.getMaxNumMutations()
          && this.maxNumRows == that.getMaxNumRows()
          && this.failureMode.equals(that.getFailureMode())
          && (this.schemaReadySignal == null ? that.getSchemaReadySignal() == null : this.schemaReadySignal.equals(that.getSchemaReadySignal()))
          && this.groupingFactor.equals(that.getGroupingFactor());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= spannerConfig.hashCode();
    h$ *= 1000003;
    h$ ^= (int) ((batchSizeBytes >>> 32) ^ batchSizeBytes);
    h$ *= 1000003;
    h$ ^= (int) ((maxNumMutations >>> 32) ^ maxNumMutations);
    h$ *= 1000003;
    h$ ^= (int) ((maxNumRows >>> 32) ^ maxNumRows);
    h$ *= 1000003;
    h$ ^= failureMode.hashCode();
    h$ *= 1000003;
    h$ ^= (schemaReadySignal == null) ? 0 : schemaReadySignal.hashCode();
    h$ *= 1000003;
    h$ ^= groupingFactor.hashCode();
    return h$;
  }

  @Override
  LocalSpannerIO.Write.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends LocalSpannerIO.Write.Builder {
    private SpannerConfig spannerConfig;
    private Long batchSizeBytes;
    private Long maxNumMutations;
    private Long maxNumRows;
    private LocalSpannerIO.FailureMode failureMode;
    private PCollection schemaReadySignal;
    private OptionalInt groupingFactor = OptionalInt.empty();
    Builder() {
    }
    private Builder(LocalSpannerIO.Write source) {
      this.spannerConfig = source.getSpannerConfig();
      this.batchSizeBytes = source.getBatchSizeBytes();
      this.maxNumMutations = source.getMaxNumMutations();
      this.maxNumRows = source.getMaxNumRows();
      this.failureMode = source.getFailureMode();
      this.schemaReadySignal = source.getSchemaReadySignal();
      this.groupingFactor = source.getGroupingFactor();
    }
    @Override
    LocalSpannerIO.Write.Builder setSpannerConfig(SpannerConfig spannerConfig) {
      if (spannerConfig == null) {
        throw new NullPointerException("Null spannerConfig");
      }
      this.spannerConfig = spannerConfig;
      return this;
    }
    @Override
    LocalSpannerIO.Write.Builder setBatchSizeBytes(long batchSizeBytes) {
      this.batchSizeBytes = batchSizeBytes;
      return this;
    }
    @Override
    LocalSpannerIO.Write.Builder setMaxNumMutations(long maxNumMutations) {
      this.maxNumMutations = maxNumMutations;
      return this;
    }
    @Override
    LocalSpannerIO.Write.Builder setMaxNumRows(long maxNumRows) {
      this.maxNumRows = maxNumRows;
      return this;
    }
    @Override
    LocalSpannerIO.Write.Builder setFailureMode(LocalSpannerIO.FailureMode failureMode) {
      if (failureMode == null) {
        throw new NullPointerException("Null failureMode");
      }
      this.failureMode = failureMode;
      return this;
    }
    @Override
    LocalSpannerIO.Write.Builder setSchemaReadySignal(PCollection schemaReadySignal) {
      this.schemaReadySignal = schemaReadySignal;
      return this;
    }
    @Override
    LocalSpannerIO.Write.Builder setGroupingFactor(int groupingFactor) {
      this.groupingFactor = OptionalInt.of(groupingFactor);
      return this;
    }
    @Override
    LocalSpannerIO.Write build() {
      String missing = "";
      if (this.spannerConfig == null) {
        missing += " spannerConfig";
      }
      if (this.batchSizeBytes == null) {
        missing += " batchSizeBytes";
      }
      if (this.maxNumMutations == null) {
        missing += " maxNumMutations";
      }
      if (this.maxNumRows == null) {
        missing += " maxNumRows";
      }
      if (this.failureMode == null) {
        missing += " failureMode";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_LocalSpannerIO_Write(
          this.spannerConfig,
          this.batchSizeBytes,
          this.maxNumMutations,
          this.maxNumRows,
          this.failureMode,
          this.schemaReadySignal,
          this.groupingFactor);
    }
  }

}
