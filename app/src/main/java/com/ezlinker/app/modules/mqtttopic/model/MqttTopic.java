package com.ezlinker.app.modules.mqtttopic.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ezlinker.common.model.XEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * MQTT的TOPIC记录
 * </p>
 *
 * @author wangwenhai
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("ez_mqtt_topic")
public class MqttTopic extends XEntity {

    private static final long serialVersionUID=1L;

    /**
     * 是否允许连接: 0=拒绝1=允许
     */
    private Integer allow;

    /**
     * IP
     */
    private String ip;

    /**
     * MQTT用户名
     */
    private String username;

    /**
     * MQTT客户端ID
     */
    private String clientId;

    /**
     * 行为类型: 1=订阅2=发布3=订阅+发布
     */
    private Integer access;

    /**
     * 路由
     */
    private String topic;


}