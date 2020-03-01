package vip.dreamaker.kktest.utils;

import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.AsyncHttpClientConfig;
import lombok.Getter;

public class HttpClient {

  private static final HttpClient instance = new HttpClient();
  private static int DEFAULT_MAX_CONNECTIONS_PER_HOST = 500;
  @Getter
  private AsyncHttpClient asyncHttpClient;

  private HttpClient() {
    AsyncHttpClientConfig httpClientConfig = new AsyncHttpClientConfig.Builder()
        .setConnectTimeout(500)
        .setPooledConnectionIdleTimeout(60000)
        .setMaxConnections(1000)
        .setCompressionEnforced(true)
        .setAllowPoolingConnections(true)
        .setRequestTimeout(1000)
        .setMaxConnectionsPerHost(DEFAULT_MAX_CONNECTIONS_PER_HOST)
        .build();
    this.asyncHttpClient = new AsyncHttpClient(httpClientConfig);
  }

  public static AsyncHttpClient getClient() {
    return instance.asyncHttpClient;
  }
}
