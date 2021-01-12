package com.aite.proxydesignpatterntest.proxy;

import com.aite.commonlib.ConsoleUtil;

public class Proxy extends Subject {
    private RealSubject realSubject;
    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        ConsoleUtil.out("before");
        realSubject.request();
        ConsoleUtil.out("after");
    }
}
