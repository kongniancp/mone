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
package com.xiaomi.mone.log.manager.service.nacos;

import com.google.gson.Gson;

/**
 * @author wtt
 * @version 1.0
 * @description
 * @date 2021/7/16 15:25
 */
public interface DynamicConfigProvider<T> {

    Gson gson = new Gson();
    /**
     * 获取配置
     * @param appName
     * @return
     */
    T getConfig(String appName);
}
