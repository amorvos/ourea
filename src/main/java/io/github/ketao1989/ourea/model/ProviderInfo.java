/*
* Copyright (c) 2015 ketao1989.github.com. All Rights Reserved.
*/
package io.github.ketao1989.ourea.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author tao.ke Date: 16/3/3 Time: 下午2:12
 */
public class ProviderInfo implements Serializable{

    private static final long serialVersionUID = 733316025823163238L;

    private String ip;
    private int port;
    private int weight;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
