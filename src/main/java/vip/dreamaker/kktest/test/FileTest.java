package vip.dreamaker.kktest.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;

/**
 * @author changkaituo
 * @date 2020/1/11 11:23
 */
public class FileTest {

  private static final String FILE_HEAD = "id | 图片预览 | 图片 | 视频" + System.lineSeparator()
      + "---|---|---|---";
  private static final String LINE_FORMAT = "%s | ![图片预览](%s) | [%s](%s) | [%s](%s)";
  private static final String IN_PATH = "E:\\material\\in\\";
  private static final String OUT_PATH = "E:\\material\\out\\";

  private static String buildLine(int id, String imgUrl, String videoUrl) {
    return String.format(LINE_FORMAT, id, imgUrl, imgUrl, imgUrl, videoUrl, videoUrl);
  }

  public static void main(String[] args) throws IOException {
    String fileName = "data1.json";
    String fileOutPath = OUT_PATH + fileName;
    File fileOut = new File(fileOutPath);
    if (fileOut.exists()) {
      System.out.println("file exit:" + fileOut.getAbsolutePath());
      System.exit(1);
    }
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOut));

    File fileIn = new File(IN_PATH + fileName);
    BufferedReader bufferedReader = new BufferedReader(new FileReader(fileIn));

    String line;
    int id = 0;
    try {
      bufferedWriter.write(FILE_HEAD);
      while ((line = bufferedReader.readLine()) != null) {
        try {
          JSONObject jo = JSON.parseObject(line);
          JSONArray data = jo.getJSONObject("result").getJSONArray("data");
          for (int i = 0; i < data.size(); i++) {
            JSONObject node = data.getJSONObject(i);
            String img = node.getString("url_img");
            String video = node.getString("url");
            if (StringUtils.isNoneBlank(img,video)) {
              id++;
              String outLine = buildLine(id, img, video);
              bufferedWriter.newLine();
              bufferedWriter.write(outLine);
            } else {
              System.out.println("not complete data:" + node.toJSONString());
            }
          }
        } catch (Exception e) {
          System.out.println("error line:" + line);
          e.printStackTrace();
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        bufferedReader.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
      try {
        bufferedWriter.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    System.out.println("over!!!!");
  }
}
