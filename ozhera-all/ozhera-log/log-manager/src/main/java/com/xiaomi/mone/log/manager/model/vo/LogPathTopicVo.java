/*
 * Copyright 2020 Xiaomi
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.xiaomi.mone.log.manager.model.vo;

import com.xiaomi.mone.log.api.model.meta.MQConfig;
import lombok.Builder;
import lombok.Data;

/**
 * @author wtt
 * @version 1.0
 * @description
 * @date 2021/8/17 15:42
 */
@Data
@Builder
public class LogPathTopicVo {
    /**
     * 日志路径
     */
    private String logPath;
    /**
     * tailId
     */
    private Long tailId;

    private String source;
    /**
     * 解析脚本
     */
    private String parseScript;
    /**
     * 日志格式
     */
    private String valueList;
    /**
     * mq相关配置
     */
    private MQConfig mqConfig;
    /**
     * 服务别名
     */
    private String serveAlias;

    private String regionEn;

    private String regionCn;
}
