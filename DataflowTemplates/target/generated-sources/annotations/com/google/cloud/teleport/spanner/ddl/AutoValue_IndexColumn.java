package com.google.cloud.teleport.spanner.ddl;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_IndexColumn extends IndexColumn {

  private final String name;

  private final IndexColumn.Order order;

  AutoValue_IndexColumn(
      String name,
      IndexColumn.Order order) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    if (order == null) {
      throw new NullPointerException("Null order");
    }
    this.order = order;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public IndexColumn.Order order() {
    return order;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof IndexColumn) {
      IndexColumn that = (IndexColumn) o;
      return this.name.equals(that.name())
          && this.order.equals(that.order());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= order.hashCode();
    return h$;
  }

  private static final long serialVersionUID = -976796114694704550L;

}
