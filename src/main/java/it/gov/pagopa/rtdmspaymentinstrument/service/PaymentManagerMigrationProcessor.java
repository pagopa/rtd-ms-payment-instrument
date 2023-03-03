package it.gov.pagopa.rtdmspaymentinstrument.service;

import it.gov.pagopa.rtdmspaymentinstrument.model.MigrationPmEvent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PaymentManagerMigrationProcessor implements PaymentManagerMigration{

  public void processing(MigrationPmEvent message) {
    log.info(message.getIdWalletOld());
  }

}
