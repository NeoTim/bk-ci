package com.tencent.devops.dispatch.exception

import com.tencent.devops.common.api.pojo.ErrorType

enum class ErrorCodeEnum(
    val errorType: ErrorType,
    val errorCode: Int,
    val formatErrorMessage: String
) {
    SYSTEM_ERROR(ErrorType.SYSTEM, 2128001, "Dispatcher系统错误"),
    START_VM_FAIL(ErrorType.SYSTEM, 2128002, "Fail to start up after 3 retries"),
    VM_STATUS_ERROR(ErrorType.USER, 2128003, "第三方构建机状态异常/Bad build agent status"),
    GET_BUILD_AGENT_ERROR(ErrorType.SYSTEM, 2128004, "获取第三方构建机失败/Fail to get build agent"),
    FOUND_AGENT_ERROR(ErrorType.USER, 2128005, "获取第三方构建机失败/Can not found agent by type"),
    LOAD_BUILD_AGENT_FAIL(ErrorType.USER, 2128006, "获取第三方构建机失败/Load build agent fail"),
    VM_NODE_NULL(ErrorType.USER, 2128007, "第三方构建机环境的节点为空"),
    GET_VM_ENV_ERROR(ErrorType.USER, 2128008, "获取第三方构建机环境失败"),
    GET_VM_ERROR(ErrorType.USER, 2128009, "获取第三方构建机失败"),
    JOB_QUOTA_EXCESS(ErrorType.USER, 2128010, "JOB配额超限")
}
