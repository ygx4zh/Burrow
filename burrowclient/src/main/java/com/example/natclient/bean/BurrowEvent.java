package com.example.natclient.bean;

public class BurrowEvent {

    public String host;
    public int port;
    public String token;
    public long action;

    public interface ACTION{
        int REQUEST 		= 1;	 // 客户端请求NAT打洞
        int RESPONSE		= 2;	 // 客户端响应NAT打洞, 一个完整的打洞事件, 请求和响应只能有一个

        // 请求或响应后会拿到远程客户端的公网ip和准备开放的端口, 接下来就是通过udp第一次尝试连接;
        int CONNECT			= 3;	 // 根据获取到的远程ip和端口, 发送udp报文;

        // 两个打洞的客户端在发送UDP报文后, 本网段的端口向外开放;
        // 被叫会收到主叫的报文,主叫不会收到被叫的报文
        int RESP_CONNECT	= 4;	 // 响应打洞报文, 这个过程被叫应该建立起TCP的服务端程序等待主叫连接

        int BURROW_SUCCESS	= 5;	 // 打洞成功, 主叫发起连接被叫的tcp连接;
    }
}