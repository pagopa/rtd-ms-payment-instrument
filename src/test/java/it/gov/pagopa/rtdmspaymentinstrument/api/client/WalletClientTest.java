package it.gov.pagopa.rtdmspaymentinstrument.api.client;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.github.tomakehurst.wiremock.WireMockServer;
import it.gov.pagopa.rtdmspaymentinstrument.configuration.WireMockConfig;
import it.gov.pagopa.rtdmspaymentinstrument.dto.WalletInfoDto;
import it.gov.pagopa.rtdmspaymentinstrument.mapper.WalletInfoMapper;
import it.gov.pagopa.rtdmspaymentinstrument.model.WalletInfo;

@SpringBootTest
@ActiveProfiles("test")
@EnableConfigurationProperties
@ExtendWith(SpringExtension.class)
@Import(WireMockConfig.class)
class WalletClientTest {

  @Autowired
  private WireMockServer mockWalletApiService;

  @Autowired
  private WalletApiClient walletApiClient;

  @BeforeEach
  void setUp() throws IOException {
    WalletMocks.setupMockWalletResponse(mockWalletApiService);
  }

  @Test
  void whenPutWallet_thenTheCorrectWalletShouldBeUpdated() {

    WalletInfo walletInfo = new WalletInfo().builder()
        .idPaymentInstrument("testpaymentinstrumentid1").idWalletOld("testwalletidold1").build();

    WalletInfoDto walletInfoDto = WalletInfoMapper.toWalletInfoDto(walletInfo);
    assertTrue(
        walletApiClient.updateWallet(walletInfoDto, "testidmockwallet").contains("wallet updated"));
  }

}
