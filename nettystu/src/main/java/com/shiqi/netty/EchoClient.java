/*
package com.shiqi.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.nio.channels.SocketChannel;

*/
/**
 * Created by
 *
 * @author=蓝十七
 * @on 2018-09-17-21:49
 *//*


public final class EchoClient {

    static final String HOST = System.getProperty("host", "127.0.0.1");
    static final int PORT = Integer.parseInt(System.getProperty("port", "8007"));
    static final int SIZE = Integer.parseInt(System.getProperty("size", "256"));
    */
/** 与server连接的channel *//*

    private static Channel channel;

    public static void main(String[] args) throws Exception {
        // Configure the client.
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group)
                    //不指定channelFactory,就需要指定channel,channel初始化时会指定默认的channelFactory。
                    .channel(NioSocketChannel.class)
                    //指定channelFactory,就不需要指定channel了。
                    //.channelFactory(new ReflectiveChannelFactory<Channel>(NioSocketChannel.class))
                    .option(ChannelOption.TCP_NODELAY, true)
                    //指定ChannelHandler
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        public void initChannel(SocketChannel ch) throws Exception {
                            ChannelPipeline p = ch.pipeline();
                            p.addLast(new EchoClientHandler());
                        }
                    });

            // Start the client.
            b.connect(HOST, PORT).addListener(new ChannelFutureListener() {
                @Override
                public void operationComplete(ChannelFuture future) throws Exception {
                    if( future.isSuccess() ){
                        channel=future.channel();
                    } else {
                    }
                }
            });
            while(true){
                if(channel!=null && channel.isActive()){
                    ByteBuf buff = channel.alloc().buffer(64);
                    buff.writeByte(1);
                    ChannelFuture channelFuture = channel.writeAndFlush(buff);
                    channelFuture.addListener(new ChannelFutureListener() {
                        // write操作完成后调用的回调函数
                        @Override
                        public void operationComplete(ChannelFuture future) throws Exception {
                            if(future.isSuccess()) { // 是否成功
                                System.out.println("客户端write操作成功");
                            } else {
                                System.out.println("客户端write操作失败");
                            }
                        }
                    });
                }else{
                    System.out.println("客户端已经断开连接");
                }
            }
        }  finally {
            group.shutdownGracefully();
        }
    }
}
*/
