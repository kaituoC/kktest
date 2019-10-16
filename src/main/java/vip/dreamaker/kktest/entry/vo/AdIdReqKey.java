package vip.dreamaker.kktest.entry.vo;

import java.util.Map;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
 * @Date: 2019/2/13 18:20
 * @Description:
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AdIdReqKey {

  private String os;
  private String adId;
  private String code;
  private String name;
  private String reqKey;
  private String clazz;
  private int inview = Integer.MAX_VALUE;
  private int click = Integer.MAX_VALUE;
  private long startTs = Long.MIN_VALUE;
  private long endTs = Long.MAX_VALUE;
  private String cron;
  private double ecpq = 0;
  private boolean enable = true;
  /**
   * 地域黑名单
   */
  private Set<String> maskLoc;
  /**
   * 地域白名单
   */
  private Set<String> Loc;
  /**
   * 包名黑名单
   */
  private Set<String> maskPackageName;
  /**
   * 包名白名单
   */
  private Set<String> packageName;
  private boolean backup = false;
  private int viewType = 0; //0：正常曝光， 1：可以空曝光， 2：仅用于空曝光

  private String yikeVersion;
  private String yikeVersionLess;

  //用于亿刻端内分渠道配置广告位
  private Map<String, String> channel2AdId;

  //端内产品， 通过pageNo来优先选择分发广告位
  private Map<Integer, String> pageNo2AdId;

  private Map<Integer, String> popState2Adid;

  private String newer2AdId;

  public AdIdReqKey(String os, String adId, String code, String reqKey) {
    this.os = os;
    this.adId = adId;
    this.code = code;
    this.reqKey = reqKey;
  }

}
