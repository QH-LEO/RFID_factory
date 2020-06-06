package com.example.demo.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * RFID 操作
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.17.1)",
    comments = "Source: rfid.proto")
public final class RFIDGrpc {

  private RFIDGrpc() {}

  public static final String SERVICE_NAME = "rfid.RFID";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<rfid.Rfid.ReadParam,
      rfid.Rfid.ReadReply> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Read",
      requestType = rfid.Rfid.ReadParam.class,
      responseType = rfid.Rfid.ReadReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<rfid.Rfid.ReadParam,
      rfid.Rfid.ReadReply> getReadMethod() {
    io.grpc.MethodDescriptor<rfid.Rfid.ReadParam, rfid.Rfid.ReadReply> getReadMethod;
    if ((getReadMethod = RFIDGrpc.getReadMethod) == null) {
      synchronized (RFIDGrpc.class) {
        if ((getReadMethod = RFIDGrpc.getReadMethod) == null) {
          RFIDGrpc.getReadMethod = getReadMethod = 
              io.grpc.MethodDescriptor.<rfid.Rfid.ReadParam, rfid.Rfid.ReadReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "rfid.RFID", "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rfid.Rfid.ReadParam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rfid.Rfid.ReadReply.getDefaultInstance()))
                  .setSchemaDescriptor(new RFIDMethodDescriptorSupplier("Read"))
                  .build();
          }
        }
     }
     return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rfid.Rfid.WriteParam,
      rfid.Rfid.WriteReply> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = rfid.Rfid.WriteParam.class,
      responseType = rfid.Rfid.WriteReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<rfid.Rfid.WriteParam,
      rfid.Rfid.WriteReply> getWriteMethod() {
    io.grpc.MethodDescriptor<rfid.Rfid.WriteParam, rfid.Rfid.WriteReply> getWriteMethod;
    if ((getWriteMethod = RFIDGrpc.getWriteMethod) == null) {
      synchronized (RFIDGrpc.class) {
        if ((getWriteMethod = RFIDGrpc.getWriteMethod) == null) {
          RFIDGrpc.getWriteMethod = getWriteMethod = 
              io.grpc.MethodDescriptor.<rfid.Rfid.WriteParam, rfid.Rfid.WriteReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "rfid.RFID", "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rfid.Rfid.WriteParam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rfid.Rfid.WriteReply.getDefaultInstance()))
                  .setSchemaDescriptor(new RFIDMethodDescriptorSupplier("Write"))
                  .build();
          }
        }
     }
     return getWriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rfid.Rfid.InitParam,
      rfid.Rfid.InitReply> getInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Init",
      requestType = rfid.Rfid.InitParam.class,
      responseType = rfid.Rfid.InitReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<rfid.Rfid.InitParam,
      rfid.Rfid.InitReply> getInitMethod() {
    io.grpc.MethodDescriptor<rfid.Rfid.InitParam, rfid.Rfid.InitReply> getInitMethod;
    if ((getInitMethod = RFIDGrpc.getInitMethod) == null) {
      synchronized (RFIDGrpc.class) {
        if ((getInitMethod = RFIDGrpc.getInitMethod) == null) {
          RFIDGrpc.getInitMethod = getInitMethod = 
              io.grpc.MethodDescriptor.<rfid.Rfid.InitParam, rfid.Rfid.InitReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "rfid.RFID", "Init"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rfid.Rfid.InitParam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rfid.Rfid.InitReply.getDefaultInstance()))
                  .setSchemaDescriptor(new RFIDMethodDescriptorSupplier("Init"))
                  .build();
          }
        }
     }
     return getInitMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RFIDStub newStub(io.grpc.Channel channel) {
    return new RFIDStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RFIDBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RFIDBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RFIDFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RFIDFutureStub(channel);
  }

  /**
   * <pre>
   * RFID 操作
   * </pre>
   */
  public static abstract class RFIDImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 读信息
     * 操作过程
     * 0. 发送开始请求体
     * 1. 开始带缓存的盘点
     * 2. 读取盘点信息(1s 一轮)
     * 3. 读5s ,然后开始挨个获取缓存中的 user区域信息 , 并把读到的信息返回
     * 4. 做 1s 的盘点 
     * 5. 读取 刚才没读到的 rfid上的 user区信息 , 并返回读到的信息
     * 6. 接收到停止请求体, 结束盘点循环
     * </pre>
     */
    public io.grpc.stub.StreamObserver<rfid.Rfid.ReadParam> read(
        io.grpc.stub.StreamObserver<rfid.Rfid.ReadReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getReadMethod(), responseObserver);
    }

