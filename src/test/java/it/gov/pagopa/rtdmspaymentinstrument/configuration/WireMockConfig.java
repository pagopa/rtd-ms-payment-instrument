package it.gov.pagopa.rtdmspaymentinstrument.configuration;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import com.github.tomakehurst.wiremock.WireMockServer;


@TestConfiguration
@ActiveProfiles("test")
public class WireMockConfig {

  @Bean(initMethod = "start", destroyMethod = "stop")
  public WireMockServer mockWalletApiService() {
    return new WireMockServer(9561);
  }
}
