package vip.dreamaker.kktest.service.test;

import java.util.LinkedList;
import java.util.List;

public class KafkaTopicPartitionTest {

  public static void main(String[] args) {
    List<String> list = new LinkedList<>();
    list.add("msg-processor");
    list.add("msg-processor-new");
    list.add("qkdataConsumer");
    for (String topicName : list) {
      System.out.println("kafka topic:[" + topicName + "]\n\t offset at __consumer_offsets Partition:"
              + getPartition(topicName) + "\n");
    }
  }

  private static int getPartition(String topicName) {
    int hashCode = Math.abs(topicName.hashCode());
    return hashCode % 50;
  }

}
