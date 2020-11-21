package com.example.lql.bean;

import com.example.lql.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "工装夹克", "口袋裤", "羽绒服", "羽绒服", "西服", "西裤","加绒外套", "工装羽绒服"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "工装夹克男士套装秋季2020新款韩版潮流帅气一套搭配秋冬加绒外套",
            "安踏口袋裤男士宽松2020秋冬新款男士工装运动裤潮流休闲宽松长裤",
            "秋冬季羽绒服男士轻薄鸭绒外套男装冬天装短款保暖连帽加厚上衣服",
            "男士棉衣羽绒服潮牌2020新款秋冬季冬装潮流帅气轻薄加厚工装外套",
            "西服休闲套装男修身潮流商务正装男士新郎伴郎结婚礼服西装三件套",
            "传奇保罗加绒加厚西裤男修身高弹力西装裤子男冬季商务男士休闲裤",
            "2020新款秋冬季男士加绒外套潮流男装秋装夹克中长款风衣加厚上衣",
            "xorr工装羽绒服男短款潮流潮牌帅气加厚情侣连帽男士青年冬季外套"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {99, 299, 124, 214, 868, 138,80,278};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.a1, R.drawable.a2, R.drawable.a3,
            R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.a1, R.drawable.a2, R.drawable.a3,
            R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}