// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package org.dataaccess.protobuf;

/**
 * Protobuf type {@code Address}
 */
public final class Address extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Address)
    AddressOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Address.newBuilder() to construct.
  private Address(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Address() {
    country_ = "";
    city_ = "";
    zip_ = "";
    street_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Address();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Address(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            country_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            city_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            zip_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            street_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.dataaccess.protobuf.Protobuf.internal_static_Address_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.dataaccess.protobuf.Protobuf.internal_static_Address_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.dataaccess.protobuf.Address.class, org.dataaccess.protobuf.Address.Builder.class);
  }

  public static final int COUNTRY_FIELD_NUMBER = 1;
  private volatile java.lang.Object country_;
  /**
   * <code>string country = 1;</code>
   * @return The country.
   */
  @java.lang.Override
  public java.lang.String getCountry() {
    java.lang.Object ref = country_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      country_ = s;
      return s;
    }
  }
  /**
   * <code>string country = 1;</code>
   * @return The bytes for country.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCountryBytes() {
    java.lang.Object ref = country_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      country_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CITY_FIELD_NUMBER = 2;
  private volatile java.lang.Object city_;
  /**
   * <code>string city = 2;</code>
   * @return The city.
   */
  @java.lang.Override
  public java.lang.String getCity() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      city_ = s;
      return s;
    }
  }
  /**
   * <code>string city = 2;</code>
   * @return The bytes for city.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCityBytes() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      city_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ZIP_FIELD_NUMBER = 3;
  private volatile java.lang.Object zip_;
  /**
   * <code>string zip = 3;</code>
   * @return The zip.
   */
  @java.lang.Override
  public java.lang.String getZip() {
    java.lang.Object ref = zip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zip_ = s;
      return s;
    }
  }
  /**
   * <code>string zip = 3;</code>
   * @return The bytes for zip.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getZipBytes() {
    java.lang.Object ref = zip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      zip_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STREET_FIELD_NUMBER = 4;
  private volatile java.lang.Object street_;
  /**
   * <code>string street = 4;</code>
   * @return The street.
   */
  @java.lang.Override
  public java.lang.String getStreet() {
    java.lang.Object ref = street_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      street_ = s;
      return s;
    }
  }
  /**
   * <code>string street = 4;</code>
   * @return The bytes for street.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStreetBytes() {
    java.lang.Object ref = street_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      street_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(country_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, country_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(city_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, city_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zip_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, zip_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(street_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, street_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(country_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, country_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(city_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, city_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zip_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, zip_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(street_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, street_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.dataaccess.protobuf.Address)) {
      return super.equals(obj);
    }
    org.dataaccess.protobuf.Address other = (org.dataaccess.protobuf.Address) obj;

    if (!getCountry()
        .equals(other.getCountry())) return false;
    if (!getCity()
        .equals(other.getCity())) return false;
    if (!getZip()
        .equals(other.getZip())) return false;
    if (!getStreet()
        .equals(other.getStreet())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COUNTRY_FIELD_NUMBER;
    hash = (53 * hash) + getCountry().hashCode();
    hash = (37 * hash) + CITY_FIELD_NUMBER;
    hash = (53 * hash) + getCity().hashCode();
    hash = (37 * hash) + ZIP_FIELD_NUMBER;
    hash = (53 * hash) + getZip().hashCode();
    hash = (37 * hash) + STREET_FIELD_NUMBER;
    hash = (53 * hash) + getStreet().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.dataaccess.protobuf.Address parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.dataaccess.protobuf.Address parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.dataaccess.protobuf.Address parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.dataaccess.protobuf.Address parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.dataaccess.protobuf.Address parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.dataaccess.protobuf.Address parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.dataaccess.protobuf.Address parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.dataaccess.protobuf.Address parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.dataaccess.protobuf.Address parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.dataaccess.protobuf.Address parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.dataaccess.protobuf.Address parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.dataaccess.protobuf.Address parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.dataaccess.protobuf.Address prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Address}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Address)
      org.dataaccess.protobuf.AddressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.dataaccess.protobuf.Protobuf.internal_static_Address_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.dataaccess.protobuf.Protobuf.internal_static_Address_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.dataaccess.protobuf.Address.class, org.dataaccess.protobuf.Address.Builder.class);
    }

    // Construct using org.dataaccess.protobuf.Address.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      country_ = "";

      city_ = "";

      zip_ = "";

      street_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.dataaccess.protobuf.Protobuf.internal_static_Address_descriptor;
    }

    @java.lang.Override
    public org.dataaccess.protobuf.Address getDefaultInstanceForType() {
      return org.dataaccess.protobuf.Address.getDefaultInstance();
    }

    @java.lang.Override
    public org.dataaccess.protobuf.Address build() {
      org.dataaccess.protobuf.Address result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.dataaccess.protobuf.Address buildPartial() {
      org.dataaccess.protobuf.Address result = new org.dataaccess.protobuf.Address(this);
      result.country_ = country_;
      result.city_ = city_;
      result.zip_ = zip_;
      result.street_ = street_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.dataaccess.protobuf.Address) {
        return mergeFrom((org.dataaccess.protobuf.Address)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.dataaccess.protobuf.Address other) {
      if (other == org.dataaccess.protobuf.Address.getDefaultInstance()) return this;
      if (!other.getCountry().isEmpty()) {
        country_ = other.country_;
        onChanged();
      }
      if (!other.getCity().isEmpty()) {
        city_ = other.city_;
        onChanged();
      }
      if (!other.getZip().isEmpty()) {
        zip_ = other.zip_;
        onChanged();
      }
      if (!other.getStreet().isEmpty()) {
        street_ = other.street_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.dataaccess.protobuf.Address parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.dataaccess.protobuf.Address) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object country_ = "";
    /**
     * <code>string country = 1;</code>
     * @return The country.
     */
    public java.lang.String getCountry() {
      java.lang.Object ref = country_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        country_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string country = 1;</code>
     * @return The bytes for country.
     */
    public com.google.protobuf.ByteString
        getCountryBytes() {
      java.lang.Object ref = country_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        country_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string country = 1;</code>
     * @param value The country to set.
     * @return This builder for chaining.
     */
    public Builder setCountry(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      country_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string country = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCountry() {
      
      country_ = getDefaultInstance().getCountry();
      onChanged();
      return this;
    }
    /**
     * <code>string country = 1;</code>
     * @param value The bytes for country to set.
     * @return This builder for chaining.
     */
    public Builder setCountryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      country_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object city_ = "";
    /**
     * <code>string city = 2;</code>
     * @return The city.
     */
    public java.lang.String getCity() {
      java.lang.Object ref = city_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        city_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string city = 2;</code>
     * @return The bytes for city.
     */
    public com.google.protobuf.ByteString
        getCityBytes() {
      java.lang.Object ref = city_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        city_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string city = 2;</code>
     * @param value The city to set.
     * @return This builder for chaining.
     */
    public Builder setCity(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      city_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string city = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCity() {
      
      city_ = getDefaultInstance().getCity();
      onChanged();
      return this;
    }
    /**
     * <code>string city = 2;</code>
     * @param value The bytes for city to set.
     * @return This builder for chaining.
     */
    public Builder setCityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      city_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object zip_ = "";
    /**
     * <code>string zip = 3;</code>
     * @return The zip.
     */
    public java.lang.String getZip() {
      java.lang.Object ref = zip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string zip = 3;</code>
     * @return The bytes for zip.
     */
    public com.google.protobuf.ByteString
        getZipBytes() {
      java.lang.Object ref = zip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string zip = 3;</code>
     * @param value The zip to set.
     * @return This builder for chaining.
     */
    public Builder setZip(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      zip_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string zip = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearZip() {
      
      zip_ = getDefaultInstance().getZip();
      onChanged();
      return this;
    }
    /**
     * <code>string zip = 3;</code>
     * @param value The bytes for zip to set.
     * @return This builder for chaining.
     */
    public Builder setZipBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      zip_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object street_ = "";
    /**
     * <code>string street = 4;</code>
     * @return The street.
     */
    public java.lang.String getStreet() {
      java.lang.Object ref = street_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        street_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string street = 4;</code>
     * @return The bytes for street.
     */
    public com.google.protobuf.ByteString
        getStreetBytes() {
      java.lang.Object ref = street_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        street_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string street = 4;</code>
     * @param value The street to set.
     * @return This builder for chaining.
     */
    public Builder setStreet(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      street_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string street = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStreet() {
      
      street_ = getDefaultInstance().getStreet();
      onChanged();
      return this;
    }
    /**
     * <code>string street = 4;</code>
     * @param value The bytes for street to set.
     * @return This builder for chaining.
     */
    public Builder setStreetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      street_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Address)
  }

  // @@protoc_insertion_point(class_scope:Address)
  private static final org.dataaccess.protobuf.Address DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.dataaccess.protobuf.Address();
  }

  public static org.dataaccess.protobuf.Address getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Address>
      PARSER = new com.google.protobuf.AbstractParser<Address>() {
    @java.lang.Override
    public Address parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Address(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Address> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Address> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.dataaccess.protobuf.Address getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
