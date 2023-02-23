package it.gov.pagopa.rtdmspaymentinstrument.event;


import java.util.function.Consumer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;
import it.gov.pagopa.rtdmspaymentinstrument.model.MigrationPmEvent;
import it.gov.pagopa.rtdmspaymentinstrument.service.PaymentManagerMigrationProcessor;

/**
 * /** Component defining the processing steps in response to events in the projector queue.
 */

@Configuration
public class EventHandler {

  @Bean
  public Consumer<Message<MigrationPmEvent>> migrationPiConsumer(
      PaymentManagerMigrationProcessor paymentManagerMigrationProcessor) {
    return message -> paymentManagerMigrationProcessor.processing(message.getPayload());
  }
}
