package com.baidu.merger;

import com.alibaba.dubbo.rpc.cluster.Merger;

public class TestMerger<String> implements Merger<String> {
    public String merge(String... strings) {
        String rsult = null;
        for (String s : strings) {
            if (s.equals("test")) {
                System.out.println("have a user2");
                return s;
            }
            rsult = s;
        }
        return rsult;
    }
}
