// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gateway.proto

package com.alibaba.nacos.istio.model;

public final class GatewayOuterClass {
  private GatewayOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_Gateway_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_Gateway_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_Gateway_SelectorEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_Gateway_SelectorEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_Server_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_Server_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_Server_TLSOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_Server_TLSOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_Port_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_Port_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rgateway.proto\022\031istio.networking.v1alph" +
      "a3\"\262\001\n\007Gateway\0222\n\007servers\030\001 \003(\0132!.istio." +
      "networking.v1alpha3.Server\022B\n\010selector\030\002" +
      " \003(\01320.istio.networking.v1alpha3.Gateway" +
      ".SelectorEntry\032/\n\rSelectorEntry\022\013\n\003key\030\001" +
      " \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\310\006\n\006Server\022-\n\004po" +
      "rt\030\001 \001(\0132\037.istio.networking.v1alpha3.Por" +
      "t\022\014\n\004bind\030\004 \001(\t\022\r\n\005hosts\030\002 \003(\t\0229\n\003tls\030\003 " +
      "\001(\0132,.istio.networking.v1alpha3.Server.T" +
      "LSOptions\022\030\n\020default_endpoint\030\005 \001(\t\032\234\005\n\n" +
      "TLSOptions\022\026\n\016https_redirect\030\001 \001(\010\022B\n\004mo" +
      "de\030\002 \001(\01624.istio.networking.v1alpha3.Ser" +
      "ver.TLSOptions.TLSmode\022\032\n\022server_certifi" +
      "cate\030\003 \001(\t\022\023\n\013private_key\030\004 \001(\t\022\027\n\017ca_ce" +
      "rtificates\030\005 \001(\t\022\027\n\017credential_name\030\n \001(" +
      "\t\022\031\n\021subject_alt_names\030\006 \003(\t\022\037\n\027verify_c" +
      "ertificate_spki\030\013 \003(\t\022\037\n\027verify_certific" +
      "ate_hash\030\014 \003(\t\022V\n\024min_protocol_version\030\007" +
      " \001(\01628.istio.networking.v1alpha3.Server." +
      "TLSOptions.TLSProtocol\022V\n\024max_protocol_v" +
      "ersion\030\010 \001(\01628.istio.networking.v1alpha3" +
      ".Server.TLSOptions.TLSProtocol\022\025\n\rcipher" +
      "_suites\030\t \003(\t\"Z\n\007TLSmode\022\017\n\013PASSTHROUGH\020" +
      "\000\022\n\n\006SIMPLE\020\001\022\n\n\006MUTUAL\020\002\022\024\n\020AUTO_PASSTH" +
      "ROUGH\020\003\022\020\n\014ISTIO_MUTUAL\020\004\"O\n\013TLSProtocol" +
      "\022\014\n\010TLS_AUTO\020\000\022\013\n\007TLSV1_0\020\001\022\013\n\007TLSV1_1\020\002" +
      "\022\013\n\007TLSV1_2\020\003\022\013\n\007TLSV1_3\020\004\"6\n\004Port\022\016\n\006nu" +
      "mber\030\001 \001(\r\022\020\n\010protocol\030\002 \001(\t\022\014\n\004name\030\003 \001" +
      "(\tB!\n\035com.alibaba.nacos.istio.modelP\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_istio_networking_v1alpha3_Gateway_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_istio_networking_v1alpha3_Gateway_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_Gateway_descriptor,
        new java.lang.String[] { "Servers", "Selector", });
    internal_static_istio_networking_v1alpha3_Gateway_SelectorEntry_descriptor =
      internal_static_istio_networking_v1alpha3_Gateway_descriptor.getNestedTypes().get(0);
    internal_static_istio_networking_v1alpha3_Gateway_SelectorEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_Gateway_SelectorEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_istio_networking_v1alpha3_Server_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_istio_networking_v1alpha3_Server_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_Server_descriptor,
        new java.lang.String[] { "Port", "Bind", "Hosts", "Tls", "DefaultEndpoint", });
    internal_static_istio_networking_v1alpha3_Server_TLSOptions_descriptor =
      internal_static_istio_networking_v1alpha3_Server_descriptor.getNestedTypes().get(0);
    internal_static_istio_networking_v1alpha3_Server_TLSOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_Server_TLSOptions_descriptor,
        new java.lang.String[] { "HttpsRedirect", "Mode", "ServerCertificate", "PrivateKey", "CaCertificates", "CredentialName", "SubjectAltNames", "VerifyCertificateSpki", "VerifyCertificateHash", "MinProtocolVersion", "MaxProtocolVersion", "CipherSuites", });
    internal_static_istio_networking_v1alpha3_Port_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_istio_networking_v1alpha3_Port_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_Port_descriptor,
        new java.lang.String[] { "Number", "Protocol", "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
