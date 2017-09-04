package bean;

import config.CodeProperties;

/**
 * Created by Administrator on 2017/9/4.
 */
public class ResultBean<T> implements BaseBean {
    private  String requestId;
    private String code;
    private String msg;
    private PageBean page;
    private T data;
    private String throwable;
    public ResultBean() {
    }
    public ResultBean(String requestId) {
        this(requestId,null);
    }
    public ResultBean(String requestId,String code) {
        this(requestId,code, CodeProperties.getInstance().getValue(code));
    }
    public ResultBean(String requestId,String code,String msg) {
       this(requestId,code,msg,null);
    }
    public ResultBean(String requestId,String code,String msg,T data) {
        this(requestId,code,msg,data,null);
    }
    public ResultBean(String requestId,String code,String msg,T data,String throwable) {
       this.requestId=requestId;
        this.code=code;
        if(msg==null){
            this.msg=msg;
        }else{
            this.msg=CodeProperties.getInstance().getValue(code);
        }

        this.data=data;
        this.throwable=throwable;
    }
    public ResultBean(String requestId,PageBean page,String code,String msg,T data) {
        this.requestId=requestId;
        this.page=page;
        this.code=code;
        this.msg=msg;
        this.data=data;
    }
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getThrowable() {
        return throwable;
    }

    public void setThrowable(String throwable) {
        this.throwable = throwable;
    }
}
