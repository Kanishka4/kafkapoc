/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.kafkapoc.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class FinalProductPriceAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 9056911858016819417L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FinalProductPriceAvro\",\"namespace\":\"com.example.kafkapoc.avro\",\"fields\":[{\"name\":\"sku\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"details\",\"type\":\"string\"},{\"name\":\"price\",\"type\":\"string\"},{\"name\":\"directDiscount\",\"type\":\"string\"},{\"name\":\"promoDiscount\",\"type\":\"string\"},{\"name\":\"effectivePrice\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<FinalProductPriceAvro> ENCODER =
      new BinaryMessageEncoder<FinalProductPriceAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<FinalProductPriceAvro> DECODER =
      new BinaryMessageDecoder<FinalProductPriceAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<FinalProductPriceAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<FinalProductPriceAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<FinalProductPriceAvro>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this FinalProductPriceAvro to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a FinalProductPriceAvro from a ByteBuffer. */
  public static FinalProductPriceAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence sku;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence details;
  @Deprecated public java.lang.CharSequence price;
  @Deprecated public java.lang.CharSequence directDiscount;
  @Deprecated public java.lang.CharSequence promoDiscount;
  @Deprecated public java.lang.CharSequence effectivePrice;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FinalProductPriceAvro() {}

  /**
   * All-args constructor.
   * @param sku The new value for sku
   * @param name The new value for name
   * @param details The new value for details
   * @param price The new value for price
   * @param directDiscount The new value for directDiscount
   * @param promoDiscount The new value for promoDiscount
   * @param effectivePrice The new value for effectivePrice
   */
  public FinalProductPriceAvro(java.lang.CharSequence sku, java.lang.CharSequence name, java.lang.CharSequence details, java.lang.CharSequence price, java.lang.CharSequence directDiscount, java.lang.CharSequence promoDiscount, java.lang.CharSequence effectivePrice) {
    this.sku = sku;
    this.name = name;
    this.details = details;
    this.price = price;
    this.directDiscount = directDiscount;
    this.promoDiscount = promoDiscount;
    this.effectivePrice = effectivePrice;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return sku;
    case 1: return name;
    case 2: return details;
    case 3: return price;
    case 4: return directDiscount;
    case 5: return promoDiscount;
    case 6: return effectivePrice;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: sku = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: details = (java.lang.CharSequence)value$; break;
    case 3: price = (java.lang.CharSequence)value$; break;
    case 4: directDiscount = (java.lang.CharSequence)value$; break;
    case 5: promoDiscount = (java.lang.CharSequence)value$; break;
    case 6: effectivePrice = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'sku' field.
   * @return The value of the 'sku' field.
   */
  public java.lang.CharSequence getSku() {
    return sku;
  }

  /**
   * Sets the value of the 'sku' field.
   * @param value the value to set.
   */
  public void setSku(java.lang.CharSequence value) {
    this.sku = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'details' field.
   * @return The value of the 'details' field.
   */
  public java.lang.CharSequence getDetails() {
    return details;
  }

  /**
   * Sets the value of the 'details' field.
   * @param value the value to set.
   */
  public void setDetails(java.lang.CharSequence value) {
    this.details = value;
  }

  /**
   * Gets the value of the 'price' field.
   * @return The value of the 'price' field.
   */
  public java.lang.CharSequence getPrice() {
    return price;
  }

  /**
   * Sets the value of the 'price' field.
   * @param value the value to set.
   */
  public void setPrice(java.lang.CharSequence value) {
    this.price = value;
  }

  /**
   * Gets the value of the 'directDiscount' field.
   * @return The value of the 'directDiscount' field.
   */
  public java.lang.CharSequence getDirectDiscount() {
    return directDiscount;
  }

  /**
   * Sets the value of the 'directDiscount' field.
   * @param value the value to set.
   */
  public void setDirectDiscount(java.lang.CharSequence value) {
    this.directDiscount = value;
  }

  /**
   * Gets the value of the 'promoDiscount' field.
   * @return The value of the 'promoDiscount' field.
   */
  public java.lang.CharSequence getPromoDiscount() {
    return promoDiscount;
  }

  /**
   * Sets the value of the 'promoDiscount' field.
   * @param value the value to set.
   */
  public void setPromoDiscount(java.lang.CharSequence value) {
    this.promoDiscount = value;
  }

  /**
   * Gets the value of the 'effectivePrice' field.
   * @return The value of the 'effectivePrice' field.
   */
  public java.lang.CharSequence getEffectivePrice() {
    return effectivePrice;
  }

  /**
   * Sets the value of the 'effectivePrice' field.
   * @param value the value to set.
   */
  public void setEffectivePrice(java.lang.CharSequence value) {
    this.effectivePrice = value;
  }

  /**
   * Creates a new FinalProductPriceAvro RecordBuilder.
   * @return A new FinalProductPriceAvro RecordBuilder
   */
  public static com.example.kafkapoc.avro.FinalProductPriceAvro.Builder newBuilder() {
    return new com.example.kafkapoc.avro.FinalProductPriceAvro.Builder();
  }

  /**
   * Creates a new FinalProductPriceAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new FinalProductPriceAvro RecordBuilder
   */
  public static com.example.kafkapoc.avro.FinalProductPriceAvro.Builder newBuilder(com.example.kafkapoc.avro.FinalProductPriceAvro.Builder other) {
    return new com.example.kafkapoc.avro.FinalProductPriceAvro.Builder(other);
  }

  /**
   * Creates a new FinalProductPriceAvro RecordBuilder by copying an existing FinalProductPriceAvro instance.
   * @param other The existing instance to copy.
   * @return A new FinalProductPriceAvro RecordBuilder
   */
  public static com.example.kafkapoc.avro.FinalProductPriceAvro.Builder newBuilder(com.example.kafkapoc.avro.FinalProductPriceAvro other) {
    return new com.example.kafkapoc.avro.FinalProductPriceAvro.Builder(other);
  }

  /**
   * RecordBuilder for FinalProductPriceAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FinalProductPriceAvro>
    implements org.apache.avro.data.RecordBuilder<FinalProductPriceAvro> {

    private java.lang.CharSequence sku;
    private java.lang.CharSequence name;
    private java.lang.CharSequence details;
    private java.lang.CharSequence price;
    private java.lang.CharSequence directDiscount;
    private java.lang.CharSequence promoDiscount;
    private java.lang.CharSequence effectivePrice;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.kafkapoc.avro.FinalProductPriceAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.sku)) {
        this.sku = data().deepCopy(fields()[0].schema(), other.sku);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.details)) {
        this.details = data().deepCopy(fields()[2].schema(), other.details);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.price)) {
        this.price = data().deepCopy(fields()[3].schema(), other.price);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.directDiscount)) {
        this.directDiscount = data().deepCopy(fields()[4].schema(), other.directDiscount);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.promoDiscount)) {
        this.promoDiscount = data().deepCopy(fields()[5].schema(), other.promoDiscount);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.effectivePrice)) {
        this.effectivePrice = data().deepCopy(fields()[6].schema(), other.effectivePrice);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing FinalProductPriceAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.kafkapoc.avro.FinalProductPriceAvro other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.sku)) {
        this.sku = data().deepCopy(fields()[0].schema(), other.sku);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.details)) {
        this.details = data().deepCopy(fields()[2].schema(), other.details);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.price)) {
        this.price = data().deepCopy(fields()[3].schema(), other.price);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.directDiscount)) {
        this.directDiscount = data().deepCopy(fields()[4].schema(), other.directDiscount);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.promoDiscount)) {
        this.promoDiscount = data().deepCopy(fields()[5].schema(), other.promoDiscount);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.effectivePrice)) {
        this.effectivePrice = data().deepCopy(fields()[6].schema(), other.effectivePrice);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'sku' field.
      * @return The value.
      */
    public java.lang.CharSequence getSku() {
      return sku;
    }

    /**
      * Sets the value of the 'sku' field.
      * @param value The value of 'sku'.
      * @return This builder.
      */
    public com.example.kafkapoc.avro.FinalProductPriceAvro.Builder setSku(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.sku = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'sku' field has been set.
      * @return True if the 'sku' field has been set, false otherwise.
      */
    public boolean hasSku() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'sku' field.
      * @return This builder.
      */
    public com.example.kafkapoc.avro.FinalProductPriceAvro.Builder clearSku() {
      sku = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.example.kafkapoc.avro.FinalProductPriceAvro.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.example.kafkapoc.avro.FinalProductPriceAvro.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'details' field.
      * @return The value.
      */
    public java.lang.CharSequence getDetails() {
      return details;
    }

    /**
      * Sets the value of the 'details' field.
      * @param value The value of 'details'.
      * @return This builder.
      */
    public com.example.kafkapoc.avro.FinalProductPriceAvro.Builder setDetails(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.details = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'details' field has been set.
      * @return True if the 'details' field has been set, false otherwise.
      */
    public boolean hasDetails() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'details' field.
      * @return This builder.
      */
    public com.example.kafkapoc.avro.FinalProductPriceAvro.Builder clearDetails() {
      details = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'price' field.
      * @return The value.
      */
    public java.lang.CharSequence getPrice() {
      return price;
    }

    /**
      * Sets the value of the 'price' field.
      * @param value The value of 'price'.
      * @return This builder.
      */
    public com.example.kafkapoc.avro.FinalProductPriceAvro.Builder setPrice(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.price = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'price' field has been set.
      * @return True if the 'price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'price' field.
      * @return This builder.
      */
    public com.example.kafkapoc.avro.FinalProductPriceAvro.Builder clearPrice() {
      price = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'directDiscount' field.
      * @return The value.
      */
    public java.lang.CharSequence getDirectDiscount() {
      return directDiscount;
    }

    /**
      * Sets the value of the 'directDiscount' field.
      * @param value The value of 'directDiscount'.
      * @return This builder.
      */
    public com.example.kafkapoc.avro.FinalProductPriceAvro.Builder setDirectDiscount(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.directDiscount = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'directDiscount' field has been set.
      * @return True if the 'directDiscount' field has been set, false otherwise.
      */
    public boolean hasDirectDiscount() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'directDiscount' field.
      * @return This builder.
      */
    public com.example.kafkapoc.avro.FinalProductPriceAvro.Builder clearDirectDiscount() {
      directDiscount = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'promoDiscount' field.
      * @return The value.
      */
    public java.lang.CharSequence getPromoDiscount() {
      return promoDiscount;
    }

    /**
      * Sets the value of the 'promoDiscount' field.
      * @param value The value of 'promoDiscount'.
      * @return This builder.
      */
    public com.example.kafkapoc.avro.FinalProductPriceAvro.Builder setPromoDiscount(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.promoDiscount = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'promoDiscount' field has been set.
      * @return True if the 'promoDiscount' field has been set, false otherwise.
      */
    public boolean hasPromoDiscount() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'promoDiscount' field.
      * @return This builder.
      */
    public com.example.kafkapoc.avro.FinalProductPriceAvro.Builder clearPromoDiscount() {
      promoDiscount = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'effectivePrice' field.
      * @return The value.
      */
    public java.lang.CharSequence getEffectivePrice() {
      return effectivePrice;
    }

    /**
      * Sets the value of the 'effectivePrice' field.
      * @param value The value of 'effectivePrice'.
      * @return This builder.
      */
    public com.example.kafkapoc.avro.FinalProductPriceAvro.Builder setEffectivePrice(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.effectivePrice = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'effectivePrice' field has been set.
      * @return True if the 'effectivePrice' field has been set, false otherwise.
      */
    public boolean hasEffectivePrice() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'effectivePrice' field.
      * @return This builder.
      */
    public com.example.kafkapoc.avro.FinalProductPriceAvro.Builder clearEffectivePrice() {
      effectivePrice = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public FinalProductPriceAvro build() {
      try {
        FinalProductPriceAvro record = new FinalProductPriceAvro();
        record.sku = fieldSetFlags()[0] ? this.sku : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.details = fieldSetFlags()[2] ? this.details : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.price = fieldSetFlags()[3] ? this.price : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.directDiscount = fieldSetFlags()[4] ? this.directDiscount : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.promoDiscount = fieldSetFlags()[5] ? this.promoDiscount : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.effectivePrice = fieldSetFlags()[6] ? this.effectivePrice : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<FinalProductPriceAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<FinalProductPriceAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<FinalProductPriceAvro>
    READER$ = (org.apache.avro.io.DatumReader<FinalProductPriceAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
