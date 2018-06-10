package com.baidu.filter;

import com.alibaba.dubbo.rpc.*;

public class TestFilter implements Filter {
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("filter");
        Result result = invoker.invoke(invocation);
        return result;
    }
}
