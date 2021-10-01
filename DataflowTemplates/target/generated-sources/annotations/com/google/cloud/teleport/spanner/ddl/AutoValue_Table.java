package com.google.cloud.teleport.spanner.ddl;

import com.google.common.collect.ImmutableList;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Table extends Table {

  private final String name;

  private final String interleaveInParent;

  private final ImmutableList<IndexColumn> primaryKeys;

  private final boolean onDeleteCascade;

  private final ImmutableList<Column> columns;

  private final ImmutableList<String> indexes;

  private final ImmutableList<String> foreignKeys;

  private final ImmutableList<String> checkConstraints;

  private AutoValue_Table(
      @Nullable String name,
      @Nullable String interleaveInParent,
      ImmutableList<IndexColumn> primaryKeys,
      boolean onDeleteCascade,
      ImmutableList<Column> columns,
      ImmutableList<String> indexes,
      ImmutableList<String> foreignKeys,
      ImmutableList<String> checkConstraints) {
    this.name = name;
    this.interleaveInParent = interleaveInParent;
    this.primaryKeys = primaryKeys;
    this.onDeleteCascade = onDeleteCascade;
    this.columns = columns;
    this.indexes = indexes;
    this.foreignKeys = foreignKeys;
    this.checkConstraints = checkConstraints;
  }

  @Nullable
  @Override
  public String name() {
    return name;
  }

  @Nullable
  @Override
  public String interleaveInParent() {
    return interleaveInParent;
  }

  @Override
  public ImmutableList<IndexColumn> primaryKeys() {
    return primaryKeys;
  }

  @Override
  public boolean onDeleteCascade() {
    return onDeleteCascade;
  }

  @Override
  public ImmutableList<Column> columns() {
    return columns;
  }

  @Override
  public ImmutableList<String> indexes() {
    return indexes;
  }

  @Override
  public ImmutableList<String> foreignKeys() {
    return foreignKeys;
  }

  @Override
  public ImmutableList<String> checkConstraints() {
    return checkConstraints;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Table) {
      Table that = (Table) o;
      return (this.name == null ? that.name() == null : this.name.equals(that.name()))
          && (this.interleaveInParent == null ? that.interleaveInParent() == null : this.interleaveInParent.equals(that.interleaveInParent()))
          && this.primaryKeys.equals(that.primaryKeys())
          && this.onDeleteCascade == that.onDeleteCascade()
          && this.columns.equals(that.columns())
          && this.indexes.equals(that.indexes())
          && this.foreignKeys.equals(that.foreignKeys())
          && this.checkConstraints.equals(that.checkConstraints());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (name == null) ? 0 : name.hashCode();
    h$ *= 1000003;
    h$ ^= (interleaveInParent == null) ? 0 : interleaveInParent.hashCode();
    h$ *= 1000003;
    h$ ^= primaryKeys.hashCode();
    h$ *= 1000003;
    h$ ^= onDeleteCascade ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= columns.hashCode();
    h$ *= 1000003;
    h$ ^= indexes.hashCode();
    h$ *= 1000003;
    h$ ^= foreignKeys.hashCode();
    h$ *= 1000003;
    h$ ^= checkConstraints.hashCode();
    return h$;
  }

  private static final long serialVersionUID = 1295819360440139056L;

  @Override
  public Table.Builder autoToBuilder() {
    return new Builder(this);
  }

  static final class Builder extends Table.Builder {
    private String name;
    private String interleaveInParent;
    private ImmutableList<IndexColumn> primaryKeys;
    private Boolean onDeleteCascade;
    private ImmutableList<Column> columns;
    private ImmutableList<String> indexes;
    private ImmutableList<String> foreignKeys;
    private ImmutableList<String> checkConstraints;
    Builder() {
    }
    private Builder(Table source) {
      this.name = source.name();
      this.interleaveInParent = source.interleaveInParent();
      this.primaryKeys = source.primaryKeys();
      this.onDeleteCascade = source.onDeleteCascade();
      this.columns = source.columns();
      this.indexes = source.indexes();
      this.foreignKeys = source.foreignKeys();
      this.checkConstraints = source.checkConstraints();
    }
    @Override
    public Table.Builder name(String name) {
      this.name = name;
      return this;
    }
    @Override
    @Nullable public String name() {
      return name;
    }
    @Override
    public Table.Builder interleaveInParent(String interleaveInParent) {
      this.interleaveInParent = interleaveInParent;
      return this;
    }
    @Override
    Table.Builder primaryKeys(ImmutableList<IndexColumn> primaryKeys) {
      if (primaryKeys == null) {
        throw new NullPointerException("Null primaryKeys");
      }
      this.primaryKeys = primaryKeys;
      return this;
    }
    @Override
    Table.Builder onDeleteCascade(boolean onDeleteCascade) {
      this.onDeleteCascade = onDeleteCascade;
      return this;
    }
    @Override
    Table.Builder columns(ImmutableList<Column> columns) {
      if (columns == null) {
        throw new NullPointerException("Null columns");
      }
      this.columns = columns;
      return this;
    }
    @Override
    ImmutableList<Column> columns() {
      if (columns == null) {
        throw new IllegalStateException("Property \"columns\" has not been set");
      }
      return columns;
    }
    @Override
    public Table.Builder indexes(ImmutableList<String> indexes) {
      if (indexes == null) {
        throw new NullPointerException("Null indexes");
      }
      this.indexes = indexes;
      return this;
    }
    @Override
    public Table.Builder foreignKeys(ImmutableList<String> foreignKeys) {
      if (foreignKeys == null) {
        throw new NullPointerException("Null foreignKeys");
      }
      this.foreignKeys = foreignKeys;
      return this;
    }
    @Override
    public Table.Builder checkConstraints(ImmutableList<String> checkConstraints) {
      if (checkConstraints == null) {
        throw new NullPointerException("Null checkConstraints");
      }
      this.checkConstraints = checkConstraints;
      return this;
    }
    @Override
    Table autoBuild() {
      String missing = "";
      if (this.primaryKeys == null) {
        missing += " primaryKeys";
      }
      if (this.onDeleteCascade == null) {
        missing += " onDeleteCascade";
      }
      if (this.columns == null) {
        missing += " columns";
      }
      if (this.indexes == null) {
        missing += " indexes";
      }
      if (this.foreignKeys == null) {
        missing += " foreignKeys";
      }
      if (this.checkConstraints == null) {
        missing += " checkConstraints";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Table(
          this.name,
          this.interleaveInParent,
          this.primaryKeys,
          this.onDeleteCascade,
          this.columns,
          this.indexes,
          this.foreignKeys,
          this.checkConstraints);
    }
  }

}
