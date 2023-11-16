package com.example.demo.websocket;


import com.example.demo.websocket.WebSocketNettyServer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author二货
 * <pre>
 *     实现ApplicationListener<ContextRefreshedEvent>的onApplicationEvent方法
 * </pre>
 */
@Component
public class NettyStartListener implements ApplicationListener<ContextRefreshedEvent> {

    /**
     * 注入启动器
     */
    @Resource
    private WebSocketNettyServer webSocketNettyServer;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //判断event上下文中的父级是否为空
        if (event.getApplicationContext().getParent() == null) {
            try {
                //为空则调用start方法
                webSocketNettyServer.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


