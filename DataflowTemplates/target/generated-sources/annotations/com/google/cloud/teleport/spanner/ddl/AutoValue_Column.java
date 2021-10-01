package com.google.cloud.teleport.spanner.ddl;

import com.google.cloud.teleport.spanner.common.Type;
import com.google.common.collect.ImmutableList;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Column extends Column {

  private final String name;

  private final Type type;

  private final ImmutableList<String> columnOptions;

  private final Integer size;

  private final boolean notNull;

  private final boolean isGenerated;

  private final String generationExpression;

  private final boolean isStored;

  private AutoValue_Column(
      String name,
      Type type,
      ImmutableList<String> columnOptions,
      @Nullable Integer size,
      boolean notNull,
      boolean isGenerated,
      String generationExpression,
      boolean isStored) {
    this.name = name;
    this.type = type;
    this.columnOptions = columnOptions;
    this.size = size;
    this.notNull = notNull;
    this.isGenerated = isGenerated;
    this.generationExpression = generationExpression;
    this.isStored = isStored;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public Type type() {
    return type;
  }

  @Override
  public ImmutableList<String> columnOptions() {
    return columnOptions;
  }

  @Nullable
  @Override
  public Integer size() {
    return size;
  }

  @Override
  public boolean notNull() {
    return notNull;
  }

  @Override
  public boolean isGenerated() {
    return isGenerated;
  }

  @Override
  public String generationExpression() {
    return generationExpression;
  }

  @Override
  public boolean isStored() {
    return isStored;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Column) {
      Column that = (Column) o;
      return this.name.equals(that.name())
          && this.type.equals(that.type())
          && this.columnOptions.equals(that.columnOptions())
          && (this.size == null ? that.size() == null : this.size.equals(that.size()))
          && this.notNull == that.notNull()
          && this.isGenerated == that.isGenerated()
          && this.generationExpression.equals(that.generationExpression())
          && this.isStored == that.isStored();
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= type.hashCode();
    h$ *= 1000003;
    h$ ^= columnOptions.hashCode();
    h$ *= 1000003;
    h$ ^= (size == null) ? 0 : size.hashCode();
    h$ *= 1000003;
    h$ ^= notNull ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= isGenerated ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= generationExpression.hashCode();
    h$ *= 1000003;
    h$ ^= isStored ? 1231 : 1237;
    return h$;
  }

  private static final long serialVersionUID = -1752579370892365181L;

  @Override
  public Column.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends Column.Builder {
    private String name;
    private Type type;
    private ImmutableList<String> columnOptions;
    private Integer size;
    private Boolean notNull;
    private Boolean isGenerated;
    private String generationExpression;
    private Boolean isStored;
    Builder() {
    }
    private Builder(Column source) {
      this.name = source.name();
      this.type = source.type();
      this.columnOptions = source.columnOptions();
      this.size = source.size();
      this.notNull = source.notNull();
      this.isGenerated = source.isGenerated();
      this.generationExpression = source.generationExpression();
      this.isStored = source.isStored();
    }
    @Override
    Column.Builder name(String name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public Column.Builder type(Type type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    public Column.Builder columnOptions(ImmutableList<String> columnOptions) {
      if (columnOptions == null) {
        throw new NullPointerException("Null columnOptions");
      }
      this.columnOptions = columnOptions;
      return this;
    }
    @Override
    public Column.Builder size(Integer size) {
      this.size = size;
      return this;
    }
    @Override
    public Column.Builder notNull(boolean notNull) {
      this.notNull = notNull;
      return this;
    }
    @Override
    public Column.Builder isGenerated(boolean isGenerated) {
      this.isGenerated = isGenerated;
      return this;
    }
    @Override
    public Column.Builder generationExpression(String generationExpression) {
      if (generationExpression == null) {
        throw new NullPointerException("Null generationExpression");
      }
      this.generationExpression = generationExpression;
      return this;
    }
    @Override
    public Column.Builder isStored(boolean isStored) {
      this.isStored = isStored;
      return this;
    }
    @Override
    public Column autoBuild() {
      String missing = "";
      if (this.name == null) {
        missing += " name";
      }
      if (this.type == null) {
        missing += " type";
      }
      if (this.columnOptions == null) {
        missing += " columnOptions";
      }
      if (this.notNull == null) {
        missing += " notNull";
      }
      if (this.isGenerated == null) {
        missing += " isGenerated";
      }
      if (this.generationExpression == null) {
        missing += " generationExpression";
      }
      if (this.isStored == null) {
        missing += " isStored";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Column(
          this.name,
          this.type,
          this.columnOptions,
          this.size,
          this.notNull,
          this.isGenerated,
          this.generationExpression,
          this.isStored);
    }
  }

}
