package com.aite.proxydesignpatterntest.proxy;

import com.aite.commonlib.ConsoleUtil;

public class RealSubject extends Subject {
    @Override
    public void request() {
        ConsoleUtil.out("真实的请求");
    }
}
