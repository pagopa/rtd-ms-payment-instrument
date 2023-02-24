package it.gov.pagopa.rtdmspaymentinstrument.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import it.gov.pagopa.rtdmspaymentinstrument.service.PaymentManagerMigration;
import it.gov.pagopa.rtdmspaymentinstrument.service.PaymentManagerMigrationProcessor;

@Configuration
public class AppConfiguration {
    
  @Bean
  public PaymentManagerMigration gPaymentManagerMigration(){
    return new PaymentManagerMigrationProcessor();
  }
  
}
