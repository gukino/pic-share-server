package hku.picshare.util;

/**
 *  hqj
 *  消息处理结果返回类
 */

public class ResponseMsg {

    Enum result;
    String failReason;

    public ResponseMsg(Enum result){
        this.result = result;
        this.failReason = "";
    }

    public ResponseMsg(Enum result, String reason){
        this.result = result;
        this.failReason = reason;
    }

}
