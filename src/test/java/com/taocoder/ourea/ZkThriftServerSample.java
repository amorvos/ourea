/*
 * Copyright (c) 2015 taocoder.com. All Rights Reserved.
 */
package com.taocoder.ourea;

import java.util.Properties;

import com.taocoder.ourea.common.PropertiesUtils;
import com.taocoder.ourea.config.ThriftServerConfig;
import com.taocoder.ourea.config.ZkConfig;
import com.taocoder.ourea.provider.ServiceProviderFactory;

/**
 * @author tao.ke Date: 16/4/25 Time: 下午2:27
 */
public class ZkThriftServerSample {

    public static void main(String[] args) {

        System.out.println(Ourea.Processor.class.getCanonicalName());

        Properties properties = PropertiesUtils.load("provider.properties");

        ServiceProviderFactory.exposeService(new OureaImpl(), new ZkConfig(properties.getProperty("zkAddress")),
                new ThriftServerConfig(Integer.valueOf(properties.getProperty("port"))));

    }

}
