package com.tinckay.common.core;

/**
 * 响应码枚举，参考HTTP状态码的语义
 */
public enum ResultEnum {

    SUCCESS(200,"SUCCESS"),//成功
    CREATED(201,"CREATED"), //创建
    ACCEPTED(202,"ACCEPTED"), //非权威信息
    FAIL(400,"FAIL"),//失败
    UNAUTHORIZED(401,"没有访问权限"),//未经授权（签名错误）没有访问权限
    PAYMENT_REQUIRED(402,"需要付款"), //需要付款
    FORBIDDEN(403,"被禁止"), //被禁止
    NOT_FOUND(404,"接口不存在"),//接口不存在
    INTERNAL_SERVER_ERROR(500,"服务器内部异常"),//服务器内部错误

    UNKNOWN_ACCOUNT(1000,"未知账户"), //UnknownAccountException 未知账户
    LOCKED_ACCOUNT(1001,"账户被锁定"),  //LockedAccountException 账户被锁定
    DISABLED_ACCOUNT(1002,"用户被禁止"),  //用户禁用 DisabledAccountException
    EXPIRED_CREDENTIALS(1003,"过期凭证"), //过期凭证
    INCORRECT_CREDENTIALS(1004,"错误凭证");  //错误的凭据

    private final int code;
    private final String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }
}
