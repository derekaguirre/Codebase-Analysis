package com.google.cloud.teleport.spanner.ddl;

import com.google.common.collect.ImmutableList;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ForeignKey extends ForeignKey {

  private final String name;

  private final String table;

  private final String referencedTable;

  private final ImmutableList<String> columns;

  private final ImmutableList<String> referencedColumns;

  private AutoValue_ForeignKey(
      String name,
      String table,
      String referencedTable,
      ImmutableList<String> columns,
      ImmutableList<String> referencedColumns) {
    this.name = name;
    this.table = table;
    this.referencedTable = referencedTable;
    this.columns = columns;
    this.referencedColumns = referencedColumns;
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
  String referencedTable() {
    return referencedTable;
  }

  @Override
  ImmutableList<String> columns() {
    return columns;
  }

  @Override
  ImmutableList<String> referencedColumns() {
    return referencedColumns;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ForeignKey) {
      ForeignKey that = (ForeignKey) o;
      return this.name.equals(that.name())
          && this.table.equals(that.table())
          && this.referencedTable.equals(that.referencedTable())
          && this.columns.equals(that.columns())
          && this.referencedColumns.equals(that.referencedColumns());
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
    h$ ^= referencedTable.hashCode();
    h$ *= 1000003;
    h$ ^= columns.hashCode();
    h$ *= 1000003;
    h$ ^= referencedColumns.hashCode();
    return h$;
  }

  private static final long serialVersionUID = 286089905L;

  static final class Builder extends ForeignKey.Builder {
    private String name;
    private String table;
    private String referencedTable;
    private ImmutableList.Builder<String> columnsBuilder$;
    private ImmutableList<String> columns;
    private ImmutableList.Builder<String> referencedColumnsBuilder$;
    private ImmutableList<String> referencedColumns;
    Builder() {
    }
    @Override
    public ForeignKey.Builder name(String name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public ForeignKey.Builder table(String table) {
      if (table == null) {
        throw new NullPointerException("Null table");
      }
      this.table = table;
      return this;
    }
    @Override
    public ForeignKey.Builder referencedTable(String referencedTable) {
      if (referencedTable == null) {
        throw new NullPointerException("Null referencedTable");
      }
      this.referencedTable = referencedTable;
      return this;
    }
    @Override
    public ImmutableList.Builder<String> columnsBuilder() {
      if (columnsBuilder$ == null) {
        columnsBuilder$ = ImmutableList.builder();
      }
      return columnsBuilder$;
    }
    @Override
    public ImmutableList.Builder<String> referencedColumnsBuilder() {
      if (referencedColumnsBuilder$ == null) {
        referencedColumnsBuilder$ = ImmutableList.builder();
      }
      return referencedColumnsBuilder$;
    }
    @Override
    public ForeignKey build() {
      if (columnsBuilder$ != null) {
        this.columns = columnsBuilder$.build();
      } else if (this.columns == null) {
        this.columns = ImmutableList.of();
      }
      if (referencedColumnsBuilder$ != null) {
        this.referencedColumns = referencedColumnsBuilder$.build();
      } else if (this.referencedColumns == null) {
        this.referencedColumns = ImmutableList.of();
      }
      String missing = "";
      if (this.name == null) {
        missing += " name";
      }
      if (this.table == null) {
        missing += " table";
      }
      if (this.referencedTable == null) {
        missing += " referencedTable";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_ForeignKey(
          this.name,
          this.table,
          this.referencedTable,
          this.columns,
          this.referencedColumns);
    }
  }

}
