package com.aite.proxydesignpatterntest.proxy;

import org.junit.Test;

public class Main {
    @Test
    public void requestTest() {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
