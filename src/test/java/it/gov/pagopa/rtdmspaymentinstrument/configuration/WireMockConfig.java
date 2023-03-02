package it.gov.pagopa.rtdmspaymentinstrument.configuration;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import com.github.tomakehurst.wiremock.WireMockServer;


@TestConfiguration
@EnableFeignClients
public class WireMockConfig {

  @Bean(initMethod = "start", destroyMethod = "stop")
  public WireMockServer mockWalletApiService() {
    return new WireMockServer(9561);
  }
}
