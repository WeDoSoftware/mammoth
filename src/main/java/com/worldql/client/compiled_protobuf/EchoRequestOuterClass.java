// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EchoRequest.proto

package com.worldql.client.compiled_protobuf;

public final class EchoRequestOuterClass {
  private EchoRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EchoRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EchoRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string payload = 1;</code>
     * @return The payload.
     */
    java.lang.String getPayload();
    /**
     * <code>string payload = 1;</code>
     * @return The bytes for payload.
     */
    com.google.protobuf.ByteString
        getPayloadBytes();

    /**
     * <code>int32 repeat = 2;</code>
     * @return The repeat.
     */
    int getRepeat();
  }
  /**
   * <pre>
   * Simple request which accepts a string payload and will return it using the same message multiplied by repeat.
   * </pre>
   *
   * Protobuf type {@code EchoRequest}
   */
  public static final class EchoRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EchoRequest)
      EchoRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EchoRequest.newBuilder() to construct.
    private EchoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EchoRequest() {
      payload_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EchoRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EchoRequest(
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

              payload_ = s;
              break;
            }
            case 16: {

              repeat_ = input.readInt32();
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
      return com.worldql.client.compiled_protobuf.EchoRequestOuterClass.internal_static_EchoRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.worldql.client.compiled_protobuf.EchoRequestOuterClass.internal_static_EchoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest.class, com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest.Builder.class);
    }

    public static final int PAYLOAD_FIELD_NUMBER = 1;
    private volatile java.lang.Object payload_;
    /**
     * <code>string payload = 1;</code>
     * @return The payload.
     */
    @java.lang.Override
    public java.lang.String getPayload() {
      java.lang.Object ref = payload_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        payload_ = s;
        return s;
      }
    }
    /**
     * <code>string payload = 1;</code>
     * @return The bytes for payload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPayloadBytes() {
      java.lang.Object ref = payload_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        payload_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REPEAT_FIELD_NUMBER = 2;
    private int repeat_;
    /**
     * <code>int32 repeat = 2;</code>
     * @return The repeat.
     */
    @java.lang.Override
    public int getRepeat() {
      return repeat_;
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
      if (!getPayloadBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, payload_);
      }
      if (repeat_ != 0) {
        output.writeInt32(2, repeat_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getPayloadBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, payload_);
      }
      if (repeat_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, repeat_);
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
      if (!(obj instanceof com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest)) {
        return super.equals(obj);
      }
      com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest other = (com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest) obj;

      if (!getPayload()
          .equals(other.getPayload())) return false;
      if (getRepeat()
          != other.getRepeat()) return false;
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
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
      hash = (37 * hash) + REPEAT_FIELD_NUMBER;
      hash = (53 * hash) + getRepeat();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest parseFrom(
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
    public static Builder newBuilder(com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest prototype) {
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
     * <pre>
     * Simple request which accepts a string payload and will return it using the same message multiplied by repeat.
     * </pre>
     *
     * Protobuf type {@code EchoRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EchoRequest)
        com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.worldql.client.compiled_protobuf.EchoRequestOuterClass.internal_static_EchoRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.worldql.client.compiled_protobuf.EchoRequestOuterClass.internal_static_EchoRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest.class, com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest.Builder.class);
      }

      // Construct using com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest.newBuilder()
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
        payload_ = "";

        repeat_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.worldql.client.compiled_protobuf.EchoRequestOuterClass.internal_static_EchoRequest_descriptor;
      }

      @java.lang.Override
      public com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest getDefaultInstanceForType() {
        return com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest.getDefaultInstance();
      }

      @java.lang.Override
      public com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest build() {
        com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest buildPartial() {
        com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest result = new com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest(this);
        result.payload_ = payload_;
        result.repeat_ = repeat_;
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
        if (other instanceof com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest) {
          return mergeFrom((com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest other) {
        if (other == com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest.getDefaultInstance()) return this;
        if (!other.getPayload().isEmpty()) {
          payload_ = other.payload_;
          onChanged();
        }
        if (other.getRepeat() != 0) {
          setRepeat(other.getRepeat());
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
        com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object payload_ = "";
      /**
       * <code>string payload = 1;</code>
       * @return The payload.
       */
      public java.lang.String getPayload() {
        java.lang.Object ref = payload_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          payload_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string payload = 1;</code>
       * @return The bytes for payload.
       */
      public com.google.protobuf.ByteString
          getPayloadBytes() {
        java.lang.Object ref = payload_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          payload_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string payload = 1;</code>
       * @param value The payload to set.
       * @return This builder for chaining.
       */
      public Builder setPayload(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        payload_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string payload = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPayload() {
        
        payload_ = getDefaultInstance().getPayload();
        onChanged();
        return this;
      }
      /**
       * <code>string payload = 1;</code>
       * @param value The bytes for payload to set.
       * @return This builder for chaining.
       */
      public Builder setPayloadBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        payload_ = value;
        onChanged();
        return this;
      }

      private int repeat_ ;
      /**
       * <code>int32 repeat = 2;</code>
       * @return The repeat.
       */
      @java.lang.Override
      public int getRepeat() {
        return repeat_;
      }
      /**
       * <code>int32 repeat = 2;</code>
       * @param value The repeat to set.
       * @return This builder for chaining.
       */
      public Builder setRepeat(int value) {
        
        repeat_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 repeat = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRepeat() {
        
        repeat_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EchoRequest)
    }

    // @@protoc_insertion_point(class_scope:EchoRequest)
    private static final com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest();
    }

    public static com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EchoRequest>
        PARSER = new com.google.protobuf.AbstractParser<EchoRequest>() {
      @java.lang.Override
      public EchoRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EchoRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EchoRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EchoRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.worldql.client.compiled_protobuf.EchoRequestOuterClass.EchoRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EchoRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EchoRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021EchoRequest.proto\".\n\013EchoRequest\022\017\n\007pa" +
      "yload\030\001 \001(\t\022\016\n\006repeat\030\002 \001(\005B&\n$com.world" +
      "ql.client.compiled_protobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EchoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EchoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EchoRequest_descriptor,
        new java.lang.String[] { "Payload", "Repeat", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
