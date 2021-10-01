package org.apache.beam.sdk.io.gcp.spanner;

import com.google.cloud.spanner.KeySet;
import com.google.cloud.spanner.PartitionOptions;
import com.google.cloud.spanner.Statement;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ReadOperation extends ReadOperation {

  private final Statement query;

  private final String table;

  private final String index;

  private final List<String> columns;

  private final KeySet keySet;

  private final PartitionOptions partitionOptions;

  private AutoValue_ReadOperation(
      @Nullable Statement query,
      @Nullable String table,
      @Nullable String index,
      @Nullable List<String> columns,
      @Nullable KeySet keySet,
      @Nullable PartitionOptions partitionOptions) {
    this.query = query;
    this.table = table;
    this.index = index;
    this.columns = columns;
    this.keySet = keySet;
    this.partitionOptions = partitionOptions;
  }

  @Nullable
  @Override
  public Statement getQuery() {
    return query;
  }

  @Nullable
  @Override
  public String getTable() {
    return table;
  }

  @Nullable
  @Override
  public String getIndex() {
    return index;
  }

  @Nullable
  @Override
  public List<String> getColumns() {
    return columns;
  }

  @Nullable
  @Override
  public KeySet getKeySet() {
    return keySet;
  }

  @Nullable
  @Override
  PartitionOptions getPartitionOptions() {
    return partitionOptions;
  }

  @Override
  public String toString() {
    return "ReadOperation{"
        + "query=" + query + ", "
        + "table=" + table + ", "
        + "index=" + index + ", "
        + "columns=" + columns + ", "
        + "keySet=" + keySet + ", "
        + "partitionOptions=" + partitionOptions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ReadOperation) {
      ReadOperation that = (ReadOperation) o;
      return (this.query == null ? that.getQuery() == null : this.query.equals(that.getQuery()))
          && (this.table == null ? that.getTable() == null : this.table.equals(that.getTable()))
          && (this.index == null ? that.getIndex() == null : this.index.equals(that.getIndex()))
          && (this.columns == null ? that.getColumns() == null : this.columns.equals(that.getColumns()))
          && (this.keySet == null ? that.getKeySet() == null : this.keySet.equals(that.getKeySet()))
          && (this.partitionOptions == null ? that.getPartitionOptions() == null : this.partitionOptions.equals(that.getPartitionOptions()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (query == null) ? 0 : query.hashCode();
    h$ *= 1000003;
    h$ ^= (table == null) ? 0 : table.hashCode();
    h$ *= 1000003;
    h$ ^= (index == null) ? 0 : index.hashCode();
    h$ *= 1000003;
    h$ ^= (columns == null) ? 0 : columns.hashCode();
    h$ *= 1000003;
    h$ ^= (keySet == null) ? 0 : keySet.hashCode();
    h$ *= 1000003;
    h$ ^= (partitionOptions == null) ? 0 : partitionOptions.hashCode();
    return h$;
  }

  @Override
  ReadOperation.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends ReadOperation.Builder {
    private Statement query;
    private String table;
    private String index;
    private List<String> columns;
    private KeySet keySet;
    private PartitionOptions partitionOptions;
    Builder() {
    }
    private Builder(ReadOperation source) {
      this.query = source.getQuery();
      this.table = source.getTable();
      this.index = source.getIndex();
      this.columns = source.getColumns();
      this.keySet = source.getKeySet();
      this.partitionOptions = source.getPartitionOptions();
    }
    @Override
    ReadOperation.Builder setQuery(Statement query) {
      this.query = query;
      return this;
    }
    @Override
    ReadOperation.Builder setTable(String table) {
      this.table = table;
      return this;
    }
    @Override
    ReadOperation.Builder setIndex(String index) {
      this.index = index;
      return this;
    }
    @Override
    ReadOperation.Builder setColumns(List<String> columns) {
      this.columns = columns;
      return this;
    }
    @Override
    ReadOperation.Builder setKeySet(KeySet keySet) {
      this.keySet = keySet;
      return this;
    }
    @Override
    ReadOperation.Builder setPartitionOptions(PartitionOptions partitionOptions) {
      this.partitionOptions = partitionOptions;
      return this;
    }
    @Override
    ReadOperation build() {
      return new AutoValue_ReadOperation(
          this.query,
          this.table,
          this.index,
          this.columns,
          this.keySet,
          this.partitionOptions);
    }
  }

}
