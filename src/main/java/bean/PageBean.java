package bean;

/**
 * Created by Administrator on 2017/9/4.
 */
public class PageBean implements BaseBean {

    private long currentPage;
    private long pageSize;
    private long totalElement;
    private long totalPage;
    private long offSet;

    public long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(long currentPage) {
        this.currentPage = currentPage;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalElement() {
        return totalElement;
    }

    public void setTotalElement(long totalElement) {
        this.totalElement = totalElement;
    }

    public long getTotalPage() {
        if(totalElement<=0||pageSize<=0){
            return -1;
        }
        if(totalElement%pageSize!=0l){
            this.totalPage= totalElement/pageSize+1l;
        }else{
            this.totalPage= totalElement/pageSize;
        }
        return totalPage;
    }

    public long getOffSet() {
        if(currentPage<=0||pageSize<=0){
            return -1;
        }
        this.offSet=(currentPage-1)*pageSize;
        return offSet;
    }
}
