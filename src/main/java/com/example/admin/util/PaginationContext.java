package com.example.admin.util;

public class PaginationContext {
    // 定义threadLocal变量：pageNum和pageSize    // 通过Filter 赋值
    private static ThreadLocal<Integer> pageNum = new ThreadLocal<Integer>();    // 第几页
    private static ThreadLocal<Integer> pageSize = new ThreadLocal<Integer>();    // 每页记录条数     /*     * pageNum ：get、set、remove     */

    public static int getPageNum() {
        Integer pn = pageNum.get();
        if (pn == null) {
            return 1;
        }
        return pn;
    }

    public static void setPageNum(int pageNumValue) {
        pageNum.set(pageNumValue);
    }

    public static void removePageNum() {
        pageNum.remove();
    }     /*     * pageSize ：get、set、remove     */

    public static int getPageSize() {
        Integer ps = pageSize.get();
        if (ps == null) {
            return 1;
        }
        return ps;
    }

    public static void setPageSize(int pageSizeValue) {
        pageSize.set(pageSizeValue);
    }

    public static void removePageSize() {
        pageSize.remove();
    }


}
