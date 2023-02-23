package it.gov.pagopa.rtdmspaymentinstrument;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.context.TestPropertySource;
import it.gov.pagopa.rtdmspaymentinstrument.service.PaymentManagerMigrationProcessor;

@SpringBootTest
@EmbeddedKafka(topics = {"migration-pi"}, partitions = 1,
		bootstrapServersProperty = "spring.embedded.kafka.brokers")
@TestPropertySource(value = {"classpath:application-test.yml"}, inheritProperties = false)

class RtdMsPaymentInstrumentApplicationTests {

	@SpyBean
	private PaymentManagerMigrationProcessor paymentManagerMigrationProcessor;


}
