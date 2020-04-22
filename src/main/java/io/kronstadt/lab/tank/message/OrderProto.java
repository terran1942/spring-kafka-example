// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package io.kronstadt.lab.tank.message;

public final class OrderProto {
  private OrderProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OrderOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Order)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string symbol = 1;</code>
     * @return The symbol.
     */
    java.lang.String getSymbol();
    /**
     * <code>string symbol = 1;</code>
     * @return The bytes for symbol.
     */
    com.google.protobuf.ByteString
        getSymbolBytes();

    /**
     * <code>double price = 2;</code>
     * @return The price.
     */
    double getPrice();

    /**
     * <code>double quantity = 3;</code>
     * @return The quantity.
     */
    double getQuantity();

    /**
     * <code>.Order.Side side = 4;</code>
     * @return The enum numeric value on the wire for side.
     */
    int getSideValue();
    /**
     * <code>.Order.Side side = 4;</code>
     * @return The side.
     */
    io.kronstadt.lab.tank.message.OrderProto.Order.Side getSide();
  }
  /**
   * Protobuf type {@code Order}
   */
  public  static final class Order extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Order)
      OrderOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Order.newBuilder() to construct.
    private Order(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Order() {
      symbol_ = "";
      side_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Order();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Order(
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

              symbol_ = s;
              break;
            }
            case 17: {

              price_ = input.readDouble();
              break;
            }
            case 25: {

              quantity_ = input.readDouble();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();

              side_ = rawValue;
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
      return io.kronstadt.lab.tank.message.OrderProto.internal_static_Order_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kronstadt.lab.tank.message.OrderProto.internal_static_Order_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kronstadt.lab.tank.message.OrderProto.Order.class, io.kronstadt.lab.tank.message.OrderProto.Order.Builder.class);
    }

    /**
     * Protobuf enum {@code Order.Side}
     */
    public enum Side
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>ASK = 0;</code>
       */
      ASK(0),
      /**
       * <code>BID = 1;</code>
       */
      BID(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>ASK = 0;</code>
       */
      public static final int ASK_VALUE = 0;
      /**
       * <code>BID = 1;</code>
       */
      public static final int BID_VALUE = 1;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Side valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Side forNumber(int value) {
        switch (value) {
          case 0: return ASK;
          case 1: return BID;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Side>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Side> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Side>() {
              public Side findValueByNumber(int number) {
                return Side.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return io.kronstadt.lab.tank.message.OrderProto.Order.getDescriptor().getEnumTypes().get(0);
      }

      private static final Side[] VALUES = values();

      public static Side valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Side(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:Order.Side)
    }

    public static final int SYMBOL_FIELD_NUMBER = 1;
    private volatile java.lang.Object symbol_;
    /**
     * <code>string symbol = 1;</code>
     * @return The symbol.
     */
    public java.lang.String getSymbol() {
      java.lang.Object ref = symbol_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        symbol_ = s;
        return s;
      }
    }
    /**
     * <code>string symbol = 1;</code>
     * @return The bytes for symbol.
     */
    public com.google.protobuf.ByteString
        getSymbolBytes() {
      java.lang.Object ref = symbol_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        symbol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PRICE_FIELD_NUMBER = 2;
    private double price_;
    /**
     * <code>double price = 2;</code>
     * @return The price.
     */
    public double getPrice() {
      return price_;
    }

    public static final int QUANTITY_FIELD_NUMBER = 3;
    private double quantity_;
    /**
     * <code>double quantity = 3;</code>
     * @return The quantity.
     */
    public double getQuantity() {
      return quantity_;
    }

    public static final int SIDE_FIELD_NUMBER = 4;
    private int side_;
    /**
     * <code>.Order.Side side = 4;</code>
     * @return The enum numeric value on the wire for side.
     */
    public int getSideValue() {
      return side_;
    }
    /**
     * <code>.Order.Side side = 4;</code>
     * @return The side.
     */
    public io.kronstadt.lab.tank.message.OrderProto.Order.Side getSide() {
      @SuppressWarnings("deprecation")
      io.kronstadt.lab.tank.message.OrderProto.Order.Side result = io.kronstadt.lab.tank.message.OrderProto.Order.Side.valueOf(side_);
      return result == null ? io.kronstadt.lab.tank.message.OrderProto.Order.Side.UNRECOGNIZED : result;
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
      if (!getSymbolBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, symbol_);
      }
      if (price_ != 0D) {
        output.writeDouble(2, price_);
      }
      if (quantity_ != 0D) {
        output.writeDouble(3, quantity_);
      }
      if (side_ != io.kronstadt.lab.tank.message.OrderProto.Order.Side.ASK.getNumber()) {
        output.writeEnum(4, side_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getSymbolBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, symbol_);
      }
      if (price_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, price_);
      }
      if (quantity_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, quantity_);
      }
      if (side_ != io.kronstadt.lab.tank.message.OrderProto.Order.Side.ASK.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, side_);
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
      if (!(obj instanceof io.kronstadt.lab.tank.message.OrderProto.Order)) {
        return super.equals(obj);
      }
      io.kronstadt.lab.tank.message.OrderProto.Order other = (io.kronstadt.lab.tank.message.OrderProto.Order) obj;

      if (!getSymbol()
          .equals(other.getSymbol())) return false;
      if (java.lang.Double.doubleToLongBits(getPrice())
          != java.lang.Double.doubleToLongBits(
              other.getPrice())) return false;
      if (java.lang.Double.doubleToLongBits(getQuantity())
          != java.lang.Double.doubleToLongBits(
              other.getQuantity())) return false;
      if (side_ != other.side_) return false;
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
      hash = (37 * hash) + SYMBOL_FIELD_NUMBER;
      hash = (53 * hash) + getSymbol().hashCode();
      hash = (37 * hash) + PRICE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getPrice()));
      hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getQuantity()));
      hash = (37 * hash) + SIDE_FIELD_NUMBER;
      hash = (53 * hash) + side_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kronstadt.lab.tank.message.OrderProto.Order parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.kronstadt.lab.tank.message.OrderProto.Order parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.kronstadt.lab.tank.message.OrderProto.Order parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.kronstadt.lab.tank.message.OrderProto.Order parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.kronstadt.lab.tank.message.OrderProto.Order parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.kronstadt.lab.tank.message.OrderProto.Order parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.kronstadt.lab.tank.message.OrderProto.Order parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.kronstadt.lab.tank.message.OrderProto.Order parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.kronstadt.lab.tank.message.OrderProto.Order parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.kronstadt.lab.tank.message.OrderProto.Order parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.kronstadt.lab.tank.message.OrderProto.Order parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.kronstadt.lab.tank.message.OrderProto.Order parseFrom(
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
    public static Builder newBuilder(io.kronstadt.lab.tank.message.OrderProto.Order prototype) {
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
     * Protobuf type {@code Order}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Order)
        io.kronstadt.lab.tank.message.OrderProto.OrderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.kronstadt.lab.tank.message.OrderProto.internal_static_Order_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kronstadt.lab.tank.message.OrderProto.internal_static_Order_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kronstadt.lab.tank.message.OrderProto.Order.class, io.kronstadt.lab.tank.message.OrderProto.Order.Builder.class);
      }

      // Construct using io.kronstadt.lab.tank.message.OrderProto.Order.newBuilder()
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
        symbol_ = "";

        price_ = 0D;

        quantity_ = 0D;

        side_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.kronstadt.lab.tank.message.OrderProto.internal_static_Order_descriptor;
      }

      @java.lang.Override
      public io.kronstadt.lab.tank.message.OrderProto.Order getDefaultInstanceForType() {
        return io.kronstadt.lab.tank.message.OrderProto.Order.getDefaultInstance();
      }

      @java.lang.Override
      public io.kronstadt.lab.tank.message.OrderProto.Order build() {
        io.kronstadt.lab.tank.message.OrderProto.Order result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kronstadt.lab.tank.message.OrderProto.Order buildPartial() {
        io.kronstadt.lab.tank.message.OrderProto.Order result = new io.kronstadt.lab.tank.message.OrderProto.Order(this);
        result.symbol_ = symbol_;
        result.price_ = price_;
        result.quantity_ = quantity_;
        result.side_ = side_;
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
        if (other instanceof io.kronstadt.lab.tank.message.OrderProto.Order) {
          return mergeFrom((io.kronstadt.lab.tank.message.OrderProto.Order)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kronstadt.lab.tank.message.OrderProto.Order other) {
        if (other == io.kronstadt.lab.tank.message.OrderProto.Order.getDefaultInstance()) return this;
        if (!other.getSymbol().isEmpty()) {
          symbol_ = other.symbol_;
          onChanged();
        }
        if (other.getPrice() != 0D) {
          setPrice(other.getPrice());
        }
        if (other.getQuantity() != 0D) {
          setQuantity(other.getQuantity());
        }
        if (other.side_ != 0) {
          setSideValue(other.getSideValue());
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
        io.kronstadt.lab.tank.message.OrderProto.Order parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kronstadt.lab.tank.message.OrderProto.Order) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object symbol_ = "";
      /**
       * <code>string symbol = 1;</code>
       * @return The symbol.
       */
      public java.lang.String getSymbol() {
        java.lang.Object ref = symbol_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          symbol_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string symbol = 1;</code>
       * @return The bytes for symbol.
       */
      public com.google.protobuf.ByteString
          getSymbolBytes() {
        java.lang.Object ref = symbol_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          symbol_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string symbol = 1;</code>
       * @param value The symbol to set.
       * @return This builder for chaining.
       */
      public Builder setSymbol(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        symbol_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string symbol = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSymbol() {
        
        symbol_ = getDefaultInstance().getSymbol();
        onChanged();
        return this;
      }
      /**
       * <code>string symbol = 1;</code>
       * @param value The bytes for symbol to set.
       * @return This builder for chaining.
       */
      public Builder setSymbolBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        symbol_ = value;
        onChanged();
        return this;
      }

      private double price_ ;
      /**
       * <code>double price = 2;</code>
       * @return The price.
       */
      public double getPrice() {
        return price_;
      }
      /**
       * <code>double price = 2;</code>
       * @param value The price to set.
       * @return This builder for chaining.
       */
      public Builder setPrice(double value) {
        
        price_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double price = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPrice() {
        
        price_ = 0D;
        onChanged();
        return this;
      }

      private double quantity_ ;
      /**
       * <code>double quantity = 3;</code>
       * @return The quantity.
       */
      public double getQuantity() {
        return quantity_;
      }
      /**
       * <code>double quantity = 3;</code>
       * @param value The quantity to set.
       * @return This builder for chaining.
       */
      public Builder setQuantity(double value) {
        
        quantity_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double quantity = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuantity() {
        
        quantity_ = 0D;
        onChanged();
        return this;
      }

      private int side_ = 0;
      /**
       * <code>.Order.Side side = 4;</code>
       * @return The enum numeric value on the wire for side.
       */
      public int getSideValue() {
        return side_;
      }
      /**
       * <code>.Order.Side side = 4;</code>
       * @param value The enum numeric value on the wire for side to set.
       * @return This builder for chaining.
       */
      public Builder setSideValue(int value) {
        side_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Order.Side side = 4;</code>
       * @return The side.
       */
      public io.kronstadt.lab.tank.message.OrderProto.Order.Side getSide() {
        @SuppressWarnings("deprecation")
        io.kronstadt.lab.tank.message.OrderProto.Order.Side result = io.kronstadt.lab.tank.message.OrderProto.Order.Side.valueOf(side_);
        return result == null ? io.kronstadt.lab.tank.message.OrderProto.Order.Side.UNRECOGNIZED : result;
      }
      /**
       * <code>.Order.Side side = 4;</code>
       * @param value The side to set.
       * @return This builder for chaining.
       */
      public Builder setSide(io.kronstadt.lab.tank.message.OrderProto.Order.Side value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        side_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Order.Side side = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSide() {
        
        side_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Order)
    }

    // @@protoc_insertion_point(class_scope:Order)
    private static final io.kronstadt.lab.tank.message.OrderProto.Order DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.kronstadt.lab.tank.message.OrderProto.Order();
    }

    public static io.kronstadt.lab.tank.message.OrderProto.Order getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Order>
        PARSER = new com.google.protobuf.AbstractParser<Order>() {
      @java.lang.Override
      public Order parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Order(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Order> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Order> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kronstadt.lab.tank.message.OrderProto.Order getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Order_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Order_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013order.proto\"m\n\005Order\022\016\n\006symbol\030\001 \001(\t\022\r" +
      "\n\005price\030\002 \001(\001\022\020\n\010quantity\030\003 \001(\001\022\031\n\004side\030" +
      "\004 \001(\0162\013.Order.Side\"\030\n\004Side\022\007\n\003ASK\020\000\022\007\n\003B" +
      "ID\020\001B+\n\035io.kronstadt.lab.tank.messageB\nO" +
      "rderProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Order_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Order_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Order_descriptor,
        new java.lang.String[] { "Symbol", "Price", "Quantity", "Side", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}