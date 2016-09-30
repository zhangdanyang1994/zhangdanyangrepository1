package com.ximatingshu.mydemo;

/**
 * Created by zhang on 2016/9/30.
 */
public class APIUtils {
    //网易电影票列表的接口
    public static String getList() {
        return "http://piao.163.com/m/movie/list.html?type=0&city=110000&apiVer=14&mobileType=android&deviceId=r4a5ba63afbabd7a70ceeaf8485f7942e&channel=wandoujia&ver=4.9";
    }

    //cateid=0 p=1  cateid=0&p=1
    //获取电影列表
    public static String postMovieList(){
        return "http://app.vmoiver.com/apiv3/post/getPostInCate?";
    }

    //下载文件的例子
    public static String fileUrl() {
        return "http://flv.bn.netease.com/videolib3/1601/13/RzAQP8148/HD/RzAQP8148-mobile.mp4";
    }

    public static String getPic(){
        return "http://pimg1.126.net/movie/product/movie/146847942056711068_148_197_webp.jpg";
    }

}
