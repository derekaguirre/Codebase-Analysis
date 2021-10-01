package com.google.cloud.teleport.spanner;

import javax.annotation.Generated;
import org.apache.beam.sdk.io.FileIO;
import org.apache.beam.sdk.io.range.OffsetRange;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_FileShard extends FileShard {

  private final String tableName;

  private final FileIO.ReadableFile file;

  private final OffsetRange range;

  AutoValue_FileShard(
      String tableName,
      FileIO.ReadableFile file,
      OffsetRange range) {
    if (tableName == null) {
      throw new NullPointerException("Null tableName");
    }
    this.tableName = tableName;
    if (file == null) {
      throw new NullPointerException("Null file");
    }
    this.file = file;
    if (range == null) {
      throw new NullPointerException("Null range");
    }
    this.range = range;
  }

  @Override
  String getTableName() {
    return tableName;
  }

  @Override
  FileIO.ReadableFile getFile() {
    return file;
  }

  @Override
  OffsetRange getRange() {
    return range;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FileShard) {
      FileShard that = (FileShard) o;
      return this.tableName.equals(that.getTableName())
          && this.file.equals(that.getFile())
          && this.range.equals(that.getRange());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= tableName.hashCode();
    h$ *= 1000003;
    h$ ^= file.hashCode();
    h$ *= 1000003;
    h$ ^= range.hashCode();
    return h$;
  }

}
