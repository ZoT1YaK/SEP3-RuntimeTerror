// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package org.dataaccess.protobuf;

public final class Protobuf {
  private Protobuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UsersExist_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UsersExist_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Void_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Void_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016protobuf.proto\"i\n\004User\022\020\n\010username\030\001 \001" +
      "(\t\022\020\n\010password\030\002 \001(\t\022\016\n\006f_name\030\003 \001(\t\022\016\n\006" +
      "l_name\030\004 \001(\t\022\017\n\007credits\030\005 \001(\005\022\014\n\004type\030\006 " +
      "\001(\t\"\"\n\nUsersExist\022\024\n\005users\030\001 \003(\0132\005.User\"" +
      "\006\n\004Void2I\n\013UserService\022\032\n\nCreateUser\022\005.U" +
      "ser\032\005.User\022\036\n\010GetUsers\022\005.Void\032\013.UsersExi" +
      "stB\033\n\027org.dataaccess.protobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_User_descriptor,
        new java.lang.String[] { "Username", "Password", "FName", "LName", "Credits", "Type", });
    internal_static_UsersExist_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_UsersExist_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UsersExist_descriptor,
        new java.lang.String[] { "Users", });
    internal_static_Void_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Void_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Void_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}