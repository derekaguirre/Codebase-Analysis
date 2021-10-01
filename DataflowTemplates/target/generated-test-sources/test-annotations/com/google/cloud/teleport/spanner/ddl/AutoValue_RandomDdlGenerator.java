package com.google.cloud.teleport.spanner.ddl;

import java.util.Arrays;
import java.util.Random;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_RandomDdlGenerator extends RandomDdlGenerator {

  private final Random random;

  private final int arrayChance;

  private final int[] maxBranchPerLevel;

  private final int maxPkComponents;

  private final int maxColumns;

  private final int maxIdLength;

  private final int maxIndex;

  private final int maxForeignKeys;

  private final boolean enableGeneratedColumns;

  private final boolean enableCheckConstraints;

  private final int maxViews;

  private AutoValue_RandomDdlGenerator(
      Random random,
      int arrayChance,
      int[] maxBranchPerLevel,
      int maxPkComponents,
      int maxColumns,
      int maxIdLength,
      int maxIndex,
      int maxForeignKeys,
      boolean enableGeneratedColumns,
      boolean enableCheckConstraints,
      int maxViews) {
    this.random = random;
    this.arrayChance = arrayChance;
    this.maxBranchPerLevel = maxBranchPerLevel;
    this.maxPkComponents = maxPkComponents;
    this.maxColumns = maxColumns;
    this.maxIdLength = maxIdLength;
    this.maxIndex = maxIndex;
    this.maxForeignKeys = maxForeignKeys;
    this.enableGeneratedColumns = enableGeneratedColumns;
    this.enableCheckConstraints = enableCheckConstraints;
    this.maxViews = maxViews;
  }

  @Override
  public Random getRandom() {
    return random;
  }

  @Override
  public int getArrayChance() {
    return arrayChance;
  }

  @Override
  public int[] getMaxBranchPerLevel() {
    return maxBranchPerLevel;
  }

  @Override
  public int getMaxPkComponents() {
    return maxPkComponents;
  }

  @Override
  public int getMaxColumns() {
    return maxColumns;
  }

  @Override
  public int getMaxIdLength() {
    return maxIdLength;
  }

  @Override
  public int getMaxIndex() {
    return maxIndex;
  }

  @Override
  public int getMaxForeignKeys() {
    return maxForeignKeys;
  }

  @Override
  public boolean getEnableGeneratedColumns() {
    return enableGeneratedColumns;
  }

  @Override
  public boolean getEnableCheckConstraints() {
    return enableCheckConstraints;
  }

  @Override
  public int getMaxViews() {
    return maxViews;
  }

  @Override
  public String toString() {
    return "RandomDdlGenerator{"
        + "random=" + random + ", "
        + "arrayChance=" + arrayChance + ", "
        + "maxBranchPerLevel=" + Arrays.toString(maxBranchPerLevel) + ", "
        + "maxPkComponents=" + maxPkComponents + ", "
        + "maxColumns=" + maxColumns + ", "
        + "maxIdLength=" + maxIdLength + ", "
        + "maxIndex=" + maxIndex + ", "
        + "maxForeignKeys=" + maxForeignKeys + ", "
        + "enableGeneratedColumns=" + enableGeneratedColumns + ", "
        + "enableCheckConstraints=" + enableCheckConstraints + ", "
        + "maxViews=" + maxViews
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RandomDdlGenerator) {
      RandomDdlGenerator that = (RandomDdlGenerator) o;
      return this.random.equals(that.getRandom())
          && this.arrayChance == that.getArrayChance()
          && Arrays.equals(this.maxBranchPerLevel, (that instanceof AutoValue_RandomDdlGenerator) ? ((AutoValue_RandomDdlGenerator) that).maxBranchPerLevel : that.getMaxBranchPerLevel())
          && this.maxPkComponents == that.getMaxPkComponents()
          && this.maxColumns == that.getMaxColumns()
          && this.maxIdLength == that.getMaxIdLength()
          && this.maxIndex == that.getMaxIndex()
          && this.maxForeignKeys == that.getMaxForeignKeys()
          && this.enableGeneratedColumns == that.getEnableGeneratedColumns()
          && this.enableCheckConstraints == that.getEnableCheckConstraints()
          && this.maxViews == that.getMaxViews();
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= random.hashCode();
    h$ *= 1000003;
    h$ ^= arrayChance;
    h$ *= 1000003;
    h$ ^= Arrays.hashCode(maxBranchPerLevel);
    h$ *= 1000003;
    h$ ^= maxPkComponents;
    h$ *= 1000003;
    h$ ^= maxColumns;
    h$ *= 1000003;
    h$ ^= maxIdLength;
    h$ *= 1000003;
    h$ ^= maxIndex;
    h$ *= 1000003;
    h$ ^= maxForeignKeys;
    h$ *= 1000003;
    h$ ^= enableGeneratedColumns ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= enableCheckConstraints ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= maxViews;
    return h$;
  }

  @Override
  public RandomDdlGenerator.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends RandomDdlGenerator.Builder {
    private Random random;
    private Integer arrayChance;
    private int[] maxBranchPerLevel;
    private Integer maxPkComponents;
    private Integer maxColumns;
    private Integer maxIdLength;
    private Integer maxIndex;
    private Integer maxForeignKeys;
    private Boolean enableGeneratedColumns;
    private Boolean enableCheckConstraints;
    private Integer maxViews;
    Builder() {
    }
    private Builder(RandomDdlGenerator source) {
      this.random = source.getRandom();
      this.arrayChance = source.getArrayChance();
      this.maxBranchPerLevel = source.getMaxBranchPerLevel();
      this.maxPkComponents = source.getMaxPkComponents();
      this.maxColumns = source.getMaxColumns();
      this.maxIdLength = source.getMaxIdLength();
      this.maxIndex = source.getMaxIndex();
      this.maxForeignKeys = source.getMaxForeignKeys();
      this.enableGeneratedColumns = source.getEnableGeneratedColumns();
      this.enableCheckConstraints = source.getEnableCheckConstraints();
      this.maxViews = source.getMaxViews();
    }
    @Override
    public RandomDdlGenerator.Builder setRandom(Random random) {
      if (random == null) {
        throw new NullPointerException("Null random");
      }
      this.random = random;
      return this;
    }
    @Override
    public RandomDdlGenerator.Builder setArrayChance(int arrayChance) {
      this.arrayChance = arrayChance;
      return this;
    }
    @Override
    public RandomDdlGenerator.Builder setMaxBranchPerLevel(int[] maxBranchPerLevel) {
      if (maxBranchPerLevel == null) {
        throw new NullPointerException("Null maxBranchPerLevel");
      }
      this.maxBranchPerLevel = maxBranchPerLevel;
      return this;
    }
    @Override
    public RandomDdlGenerator.Builder setMaxPkComponents(int maxPkComponents) {
      this.maxPkComponents = maxPkComponents;
      return this;
    }
    @Override
    public RandomDdlGenerator.Builder setMaxColumns(int maxColumns) {
      this.maxColumns = maxColumns;
      return this;
    }
    @Override
    public RandomDdlGenerator.Builder setMaxIdLength(int maxIdLength) {
      this.maxIdLength = maxIdLength;
      return this;
    }
    @Override
    public RandomDdlGenerator.Builder setMaxIndex(int maxIndex) {
      this.maxIndex = maxIndex;
      return this;
    }
    @Override
    public RandomDdlGenerator.Builder setMaxForeignKeys(int maxForeignKeys) {
      this.maxForeignKeys = maxForeignKeys;
      return this;
    }
    @Override
    public RandomDdlGenerator.Builder setEnableGeneratedColumns(boolean enableGeneratedColumns) {
      this.enableGeneratedColumns = enableGeneratedColumns;
      return this;
    }
    @Override
    public RandomDdlGenerator.Builder setEnableCheckConstraints(boolean enableCheckConstraints) {
      this.enableCheckConstraints = enableCheckConstraints;
      return this;
    }
    @Override
    public RandomDdlGenerator.Builder setMaxViews(int maxViews) {
      this.maxViews = maxViews;
      return this;
    }
    @Override
    public RandomDdlGenerator build() {
      String missing = "";
      if (this.random == null) {
        missing += " random";
      }
      if (this.arrayChance == null) {
        missing += " arrayChance";
      }
      if (this.maxBranchPerLevel == null) {
        missing += " maxBranchPerLevel";
      }
      if (this.maxPkComponents == null) {
        missing += " maxPkComponents";
      }
      if (this.maxColumns == null) {
        missing += " maxColumns";
      }
      if (this.maxIdLength == null) {
        missing += " maxIdLength";
      }
      if (this.maxIndex == null) {
        missing += " maxIndex";
      }
      if (this.maxForeignKeys == null) {
        missing += " maxForeignKeys";
      }
      if (this.enableGeneratedColumns == null) {
        missing += " enableGeneratedColumns";
      }
      if (this.enableCheckConstraints == null) {
        missing += " enableCheckConstraints";
      }
      if (this.maxViews == null) {
        missing += " maxViews";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_RandomDdlGenerator(
          this.random,
          this.arrayChance,
          this.maxBranchPerLevel,
          this.maxPkComponents,
          this.maxColumns,
          this.maxIdLength,
          this.maxIndex,
          this.maxForeignKeys,
          this.enableGeneratedColumns,
          this.enableCheckConstraints,
          this.maxViews);
    }
  }

}
