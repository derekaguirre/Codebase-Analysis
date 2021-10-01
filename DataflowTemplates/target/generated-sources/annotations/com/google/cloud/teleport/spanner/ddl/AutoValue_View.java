package com.google.cloud.teleport.spanner.ddl;

import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_View extends View {

  private final String name;

  private final String query;

  private final View.SqlSecurity security;

  private AutoValue_View(
      @Nullable String name,
      @Nullable String query,
      @Nullable View.SqlSecurity security) {
    this.name = name;
    this.query = query;
    this.security = security;
  }

  @Nullable
  @Override
  public String name() {
    return name;
  }

  @Nullable
  @Override
  public String query() {
    return query;
  }

  @Nullable
  @Override
  public View.SqlSecurity security() {
    return security;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof View) {
      View that = (View) o;
      return (this.name == null ? that.name() == null : this.name.equals(that.name()))
          && (this.query == null ? that.query() == null : this.query.equals(that.query()))
          && (this.security == null ? that.security() == null : this.security.equals(that.security()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (name == null) ? 0 : name.hashCode();
    h$ *= 1000003;
    h$ ^= (query == null) ? 0 : query.hashCode();
    h$ *= 1000003;
    h$ ^= (security == null) ? 0 : security.hashCode();
    return h$;
  }

  private static final long serialVersionUID = 1L;

  @Override
  public View.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends View.Builder {
    private String name;
    private String query;
    private View.SqlSecurity security;
    Builder() {
    }
    private Builder(View source) {
      this.name = source.name();
      this.query = source.query();
      this.security = source.security();
    }
    @Override
    public View.Builder name(String name) {
      this.name = name;
      return this;
    }
    @Override
    @Nullable public String name() {
      return name;
    }
    @Override
    public View.Builder query(String query) {
      this.query = query;
      return this;
    }
    @Override
    @Nullable public String query() {
      return query;
    }
    @Override
    public View.Builder security(View.SqlSecurity security) {
      this.security = security;
      return this;
    }
    @Override
    @Nullable public View.SqlSecurity security() {
      return security;
    }
    @Override
    public View build() {
      return new AutoValue_View(
          this.name,
          this.query,
          this.security);
    }
  }

}
