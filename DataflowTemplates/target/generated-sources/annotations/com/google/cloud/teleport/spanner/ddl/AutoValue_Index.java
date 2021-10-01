package com.google.cloud.teleport.spanner.ddl;

import com.google.common.collect.ImmutableList;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Index extends Index {

  private final String name;

  private final String table;

  private final ImmutableList<IndexColumn> indexColumns;

  private final boolean unique;

  private final boolean nullFiltered;

  private final String interleaveIn;

  private AutoValue_Index(
      String name,
      String table,
      ImmutableList<IndexColumn> indexColumns,
      boolean unique,
      boolean nullFiltered,
      @Nullable String interleaveIn) {
    this.name = name;
    this.table = table;
    this.indexColumns = indexColumns;
    this.unique = unique;
    this.nullFiltered = nullFiltered;
    this.interleaveIn = interleaveIn;
  }

  @Override
  String name() {
    return name;
  }

  @Override
  String table() {
    return table;
  }

  @Override
  ImmutableList<IndexColumn> indexColumns() {
    return indexColumns;
  }

  @Override
  boolean unique() {
    return unique;
  }

  @Override
  boolean nullFiltered() {
    return nullFiltered;
  }

  @Nullable
  @Override
  String interleaveIn() {
    return interleaveIn;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Index) {
      Index that = (Index) o;
      return this.name.equals(that.name())
          && this.table.equals(that.table())
          && this.indexColumns.equals(that.indexColumns())
          && this.unique == that.unique()
          && this.nullFiltered == that.nullFiltered()
          && (this.interleaveIn == null ? that.interleaveIn() == null : this.interleaveIn.equals(that.interleaveIn()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= table.hashCode();
    h$ *= 1000003;
    h$ ^= indexColumns.hashCode();
    h$ *= 1000003;
    h$ ^= unique ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= nullFiltered ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= (interleaveIn == null) ? 0 : interleaveIn.hashCode();
    return h$;
  }

  private static final long serialVersionUID = 7435575480487550039L;

  @Override
  Index.Builder autoToBuilder() {
    return new Builder(this);
  }

  static final class Builder extends Index.Builder {
    private String name;
    private String table;
    private ImmutableList<IndexColumn> indexColumns;
    private Boolean unique;
    private Boolean nullFiltered;
    private String interleaveIn;
    Builder() {
    }
    private Builder(Index source) {
      this.name = source.name();
      this.table = source.table();
      this.indexColumns = source.indexColumns();
      this.unique = source.unique();
      this.nullFiltered = source.nullFiltered();
      this.interleaveIn = source.interleaveIn();
    }
    @Override
    public Index.Builder name(String name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public Index.Builder table(String table) {
      if (table == null) {
        throw new NullPointerException("Null table");
      }
      this.table = table;
      return this;
    }
    @Override
    Index.Builder indexColumns(ImmutableList<IndexColumn> indexColumns) {
      if (indexColumns == null) {
        throw new NullPointerException("Null indexColumns");
      }
      this.indexColumns = indexColumns;
      return this;
    }
    @Override
    public Index.Builder unique(boolean unique) {
      this.unique = unique;
      return this;
    }
    @Override
    public Index.Builder nullFiltered(boolean nullFiltered) {
      this.nullFiltered = nullFiltered;
      return this;
    }
    @Override
    public Index.Builder interleaveIn(String interleaveIn) {
      this.interleaveIn = interleaveIn;
      return this;
    }
    @Override
    Index autoBuild() {
      String missing = "";
      if (this.name == null) {
        missing += " name";
      }
      if (this.table == null) {
        missing += " table";
      }
      if (this.indexColumns == null) {
        missing += " indexColumns";
      }
      if (this.unique == null) {
        missing += " unique";
      }
      if (this.nullFiltered == null) {
        missing += " nullFiltered";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Index(
          this.name,
          this.table,
          this.indexColumns,
          this.unique,
          this.nullFiltered,
          this.interleaveIn);
    }
  }

}
