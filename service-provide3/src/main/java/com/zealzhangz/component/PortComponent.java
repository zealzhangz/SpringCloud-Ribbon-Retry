package com.zealzhangz.component;

import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Created by zhanga/tenderfacepalm@163.com.<br/>
 * @version Version: 1.0
 * @date DateTime: 2018/10/11 09:42:00<br/>
 */
@Component
public class PortComponent implements ApplicationListener<EmbeddedServletContainerInitializedEvent> {
    private Integer port;

    public Integer getPort() {
        return port;
    }

    @Override
    public void onApplicationEvent(final EmbeddedServletContainerInitializedEvent event) {
        this.port = event.getEmbeddedServletContainer().getPort();
    }
}
