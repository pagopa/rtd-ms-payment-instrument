package it.gov.pagopa.rtdmspaymentinstrument;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import it.gov.pagopa.rtdmspaymentinstrument.service.PaymentManagerMigrationProcessor;

@SpringBootTest
class RtdMsPaymentInstrumentApplicationTests {

	@SpyBean
	private PaymentManagerMigrationProcessor paymentManagerMigrationProcessor;

	@Test
	void contextLoads() {}

}
