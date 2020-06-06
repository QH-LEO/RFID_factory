package com.example.demo.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * 注册
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.17.1)",
    comments = "Source: rfid.proto")
public final class RFIDDispenserGrpc {

  private RFIDDispenserGrpc() {}

  public static final String SERVICE_NAME = "rfid.RFIDDispenser";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<rfid.Rfid.RegisterParam,
      rfid.Rfid.RegisterReply> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = rfid.Rfid.RegisterParam.class,
      responseType = rfid.Rfid.RegisterReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rfid.Rfid.RegisterParam,
      rfid.Rfid.RegisterReply> getRegisterMethod() {
    io.grpc.MethodDescriptor<rfid.Rfid.RegisterParam, rfid.Rfid.RegisterReply> getRegisterMethod;
    if ((getRegisterMethod = RFIDDispenserGrpc.getRegisterMethod) == null) {
      synchronized (RFIDDispenserGrpc.class) {
        if ((getRegisterMethod = RFIDDispenserGrpc.getRegisterMethod) == null) {
          RFIDDispenserGrpc.getRegisterMethod = getRegisterMethod = 
              io.grpc.MethodDescriptor.<rfid.Rfid.RegisterParam, rfid.Rfid.RegisterReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "rfid.RFIDDispenser", "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rfid.Rfid.RegisterParam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rfid.Rfid.RegisterReply.getDefaultInstance()))
                  .setSchemaDescriptor(new RFIDDispenserMethodDescriptorSupplier("Register"))
                  .build();
          }
        }
     }
     return getRegisterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RFIDDispenserStub newStub(io.grpc.Channel channel) {
    return new RFIDDispenserStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RFIDDispenserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RFIDDispenserBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RFIDDispenserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RFIDDispenserFutureStub(channel);
  }

  /**
   */
  public static abstract class RFIDDispenserImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 注册, RFID操作设备注册
     * </pre>
     */
    public void register(rfid.Rfid.RegisterParam request,
        io.grpc.stub.StreamObserver<rfid.Rfid.RegisterReply> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rfid.Rfid.RegisterParam,
                rfid.Rfid.RegisterReply>(
                  this, METHODID_REGISTER)))
          .build();
    }
  }

  /**
   */
  public static final class RFIDDispenserStub extends io.grpc.stub.AbstractStub<RFIDDispenserStub> {
    private RFIDDispenserStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RFIDDispenserStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected RFIDDispenserStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RFIDDispenserStub(channel, callOptions);
    }

    /**
     * <pre>
     * 注册, RFID操作设备注册
     * </pre>
     */
    public void register(rfid.Rfid.RegisterParam request,
        io.grpc.stub.StreamObserver<rfid.Rfid.RegisterReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RFIDDispenserBlockingStub extends io.grpc.stub.AbstractStub<RFIDDispenserBlockingStub> {
    private RFIDDispenserBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RFIDDispenserBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected RFIDDispenserBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RFIDDispenserBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 注册, RFID操作设备注册
     * </pre>
     */
    public rfid.Rfid.RegisterReply register(rfid.Rfid.RegisterParam request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RFIDDispenserFutureStub extends io.grpc.stub.AbstractStub<RFIDDispenserFutureStub> {
    private RFIDDispenserFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RFIDDispenserFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected RFIDDispenserFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RFIDDispenserFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 注册, RFID操作设备注册
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<rfid.Rfid.RegisterReply> register(
        rfid.Rfid.RegisterParam request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RFIDDispenserImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RFIDDispenserImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((rfid.Rfid.RegisterParam) request,
              (io.grpc.stub.StreamObserver<rfid.Rfid.RegisterReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RFIDDispenserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RFIDDispenserBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return rfid.Rfid.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RFIDDispenser");
    }
  }

  private static final class RFIDDispenserFileDescriptorSupplier
      extends RFIDDispenserBaseDescriptorSupplier {
    RFIDDispenserFileDescriptorSupplier() {}
  }

  private static final class RFIDDispenserMethodDescriptorSupplier
      extends RFIDDispenserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RFIDDispenserMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RFIDDispenserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RFIDDispenserFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