    /**
     * <pre>
     * 写信息
     * 操作过程
     * 0. 发送写请求体
     * 1. 按列表循环绑定指定epc
     * 2. 写 5s 或着 写完所有要写的标签
     * 3. 返回写成功的标签信息
     * 4. 每 1s 返回一次, 失败的标签信息
     * 其它: 写完后自动锁定 4个区域
     * </pre>
     */
    public io.grpc.stub.StreamObserver<rfid.Rfid.WriteParam> write(
        io.grpc.stub.StreamObserver<rfid.Rfid.WriteReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getWriteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 初始化标签
     * 只有debug节点可以使用该功能
     * </pre>
     */
    public io.grpc.stub.StreamObserver<rfid.Rfid.InitParam> init(
        io.grpc.stub.StreamObserver<rfid.Rfid.InitReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getInitMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                rfid.Rfid.ReadParam,
                rfid.Rfid.ReadReply>(
                  this, METHODID_READ)))
          .addMethod(
            getWriteMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                rfid.Rfid.WriteParam,
                rfid.Rfid.WriteReply>(
                  this, METHODID_WRITE)))
          .addMethod(
            getInitMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                rfid.Rfid.InitParam,
                rfid.Rfid.InitReply>(
                  this, METHODID_INIT)))
          .build();
    }
  }

  /**
   * <pre>
   * RFID 操作
   * </pre>
   */
  public static final class RFIDStub extends io.grpc.stub.AbstractStub<RFIDStub> {
    private RFIDStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RFIDStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected RFIDStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RFIDStub(channel, callOptions);
    }

    /**
     * <pre>
     * 读信息
     * 操作过程
     * 0. 发送开始请求体
     * 1. 开始带缓存的盘点
     * 2. 读取盘点信息(1s 一轮)
     * 3. 读5s ,然后开始挨个获取缓存中的 user区域信息 , 并把读到的信息返回
     * 4. 做 1s 的盘点
     * 5. 读取 刚才没读到的 rfid上的 user区信息 , 并返回读到的信息
     * 6. 接收到停止请求体, 结束盘点循环
     * </pre>
     */
    public io.grpc.stub.StreamObserver<rfid.Rfid.ReadParam> read(
        io.grpc.stub.StreamObserver<rfid.Rfid.ReadReply> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * 写信息
     * 操作过程
     * 0. 发送写请求体
     * 1. 按列表循环绑定指定epc
     * 2. 写 5s 或着 写完所有要写的标签
     * 3. 返回写成功的标签信息
     * 4. 每 1s 返回一次, 失败的标签信息
     * 其它: 写完后自动锁定 4个区域
     * </pre>
     */
    public io.grpc.stub.StreamObserver<rfid.Rfid.WriteParam> write(
        io.grpc.stub.StreamObserver<rfid.Rfid.WriteReply> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * 初始化标签
     * 只有debug节点可以使用该功能
     * </pre>
     */
    public io.grpc.stub.StreamObserver<rfid.Rfid.InitParam> init(
        io.grpc.stub.StreamObserver<rfid.Rfid.InitReply> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getInitMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * RFID 操作
   * </pre>
   */
  public static final class RFIDBlockingStub extends io.grpc.stub.AbstractStub<RFIDBlockingStub> {
    private RFIDBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RFIDBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected RFIDBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RFIDBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * RFID 操作
   * </pre>
   */
  public static final class RFIDFutureStub extends io.grpc.stub.AbstractStub<RFIDFutureStub> {
    private RFIDFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RFIDFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected RFIDFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RFIDFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_READ = 0;
  private static final int METHODID_WRITE = 1;
  private static final int METHODID_INIT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RFIDImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RFIDImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.read(
              (io.grpc.stub.StreamObserver<rfid.Rfid.ReadReply>) responseObserver);
        case METHODID_WRITE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.write(
              (io.grpc.stub.StreamObserver<rfid.Rfid.WriteReply>) responseObserver);
        case METHODID_INIT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.init(
              (io.grpc.stub.StreamObserver<rfid.Rfid.InitReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RFIDBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RFIDBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return rfid.Rfid.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RFID");
    }
  }

  private static final class RFIDFileDescriptorSupplier
      extends RFIDBaseDescriptorSupplier {
    RFIDFileDescriptorSupplier() {}
  }

  private static final class RFIDMethodDescriptorSupplier
      extends RFIDBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RFIDMethodDescriptorSupplier(String methodName) {
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
      synchronized (RFIDGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RFIDFileDescriptorSupplier())
              .addMethod(getReadMethod())
              .addMethod(getWriteMethod())
              .addMethod(getInitMethod())
              .build();
        }
      }
    }
    return result;
  }
}
