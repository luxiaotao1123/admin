package com.ccclubs.ts.order.services;


import com.t3.admin.model.dto.AjaxList;

import java.io.IOException;
import java.text.ParseException;


/**
 * 车联网服务接口
 * Created by luxiaotao on 2018/10/6
 */
public interface IovService {


    /**
     * 某坐标范围内车辆列表
     * tips: 国际坐标（WGS84）
     * @param longitude 经度【中心坐标】
     * @param latitude 纬度【中心坐标】
     * @param radius 范围半径【单位：米】
     * @param limit 最多取多少辆
     * @return the ajaxList 【AjaxList.data类型转换：List<CarNearbyEntity>】
     */
    AjaxList getNearbyCars(Double longitude, Double latitude, Integer radius, Integer limit) throws IOException;


    /**
     * 车辆状态数据获取
     * @param vin 车辆vin码
     * @return the ajaxList 【AjaxList.data类型转换：CarStateEntity】
     */
    AjaxList getRealTimeCarState(String vin) throws IOException;


    /**
     * 时间区间内行驶轨迹【区间不能大于一天】
     * @param vin 车辆vin码
     * @param startTime 开始时间(yyyy-MM-dd HH:mm:ss)
     * @param endTime 结束时间(yyyy-MM-dd HH:mm:ss)
     * @return the ajaxList 【AjaxList.data类型转换：CarTrackEntity】
     */
    AjaxList getHistoryTrackByTime(String vin, String startTime, String endTime) throws IOException, ParseException;

}
