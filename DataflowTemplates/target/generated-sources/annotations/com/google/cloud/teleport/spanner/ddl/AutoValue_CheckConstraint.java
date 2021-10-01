package com.google.cloud.teleport.spanner.ddl;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CheckConstraint extends CheckConstraint {

  private final String name;

  private final String expression;

  private AutoValue_CheckConstraint(
      String name,
      String expression) {
    this.name = name;
    this.expression = expression;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public String expression() {
    return expression;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CheckConstraint) {
      CheckConstraint that = (CheckConstraint) o;
      return this.name.equals(that.name())
          && this.expression.equals(that.expression());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= expression.hashCode();
    return h$;
  }

  private static final long serialVersionUID = 286089906L;

  @Override
  public CheckConstraint.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends CheckConstraint.Builder {
    private String name;
    private String expression;
    Builder() {
    }
    private Builder(CheckConstraint source) {
      this.name = source.name();
      this.expression = source.expression();
    }
    @Override
    public CheckConstraint.Builder name(String name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public CheckConstraint.Builder expression(String expression) {
      if (expression == null) {
        throw new NullPointerException("Null expression");
      }
      this.expression = expression;
      return this;
    }
    @Override
    public CheckConstraint build() {
      String missing = "";
      if (this.name == null) {
        missing += " name";
      }
      if (this.expression == null) {
        missing += " expression";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_CheckConstraint(
          this.name,
          this.expression);
    }
  }

}
