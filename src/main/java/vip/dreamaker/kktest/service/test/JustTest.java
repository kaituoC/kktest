package vip.dreamaker.kktest.service.test;

import com.alibaba.fastjson.JSON;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

/**
 * @author kaituo
 * @date 2019-07-10 14:15:12
 */
public class JustTest {

  public static void main(String[] args) {
//    test1();
//    test2();
//    test3();
//    test4();
//    test5();
//    test6();
//    test7();
//    test8();
    test9();
  }

  private static void test9() {
    String ua = "a b c b d e f g yike";

    ua = ua.replace("yike", "").trim();

    System.out.println(ua);

  }

  private static void test8() {
    String str0 = "aa.bb,aa.cc,aa.dd,aaabb";
    String str1 = "aa.cc,aa.dd,aaabb";
    String str2 = "aa.bb";
    System.out.println("str0.contains=" + str0.contains(str2) + System.lineSeparator()
        + "str1.contains=" + str1.contains(str2));
  }

  private static void test7() {
    String MINIP_SEPARATOR = "\\^";
    String sourceStr = "http://minip.qknode.com^wx85b4efd610bf7ff4^wxecc87cf2df8bc908^gh_56ffb1119e2e^/?channel=yike_desktop_pop";
    String[] split = sourceStr.split(MINIP_SEPARATOR);
    System.out.println(split.length);

  }

  private static void test6() {
    System.out.println(
        "<!Doctype html><html><head><meta charset=\"utf-8\"><meta id=\"viewport\" name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no\"><meta name=\"msapplication-tap-highlight\" content=\"no\"><meta name=\"apple-mobile-web-app-capable\" content=\"yes\"><meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\"><title>endCard</title><style>*{margin:0;padding:0;box-sizing:border-box}html{width:100%;height:100%;font-size:18px}body{width:100%;height:100%;background-color:#fff}#container{position:relative;width:100%;height:100%}#imgWrapper{position:absolute;top:0;left:0;width:100%;height:50%;background-image:url(http://static1.pezy.cn/img/2019-08-12/1400118532967420778.jpg);background-repeat:no-repeat;background-size:contain;}#contentWrapper{position:absolute;top:50%;left:0;width:100%;height:50%;overflow:hidden}#contentMain{position:absolute;left:50%;top:50%;width:80%;-webkit-transform: translate(-50%, -50%);transform:translate(-50%,-50%)}#content{line-height:1.5}#btn{margin:40px 0 0;width:100%;height:36px;background-color:#2196f3;border-radius:5px;color:#fff;text-align:center;line-height:36px;font-weight:700;letter-spacing:.2em;vertical-align:middle}#btn>a{display:block;width:100%;height:100%;text-decoration:none;color:#fff}</style></head><body><a href=\"http://tools.download.pezy.cn/app/tools/download/306001\"><div id=\"container\"><div id=\"imgWrapper\"></div><div id=\"contentWrapper\"><div id=\"contentMain\"><div id=\"content\">闪电优化大师：10个手机9个烫，该给手机降降温了...</div><div id=\"btn\">立即下载</div></div></div></div></a><script>function t(t){return document.getElementById(t)}function e(t,e){var y,a,g=n.split(\":\"),h=window.innerWidth,c=window.innerHeight,x=Math.min(h,c),d=x===c;if(d?(a=x,y=a*(g[0]-0)/(g[1]-0)):(y=x,a=y*(g[1]-0)/(g[0]-0)),i.style.width=y+\"px\",i.style.height=a+\"px\",Math.max(h,c)>600&&(o.style.height=\"40px\",o.style.lineHeight=\"40px\"),d)s.style.left=y+\"px\",s.style.top=0,s.style.width=h-y+\"px\",s.style.height=c+\"px\",r.style.fontSize=\"inherit\",o.style.marginTop=\"\",18!==l&&(l=18,r.style.fontSize=l+\"px\"),.66*(h-y)>p*l?(r.style.letterSpacing=\".2em\",r.style.textAlign=\"center\"):(r.style.letterSpacing=\"\",r.style.textAlign=\"\");else{s.style.left=0,s.style.top=a+\"px\",s.style.width=h+\"px\",s.style.height=c-a+\"px\";var f=.8*h,m=Math.floor(f/15);16>m&&(m=16),m>20&&(m=20),l=m,r.style.fontSize=l+\"px\";var u=p*l;.8*f>u?(r.style.letterSpacing=\".2em\",r.style.textAlign=\"center\"):f>u?(r.style.letterSpacing=\"\",r.style.textAlign=\"center\"):(r.style.letterSpacing=\"\",r.style.textAlign=\"left\",200>=c-a&&(o.style.marginTop=\"30px\"))}setTimeout(function(){s.style.display=\"block\",s.style.transform=\"translate3d(0, 0, 10px)\",s.style.transition=\"transform 1s ease\"},16)}document.addEventListener(\"touchmove\",function(t){t.preventDefault(),t.stopPropagation()},!1);var n=\"1:1\",l=18,i=t(\"imgWrapper\"),s=t(\"contentWrapper\"),r=t(\"content\"),o=t(\"btn\"),p=function(t){for(var e=0,n=0;n<t.length;n++)e+=t.charCodeAt(n)<256?.5:1;return e}(r.innerHTML);e(),window.addEventListener(\"resize\",e,!1);</script></body></html>");
  }


