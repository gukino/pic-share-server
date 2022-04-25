package hku.picshare.util;

import lombok.Data;

/**
 *  hqj
 *  消息处理结果返回类
 */

@Data
public class ResponseMsg {

    Result result;
    String failReason;

    public ResponseMsg(Result result){
        this.result = result;
        this.failReason = "";
    }

    public ResponseMsg(Result result, String reason){
        this.result = result;
        this.failReason = reason;
    }

}
