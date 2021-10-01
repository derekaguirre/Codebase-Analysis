package org.apache.beam.sdk.io.gcp.spanner;

import com.google.cloud.ServiceFactory;
import com.google.cloud.spanner.Spanner;
import com.google.cloud.spanner.SpannerOptions;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.apache.beam.sdk.options.ValueProvider;
import org.apache.beam.vendor.guava.v26_0_jre.com.google.common.annotations.VisibleForTesting;
import org.joda.time.Duration;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SpannerConfig extends SpannerConfig {

  private final ValueProvider<String> projectId;

  private final ValueProvider<String> instanceId;

  private final ValueProvider<String> databaseId;

  private final ValueProvider<String> host;

  private final ValueProvider<String> emulatorHost;

  private final ValueProvider<Duration> commitDeadline;

  private final ValueProvider<Duration> maxCumulativeBackoff;

  private final ServiceFactory<Spanner, SpannerOptions> serviceFactory;

  private AutoValue_SpannerConfig(
      @Nullable ValueProvider<String> projectId,
      @Nullable ValueProvider<String> instanceId,
      @Nullable ValueProvider<String> databaseId,
      @Nullable ValueProvider<String> host,
      @Nullable ValueProvider<String> emulatorHost,
      @Nullable ValueProvider<Duration> commitDeadline,
      @Nullable ValueProvider<Duration> maxCumulativeBackoff,
      @Nullable ServiceFactory<Spanner, SpannerOptions> serviceFactory) {
    this.projectId = projectId;
    this.instanceId = instanceId;
    this.databaseId = databaseId;
    this.host = host;
    this.emulatorHost = emulatorHost;
    this.commitDeadline = commitDeadline;
    this.maxCumulativeBackoff = maxCumulativeBackoff;
    this.serviceFactory = serviceFactory;
  }

  @Nullable
  @Override
  public ValueProvider<String> getProjectId() {
    return projectId;
  }

  @Nullable
  @Override
  public ValueProvider<String> getInstanceId() {
    return instanceId;
  }

  @Nullable
  @Override
  public ValueProvider<String> getDatabaseId() {
    return databaseId;
  }

  @Nullable
  @Override
  public ValueProvider<String> getHost() {
    return host;
  }

  @Nullable
  @Override
  public ValueProvider<String> getEmulatorHost() {
    return emulatorHost;
  }

  @Nullable
  @Override
  public ValueProvider<Duration> getCommitDeadline() {
    return commitDeadline;
  }

  @Nullable
  @Override
  public ValueProvider<Duration> getMaxCumulativeBackoff() {
    return maxCumulativeBackoff;
  }

  @VisibleForTesting
  @Nullable
  @Override
  ServiceFactory<Spanner, SpannerOptions> getServiceFactory() {
    return serviceFactory;
  }

  @Override
  public String toString() {
    return "SpannerConfig{"
        + "projectId=" + projectId + ", "
        + "instanceId=" + instanceId + ", "
        + "databaseId=" + databaseId + ", "
        + "host=" + host + ", "
        + "emulatorHost=" + emulatorHost + ", "
        + "commitDeadline=" + commitDeadline + ", "
        + "maxCumulativeBackoff=" + maxCumulativeBackoff + ", "
        + "serviceFactory=" + serviceFactory
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SpannerConfig) {
      SpannerConfig that = (SpannerConfig) o;
      return (this.projectId == null ? that.getProjectId() == null : this.projectId.equals(that.getProjectId()))
          && (this.instanceId == null ? that.getInstanceId() == null : this.instanceId.equals(that.getInstanceId()))
          && (this.databaseId == null ? that.getDatabaseId() == null : this.databaseId.equals(that.getDatabaseId()))
          && (this.host == null ? that.getHost() == null : this.host.equals(that.getHost()))
          && (this.emulatorHost == null ? that.getEmulatorHost() == null : this.emulatorHost.equals(that.getEmulatorHost()))
          && (this.commitDeadline == null ? that.getCommitDeadline() == null : this.commitDeadline.equals(that.getCommitDeadline()))
          && (this.maxCumulativeBackoff == null ? that.getMaxCumulativeBackoff() == null : this.maxCumulativeBackoff.equals(that.getMaxCumulativeBackoff()))
          && (this.serviceFactory == null ? that.getServiceFactory() == null : this.serviceFactory.equals(that.getServiceFactory()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (projectId == null) ? 0 : projectId.hashCode();
    h$ *= 1000003;
    h$ ^= (instanceId == null) ? 0 : instanceId.hashCode();
    h$ *= 1000003;
    h$ ^= (databaseId == null) ? 0 : databaseId.hashCode();
    h$ *= 1000003;
    h$ ^= (host == null) ? 0 : host.hashCode();
    h$ *= 1000003;
    h$ ^= (emulatorHost == null) ? 0 : emulatorHost.hashCode();
    h$ *= 1000003;
    h$ ^= (commitDeadline == null) ? 0 : commitDeadline.hashCode();
    h$ *= 1000003;
    h$ ^= (maxCumulativeBackoff == null) ? 0 : maxCumulativeBackoff.hashCode();
    h$ *= 1000003;
    h$ ^= (serviceFactory == null) ? 0 : serviceFactory.hashCode();
    return h$;
  }

  @Override
  SpannerConfig.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends SpannerConfig.Builder {
    private ValueProvider<String> projectId;
    private ValueProvider<String> instanceId;
    private ValueProvider<String> databaseId;
    private ValueProvider<String> host;
    private ValueProvider<String> emulatorHost;
    private ValueProvider<Duration> commitDeadline;
    private ValueProvider<Duration> maxCumulativeBackoff;
    private ServiceFactory<Spanner, SpannerOptions> serviceFactory;
    Builder() {
    }
    private Builder(SpannerConfig source) {
      this.projectId = source.getProjectId();
      this.instanceId = source.getInstanceId();
      this.databaseId = source.getDatabaseId();
      this.host = source.getHost();
      this.emulatorHost = source.getEmulatorHost();
      this.commitDeadline = source.getCommitDeadline();
      this.maxCumulativeBackoff = source.getMaxCumulativeBackoff();
      this.serviceFactory = source.getServiceFactory();
    }
    @Override
    SpannerConfig.Builder setProjectId(ValueProvider<String> projectId) {
      this.projectId = projectId;
      return this;
    }
    @Override
    SpannerConfig.Builder setInstanceId(ValueProvider<String> instanceId) {
      this.instanceId = instanceId;
      return this;
    }
    @Override
    SpannerConfig.Builder setDatabaseId(ValueProvider<String> databaseId) {
      this.databaseId = databaseId;
      return this;
    }
    @Override
    SpannerConfig.Builder setHost(ValueProvider<String> host) {
      this.host = host;
      return this;
    }
    @Override
    SpannerConfig.Builder setEmulatorHost(ValueProvider<String> emulatorHost) {
      this.emulatorHost = emulatorHost;
      return this;
    }
    @Override
    SpannerConfig.Builder setCommitDeadline(ValueProvider<Duration> commitDeadline) {
      this.commitDeadline = commitDeadline;
      return this;
    }
    @Override
    SpannerConfig.Builder setMaxCumulativeBackoff(ValueProvider<Duration> maxCumulativeBackoff) {
      this.maxCumulativeBackoff = maxCumulativeBackoff;
      return this;
    }
    @Override
    SpannerConfig.Builder setServiceFactory(ServiceFactory<Spanner, SpannerOptions> serviceFactory) {
      this.serviceFactory = serviceFactory;
      return this;
    }
    @Override
    public SpannerConfig build() {
      return new AutoValue_SpannerConfig(
          this.projectId,
          this.instanceId,
          this.databaseId,
          this.host,
          this.emulatorHost,
          this.commitDeadline,
          this.maxCumulativeBackoff,
          this.serviceFactory);
    }
  }

}
