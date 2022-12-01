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
    internal_static_RegisterUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RegisterUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LoginUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LoginUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreditsUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreditsUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProductItems_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProductItems_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Category_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Category_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Cart_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Cart_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CartItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CartItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CartItems_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CartItems_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SearchField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SearchField_fieldAccessorTable;
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
      "\001(\t\"R\n\014RegisterUser\022\020\n\010username\030\001 \001(\t\022\020\n" +
      "\010password\030\002 \001(\t\022\016\n\006f_name\030\003 \001(\t\022\016\n\006l_nam" +
      "e\030\004 \001(\t\"/\n\tLoginUser\022\020\n\010username\030\001 \001(\t\022\020" +
      "\n\010password\030\002 \001(\t\"0\n\013CreditsUser\022\017\n\007credi" +
      "ts\030\001 \001(\005\022\020\n\010username\030\002 \001(\t\"\206\001\n\007Product\022\n" +
      "\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\017\n\007imgPath\030\003 \001(" +
      "\t\022\r\n\005price\030\004 \001(\005\022\023\n\013description\030\005 \001(\t\022\033\n" +
      "\010category\030\006 \001(\0132\t.Category\022\017\n\007inStock\030\007 " +
      "\001(\010\")\n\014ProductItems\022\031\n\007product\030\001 \003(\0132\010.P" +
      "roduct\"!\n\010Category\022\025\n\rcategory_name\030\001 \001(" +
      "\t\"3\n\004Cart\022\n\n\002id\030\001 \001(\005\022\020\n\010username\030\002 \001(\t\022" +
      "\r\n\005total\030\003 \001(\005\"9\n\010CartItem\022\n\n\002id\030\001 \001(\005\022\016" +
      "\n\006cartId\030\002 \001(\005\022\021\n\tproductId\030\003 \001(\005\")\n\tCar" +
      "tItems\022\034\n\tcartItems\030\001 \003(\0132\t.CartItem\"\035\n\013" +
      "SearchField\022\016\n\006search\030\001 \001(\t\"\006\n\004Void2\274\001\n\013" +
      "UserService\022\"\n\nCreateUser\022\r.RegisterUser" +
      "\032\005.User\022\037\n\nLoginUsers\022\n.LoginUser\032\005.User" +
      "\022\037\n\010FindUser\022\014.SearchField\032\005.User\022!\n\nAdd" +
      "Credits\022\014.CreditsUser\032\005.Void\022$\n\rRemoveCr" +
      "edits\022\014.CreditsUser\032\005.Void2\203\002\n\016ProductSe" +
      "rvice\022%\n\017RegisterProduct\022\010.Product\032\010.Pro" +
      "duct\022#\n\013GetProducts\022\005.Void\032\r.ProductItem" +
      "s\0226\n\027GetProductsInCartByUser\022\014.SearchFie" +
      "ld\032\r.ProductItems\022%\n\013FindProduct\022\014.Searc" +
      "hField\032\010.Product\022 \n\rUpdateProduct\022\010.Prod" +
      "uct\032\005.Void\022$\n\rDeleteProduct\022\014.SearchFiel" +
      "d\032\005.Void2\310\001\n\013CartService\022\034\n\014RegisterCart" +
      "\022\005.Cart\032\005.Void\022$\n\020RegisterCartItem\022\t.Car" +
      "tItem\032\005.Void\022\037\n\010FindCart\022\014.SearchField\032\005" +
      ".Cart\022*\n\016GetAllFromCart\022\014.SearchField\032\n." +
      "CartItems\022(\n\021DeleteAllFromCart\022\014.SearchF" +
      "ield\032\005.VoidB\033\n\027org.dataaccess.protobufP\001" +
      "b\006proto3"
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
    internal_static_RegisterUser_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RegisterUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RegisterUser_descriptor,
        new java.lang.String[] { "Username", "Password", "FName", "LName", });
    internal_static_LoginUser_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_LoginUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LoginUser_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_CreditsUser_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_CreditsUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreditsUser_descriptor,
        new java.lang.String[] { "Credits", "Username", });
    internal_static_Product_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Product_descriptor,
        new java.lang.String[] { "Id", "Name", "ImgPath", "Price", "Description", "Category", "InStock", });
    internal_static_ProductItems_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ProductItems_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProductItems_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_Category_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Category_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Category_descriptor,
        new java.lang.String[] { "CategoryName", });
    internal_static_Cart_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_Cart_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Cart_descriptor,
        new java.lang.String[] { "Id", "Username", "Total", });
    internal_static_CartItem_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_CartItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CartItem_descriptor,
        new java.lang.String[] { "Id", "CartId", "ProductId", });
    internal_static_CartItems_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_CartItems_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CartItems_descriptor,
        new java.lang.String[] { "CartItems", });
    internal_static_SearchField_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_SearchField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SearchField_descriptor,
        new java.lang.String[] { "Search", });
    internal_static_Void_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_Void_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Void_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
