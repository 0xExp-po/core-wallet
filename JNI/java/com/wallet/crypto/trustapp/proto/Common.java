// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Common.proto

package com.wallet.crypto.trustapp.proto;

public final class Common {
  private Common() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TW.Proto.Result)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Whether the operation was successful.
     * </pre>
     *
     * <code>bool success = 1;</code>
     */
    boolean getSuccess();

    /**
     * <pre>
     * Optional error message, only present if success is false.
     * </pre>
     *
     * <code>string error = 2;</code>
     */
    java.lang.String getError();
    /**
     * <pre>
     * Optional error message, only present if success is false.
     * </pre>
     *
     * <code>string error = 2;</code>
     */
    com.google.protobuf.ByteString
        getErrorBytes();

    /**
     * <pre>
     * Result objects, if any.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any objects = 3;</code>
     */
    java.util.List<com.google.protobuf.Any> 
        getObjectsList();
    /**
     * <pre>
     * Result objects, if any.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any objects = 3;</code>
     */
    com.google.protobuf.Any getObjects(int index);
    /**
     * <pre>
     * Result objects, if any.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any objects = 3;</code>
     */
    int getObjectsCount();
    /**
     * <pre>
     * Result objects, if any.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any objects = 3;</code>
     */
    java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
        getObjectsOrBuilderList();
    /**
     * <pre>
     * Result objects, if any.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any objects = 3;</code>
     */
    com.google.protobuf.AnyOrBuilder getObjectsOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Result type.
   * </pre>
   *
   * Protobuf type {@code TW.Proto.Result}
   */
  public  static final class Result extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TW.Proto.Result)
      ResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Result.newBuilder() to construct.
    private Result(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Result() {
      success_ = false;
      error_ = "";
      objects_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Result(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 8: {

              success_ = input.readBool();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              error_ = s;
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                objects_ = new java.util.ArrayList<com.google.protobuf.Any>();
                mutable_bitField0_ |= 0x00000004;
              }
              objects_.add(
                  input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          objects_ = java.util.Collections.unmodifiableList(objects_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wallet.crypto.trustapp.proto.Common.internal_static_TW_Proto_Result_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wallet.crypto.trustapp.proto.Common.internal_static_TW_Proto_Result_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wallet.crypto.trustapp.proto.Common.Result.class, com.wallet.crypto.trustapp.proto.Common.Result.Builder.class);
    }

    private int bitField0_;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private boolean success_;
    /**
     * <pre>
     * Whether the operation was successful.
     * </pre>
     *
     * <code>bool success = 1;</code>
     */
    public boolean getSuccess() {
      return success_;
    }

    public static final int ERROR_FIELD_NUMBER = 2;
    private volatile java.lang.Object error_;
    /**
     * <pre>
     * Optional error message, only present if success is false.
     * </pre>
     *
     * <code>string error = 2;</code>
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        error_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Optional error message, only present if success is false.
     * </pre>
     *
     * <code>string error = 2;</code>
     */
    public com.google.protobuf.ByteString
        getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OBJECTS_FIELD_NUMBER = 3;
    private java.util.List<com.google.protobuf.Any> objects_;
    /**
     * <pre>
     * Result objects, if any.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any objects = 3;</code>
     */
    public java.util.List<com.google.protobuf.Any> getObjectsList() {
      return objects_;
    }
    /**
     * <pre>
     * Result objects, if any.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any objects = 3;</code>
     */
    public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
        getObjectsOrBuilderList() {
      return objects_;
    }
    /**
     * <pre>
     * Result objects, if any.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any objects = 3;</code>
     */
    public int getObjectsCount() {
      return objects_.size();
    }
    /**
     * <pre>
     * Result objects, if any.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any objects = 3;</code>
     */
    public com.google.protobuf.Any getObjects(int index) {
      return objects_.get(index);
    }
    /**
     * <pre>
     * Result objects, if any.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any objects = 3;</code>
     */
    public com.google.protobuf.AnyOrBuilder getObjectsOrBuilder(
        int index) {
      return objects_.get(index);
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
      if (success_ != false) {
        output.writeBool(1, success_);
      }
      if (!getErrorBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, error_);
      }
      for (int i = 0; i < objects_.size(); i++) {
        output.writeMessage(3, objects_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (success_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, success_);
      }
      if (!getErrorBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, error_);
      }
      for (int i = 0; i < objects_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, objects_.get(i));
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
      if (!(obj instanceof com.wallet.crypto.trustapp.proto.Common.Result)) {
        return super.equals(obj);
      }
      com.wallet.crypto.trustapp.proto.Common.Result other = (com.wallet.crypto.trustapp.proto.Common.Result) obj;

      boolean result = true;
      result = result && (getSuccess()
          == other.getSuccess());
      result = result && getError()
          .equals(other.getError());
      result = result && getObjectsList()
          .equals(other.getObjectsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSuccess());
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
      if (getObjectsCount() > 0) {
        hash = (37 * hash) + OBJECTS_FIELD_NUMBER;
        hash = (53 * hash) + getObjectsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.wallet.crypto.trustapp.proto.Common.Result parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.wallet.crypto.trustapp.proto.Common.Result parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.wallet.crypto.trustapp.proto.Common.Result parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.wallet.crypto.trustapp.proto.Common.Result parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.wallet.crypto.trustapp.proto.Common.Result parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.wallet.crypto.trustapp.proto.Common.Result parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.wallet.crypto.trustapp.proto.Common.Result parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.wallet.crypto.trustapp.proto.Common.Result parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.wallet.crypto.trustapp.proto.Common.Result parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.wallet.crypto.trustapp.proto.Common.Result parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.wallet.crypto.trustapp.proto.Common.Result parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.wallet.crypto.trustapp.proto.Common.Result parseFrom(
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
    public static Builder newBuilder(com.wallet.crypto.trustapp.proto.Common.Result prototype) {
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
     * Result type.
     * </pre>
     *
     * Protobuf type {@code TW.Proto.Result}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TW.Proto.Result)
        com.wallet.crypto.trustapp.proto.Common.ResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.wallet.crypto.trustapp.proto.Common.internal_static_TW_Proto_Result_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.wallet.crypto.trustapp.proto.Common.internal_static_TW_Proto_Result_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.wallet.crypto.trustapp.proto.Common.Result.class, com.wallet.crypto.trustapp.proto.Common.Result.Builder.class);
      }

      // Construct using com.wallet.crypto.trustapp.proto.Common.Result.newBuilder()
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
          getObjectsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        success_ = false;

        error_ = "";

        if (objectsBuilder_ == null) {
          objects_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          objectsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.wallet.crypto.trustapp.proto.Common.internal_static_TW_Proto_Result_descriptor;
      }

      @java.lang.Override
      public com.wallet.crypto.trustapp.proto.Common.Result getDefaultInstanceForType() {
        return com.wallet.crypto.trustapp.proto.Common.Result.getDefaultInstance();
      }

      @java.lang.Override
      public com.wallet.crypto.trustapp.proto.Common.Result build() {
        com.wallet.crypto.trustapp.proto.Common.Result result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.wallet.crypto.trustapp.proto.Common.Result buildPartial() {
        com.wallet.crypto.trustapp.proto.Common.Result result = new com.wallet.crypto.trustapp.proto.Common.Result(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.success_ = success_;
        result.error_ = error_;
        if (objectsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            objects_ = java.util.Collections.unmodifiableList(objects_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.objects_ = objects_;
        } else {
          result.objects_ = objectsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.wallet.crypto.trustapp.proto.Common.Result) {
          return mergeFrom((com.wallet.crypto.trustapp.proto.Common.Result)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.wallet.crypto.trustapp.proto.Common.Result other) {
        if (other == com.wallet.crypto.trustapp.proto.Common.Result.getDefaultInstance()) return this;
        if (other.getSuccess() != false) {
          setSuccess(other.getSuccess());
        }
        if (!other.getError().isEmpty()) {
          error_ = other.error_;
          onChanged();
        }
        if (objectsBuilder_ == null) {
          if (!other.objects_.isEmpty()) {
            if (objects_.isEmpty()) {
              objects_ = other.objects_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureObjectsIsMutable();
              objects_.addAll(other.objects_);
            }
            onChanged();
          }
        } else {
          if (!other.objects_.isEmpty()) {
            if (objectsBuilder_.isEmpty()) {
              objectsBuilder_.dispose();
              objectsBuilder_ = null;
              objects_ = other.objects_;
              bitField0_ = (bitField0_ & ~0x00000004);
              objectsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getObjectsFieldBuilder() : null;
            } else {
              objectsBuilder_.addAllMessages(other.objects_);
            }
          }
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
        com.wallet.crypto.trustapp.proto.Common.Result parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.wallet.crypto.trustapp.proto.Common.Result) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean success_ ;
      /**
       * <pre>
       * Whether the operation was successful.
       * </pre>
       *
       * <code>bool success = 1;</code>
       */
      public boolean getSuccess() {
        return success_;
      }
      /**
       * <pre>
       * Whether the operation was successful.
       * </pre>
       *
       * <code>bool success = 1;</code>
       */
      public Builder setSuccess(boolean value) {
        
        success_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Whether the operation was successful.
       * </pre>
       *
       * <code>bool success = 1;</code>
       */
      public Builder clearSuccess() {
        
        success_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object error_ = "";
      /**
       * <pre>
       * Optional error message, only present if success is false.
       * </pre>
       *
       * <code>string error = 2;</code>
       */
      public java.lang.String getError() {
        java.lang.Object ref = error_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          error_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Optional error message, only present if success is false.
       * </pre>
       *
       * <code>string error = 2;</code>
       */
      public com.google.protobuf.ByteString
          getErrorBytes() {
        java.lang.Object ref = error_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          error_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Optional error message, only present if success is false.
       * </pre>
       *
       * <code>string error = 2;</code>
       */
      public Builder setError(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        error_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Optional error message, only present if success is false.
       * </pre>
       *
       * <code>string error = 2;</code>
       */
      public Builder clearError() {
        
        error_ = getDefaultInstance().getError();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Optional error message, only present if success is false.
       * </pre>
       *
       * <code>string error = 2;</code>
       */
      public Builder setErrorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        error_ = value;
        onChanged();
        return this;
      }

      private java.util.List<com.google.protobuf.Any> objects_ =
        java.util.Collections.emptyList();
      private void ensureObjectsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          objects_ = new java.util.ArrayList<com.google.protobuf.Any>(objects_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> objectsBuilder_;

      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public java.util.List<com.google.protobuf.Any> getObjectsList() {
        if (objectsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(objects_);
        } else {
          return objectsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public int getObjectsCount() {
        if (objectsBuilder_ == null) {
          return objects_.size();
        } else {
          return objectsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public com.google.protobuf.Any getObjects(int index) {
        if (objectsBuilder_ == null) {
          return objects_.get(index);
        } else {
          return objectsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public Builder setObjects(
          int index, com.google.protobuf.Any value) {
        if (objectsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureObjectsIsMutable();
          objects_.set(index, value);
          onChanged();
        } else {
          objectsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public Builder setObjects(
          int index, com.google.protobuf.Any.Builder builderForValue) {
        if (objectsBuilder_ == null) {
          ensureObjectsIsMutable();
          objects_.set(index, builderForValue.build());
          onChanged();
        } else {
          objectsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public Builder addObjects(com.google.protobuf.Any value) {
        if (objectsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureObjectsIsMutable();
          objects_.add(value);
          onChanged();
        } else {
          objectsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public Builder addObjects(
          int index, com.google.protobuf.Any value) {
        if (objectsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureObjectsIsMutable();
          objects_.add(index, value);
          onChanged();
        } else {
          objectsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public Builder addObjects(
          com.google.protobuf.Any.Builder builderForValue) {
        if (objectsBuilder_ == null) {
          ensureObjectsIsMutable();
          objects_.add(builderForValue.build());
          onChanged();
        } else {
          objectsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public Builder addObjects(
          int index, com.google.protobuf.Any.Builder builderForValue) {
        if (objectsBuilder_ == null) {
          ensureObjectsIsMutable();
          objects_.add(index, builderForValue.build());
          onChanged();
        } else {
          objectsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public Builder addAllObjects(
          java.lang.Iterable<? extends com.google.protobuf.Any> values) {
        if (objectsBuilder_ == null) {
          ensureObjectsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, objects_);
          onChanged();
        } else {
          objectsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public Builder clearObjects() {
        if (objectsBuilder_ == null) {
          objects_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          objectsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public Builder removeObjects(int index) {
        if (objectsBuilder_ == null) {
          ensureObjectsIsMutable();
          objects_.remove(index);
          onChanged();
        } else {
          objectsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public com.google.protobuf.Any.Builder getObjectsBuilder(
          int index) {
        return getObjectsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public com.google.protobuf.AnyOrBuilder getObjectsOrBuilder(
          int index) {
        if (objectsBuilder_ == null) {
          return objects_.get(index);  } else {
          return objectsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
           getObjectsOrBuilderList() {
        if (objectsBuilder_ != null) {
          return objectsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(objects_);
        }
      }
      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public com.google.protobuf.Any.Builder addObjectsBuilder() {
        return getObjectsFieldBuilder().addBuilder(
            com.google.protobuf.Any.getDefaultInstance());
      }
      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public com.google.protobuf.Any.Builder addObjectsBuilder(
          int index) {
        return getObjectsFieldBuilder().addBuilder(
            index, com.google.protobuf.Any.getDefaultInstance());
      }
      /**
       * <pre>
       * Result objects, if any.
       * </pre>
       *
       * <code>repeated .google.protobuf.Any objects = 3;</code>
       */
      public java.util.List<com.google.protobuf.Any.Builder> 
           getObjectsBuilderList() {
        return getObjectsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
          getObjectsFieldBuilder() {
        if (objectsBuilder_ == null) {
          objectsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                  objects_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          objects_ = null;
        }
        return objectsBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TW.Proto.Result)
    }

    // @@protoc_insertion_point(class_scope:TW.Proto.Result)
    private static final com.wallet.crypto.trustapp.proto.Common.Result DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.wallet.crypto.trustapp.proto.Common.Result();
    }

    public static com.wallet.crypto.trustapp.proto.Common.Result getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Result>
        PARSER = new com.google.protobuf.AbstractParser<Result>() {
      @java.lang.Override
      public Result parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Result(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Result> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Result> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.wallet.crypto.trustapp.proto.Common.Result getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TW_Proto_Result_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TW_Proto_Result_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Common.proto\022\010TW.Proto\032\031google/protobu" +
      "f/any.proto\"O\n\006Result\022\017\n\007success\030\001 \001(\010\022\r" +
      "\n\005error\030\002 \001(\t\022%\n\007objects\030\003 \003(\0132\024.google." +
      "protobuf.AnyB\"\n com.wallet.crypto.trusta" +
      "pp.protob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_TW_Proto_Result_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TW_Proto_Result_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TW_Proto_Result_descriptor,
        new java.lang.String[] { "Success", "Error", "Objects", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
