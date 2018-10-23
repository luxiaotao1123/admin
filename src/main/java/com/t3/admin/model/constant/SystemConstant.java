package com.t3.admin.model.constant;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by luxiaotao on 2018/10/23
 */
public class SystemConstant {

    public static String HOST_NAME;

    static {
        try {
            HOST_NAME = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            System.err.println("find hostname err");
        }
    }

}
