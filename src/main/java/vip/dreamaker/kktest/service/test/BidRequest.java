package vip.dreamaker.kktest.service.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>Copyright (C) 2017-2019 THL A29 Limited, a Qknode company. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at</p>
 *
 * <p>https://opensource.org/licenses/Apache-2.0</p>
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.</p>
 *
 * @Auther: chencheng@qknode.com
 * @Date: 2019/2/12 19:27
 * @Description:
 */
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BidRequest {

  /**
   * 必传。APP 包名
   */
  private String packName = "";
  /**
   * 必传。App 版本号
   */
  private String verCode = "";

  private String appName = "";
  /**
   * 必传。操作系统类型
   */
  private String os = "";
  /**
   * 必传。操作系统版本
   */
  private String osVersion = "";
  /**
   * 必传。运营商
   */
  private String carrier = "";
  /**
   * 必传。网络类型
   */
  private String conn = "";
  /**
   * 选传。客户端外网地址
   */
  private String ip = "";
  /**
   * 必传。手机品牌厂商
   */
  private String deviceVendor = "";
  /**
   * 必传。手机机型
   */
  private String deviceVersion = "";
  /**
   * 必传。
   */
  private String imei = "";
  /**
   * 必传。
   */
  private String idfa = "";
  /**
   * 必传。
   */
  private String androidId = "";
  /**
   * 必传。
   */
  private String mac = "";
  /**
   * 必传。
   */
  private String screenWidth = "";
  /**
   * 必传。
   */
  private String screenHeight = "";
  /**
   * 必传。纬度
   */
  private String lat = "";
  /**
   * 必传。经度
   */
  private String lon = "";
  /**
   * 必传。
   */
  private String deviceId = "";
  /**
   * 必传。
   */
  private String dpi = "";

  private String ua = "";

  /**
   * 请求的广告个数
   */
  private int limit = 2;

  /** 以下是 ssp 用来鉴权的字段 */
  /**
   * Md5(requestId+token)，鉴权字符串
   */
  private String auth = "";
  /**
   * platformId(共5位，不足5位前面补0) + posId(共7位，不足7位前面补0) + timeStamp(毫秒时间戳)
   */
  private String requestId = "";

  private String rt = "c"; //远程请求端类型， c： client s: server

  /**
   * 亿刻专用的渠道id，会透传到博润的点击和曝光上报链接
   */
  private String channelId;
}
