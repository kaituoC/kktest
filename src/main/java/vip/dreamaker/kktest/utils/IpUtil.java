package vip.dreamaker.kktest.utils;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;

/**
 * @author kaituo
 * @date 2018-09-13
 */
public class IpUtil {

  public static String getIp(HttpServletRequest request) {
    String ip = request.getHeader("X-Real-IP");
    if (StringUtils.isNotBlank(ip)) {
      return ip;
    }
    ip = request.getRemoteHost();
    if (StringUtils.isNotBlank(ip)) {
      return ip;
    }
    return "";
  }
}
