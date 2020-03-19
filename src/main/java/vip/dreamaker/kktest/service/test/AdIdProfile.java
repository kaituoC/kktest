package vip.dreamaker.kktest.service.test;

import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

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
 * @Date: 2019/10/8 17:09
 * @Description:
 */
@Data
@NoArgsConstructor
public class AdIdProfile {

  private String code;
  private String adid;
  private float cpc;
  private float ecpm;
  private int inview;
  private int view;
  private int click;
  private int inviewDsp;
  private int clickDsp;
  private float ctr;
  private float cost;
  private Date dt;
  private String reqkey;
  private String appName;
  private String adname;
  private float cpcB;
  private float ecpmB;
  private float ctrB;
  private Date updateTs;
  private Date opTs;

  public AdIdProfile(String code, String adid, float cpc, float ecpm, int inview, int view,
      int click,
      int inviewDsp, int clickDsp, float cost, long dt, String reqkey, String appName,
      String adname, long update) {
    this.code = code;
    this.adid = adid;
    this.cpc = cpc;
    this.ecpm = ecpm;
    this.inview = inview;
    this.view = view;
    this.click = click;
    this.inviewDsp = inviewDsp;
    this.clickDsp = clickDsp;
    this.cost = cost;
    this.dt = new Date(dt);
    this.reqkey = reqkey;
    this.appName = appName;
    this.adname = adname;
    this.ecpmB = inview > inviewDsp ? (cost * 1000 / inview) : ecpm;
    if (this.ecpmB > ecpm) {
      this.ecpmB = ecpm;
    }
    this.cpcB = click > 1 ? (cost / click) : 0;
    this.cpc = clickDsp > 1 ? (cost / clickDsp) : 0;
    this.updateTs = new Date(update);
    this.ctr = (float) clickDsp / (inviewDsp + 1);
    this.ctrB = (float) click / (inview + 1);
    this.opTs = new Date();
  }
}