  public static final String REDIRECT_URL_PREFIX = "http://ssp.qknode.com/hd/";
  public static final int REDIRECT_URL_PREFIX_LEN = REDIRECT_URL_PREFIX.length();

  private static void test5() {
    String url1 = "http://ssp.qknode.com/hd/010010000040";
    String url2 = "http://ssp.qknode.com/hd010010000040";
    String redirectId1 = "";
    if (url1.startsWith(REDIRECT_URL_PREFIX)) {
      redirectId1 = url1.substring(REDIRECT_URL_PREFIX_LEN);
    }
    System.out.println("url1 redirectId1=" + redirectId1);

    String redirectId2 = "";
    if (url2.startsWith(REDIRECT_URL_PREFIX)) {
      redirectId2 = url1.substring(REDIRECT_URL_PREFIX_LEN);
    }
    System.out.println("url2 redirectId2=" + redirectId2);
  }

  private static void test4() {
    List<String> list = new LinkedList<>();
    list.add("");
    list.add("");
//    list.add("*");
    List<String> list1 = list.stream().filter(StringUtils::isNotBlank)
        .collect(Collectors.toList());
    System.out.println("list==[" + String.join(",", list) + "]");
    System.out.println("list1==[" + String.join(",", list1) + "]");
  }

  private static void test3() {
    System.out.println(Long.MAX_VALUE + "|||" + Long.MIN_VALUE);
  }

  private static void test2() {
//    String tmp = " 10.240.0.1, 10.240.0.2 ,10.240.0.3 ,10.240.0.4, 10.240.0.5";
//    String[] split = tmp.split(",");
    String tmp = "完成这些任务的人，没有一个后悔的^做什么任务赚钱最多，亿刻官方总结清单，点击查看>>^不会赚钱？完成这些任务，赚走今天90%的钱>>^日赚50和日赚5万的区别，完成以下任务就知道了，点我>>";
    String[] split = tmp.split("\\^");
    List<String> list = new LinkedList<>();
    for (String s : split) {
      String trim = s.trim();
      list.add(trim);
    }
    System.out.println(JSON.toJSONString(list));
    System.out.println(String.join("^", list));
  }

  private static void test1() {
    List<String> ipList = new LinkedList<>();
    String mediaIpStr = "10.240.0.1,10.240.0.2,10.240.0.3,10.240.0.4,10.240.0.5";
    if (mediaIpStr.contains(",")) {
      String[] split = mediaIpStr.split(",");
      ipList.addAll(Arrays.asList(split));
    } else {
      ipList.add(mediaIpStr);
    }
    System.out.println(ipList);
    ipList.forEach(System.out::println);
  }

}
