package it.gov.pagopa.rtdmspaymentinstrument.api.client;

import java.io.IOException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;


public class WalletMocks {

  public static void setupMockWalletResponse(WireMockServer mockService) throws IOException {
    mockService.stubFor(WireMock.put(WireMock.urlPathMatching("/update/.*"))
        .willReturn(WireMock.aResponse().withStatus(HttpStatus.OK.value())
            .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
            .withBody("wallet updated")));
  }

}
