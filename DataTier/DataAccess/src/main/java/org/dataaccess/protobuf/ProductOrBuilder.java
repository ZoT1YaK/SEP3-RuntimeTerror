// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package org.dataaccess.protobuf;

public interface ProductOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Product)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string imgPath = 3;</code>
   * @return The imgPath.
   */
  java.lang.String getImgPath();
  /**
   * <code>string imgPath = 3;</code>
   * @return The bytes for imgPath.
   */
  com.google.protobuf.ByteString
      getImgPathBytes();

  /**
   * <code>int32 price = 4;</code>
   * @return The price.
   */
  int getPrice();

  /**
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
