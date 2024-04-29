package com.yichen.project.common;

/**
 * 返回工具类
 * todo 复习整理统一结果返回
 * @author yupi
 */
public class ResultUtils {

    /**
     * 成功
     *
     * @param data
     * @param <T>
     * @return
     */
    /*
    public static <T> BaseResponse<T> success(T data) {
            return new BaseResponse<>(0, data, "ok");
        }
    和
    public static <T> BaseResponse<?> success(T data) {
            return new BaseResponse<>(0, data, "ok");
        }
    有什么区别？

    返回类型：
    第一个方法使用了 <T> 作为返回类型参数，这意味着该方法返回的 BaseResponse 对象会持有与传递给方法的数据类型相对应的数据。
    第二个方法使用了 <?> 作为返回类型参数，这意味着该方法返回的 BaseResponse 对象可以持有任何类型的数据。这样的方法允许你调用 success 方法并且不关心返回的 BaseResponse 中具体的数据类型。
    调用方式：
    对于第一个方法，当你调用 success 方法并传递一个具体的数据类型作为参数时，编译器可以根据传递的数据类型推断出方法返回的 BaseResponse 中持有的数据类型。
    对于第二个方法，返回类型使用了通配符 <?>，因此无法通过调用方法时传递的数据类型来推断返回的 BaseResponse 中持有的数据类型。这意味着你在调用方法后需要显式地处理可能是任何类型的 BaseResponse 对象。
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }
    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static BaseResponse<?> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     *
     * @param code
     * @param message
     * @return
     */
    public static BaseResponse<?> error(int code, String message) {
        return new BaseResponse<>(code, null, message);
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static BaseResponse<?> error(ErrorCode errorCode, String message) {
        return new BaseResponse<>(errorCode.getCode(), null, message);
    }
}
