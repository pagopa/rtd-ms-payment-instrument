package it.gov.pagopa.rtdmspaymentinstrument;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.context.TestPropertySource;
import it.gov.pagopa.rtdmspaymentinstrument.service.PaymentManagerMigrationProcessor;

@SpringBootTest
@EmbeddedKafka(topics = {"migration-pi"}, partitions = 1,
    bootstrapServersProperty = "spring.embedded.kafka.brokers")
@TestPropertySource(value = {"classpath:application-test.yml"}, inheritProperties = false)

class RtdMsPaymentInstrumentApplicationTests {

  @Autowired
  private PaymentManagerMigrationProcessor paymentManagerMigrationProcessor;

}
