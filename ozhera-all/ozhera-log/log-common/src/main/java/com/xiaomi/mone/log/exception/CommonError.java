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
package com.xiaomi.mone.log.exception;

/**
 * @author milog
 */

public enum CommonError {
    Success(0, "success"),

    UnknownError(1, "unknown error"),

    ParamsError(2, "parameter error"),

    NOT_EXISTS_DATA(3, "数据不存在"),

    SERVER_ERROR(4, "服务器异常"),

    UNAUTHORIZED(5, "没有操作权限");

    private int code;
    private String message;

    CommonError(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
