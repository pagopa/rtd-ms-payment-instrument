package it.gov.pagopa.rtdmspaymentinstrument.service;

import org.springframework.stereotype.Service;
import it.gov.pagopa.rtdmspaymentinstrument.model.MigrationPmEvent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PaymentManagerMigrationProcessor {

    public void processing(MigrationPmEvent message) {
        log.info(message.getIdWalletOld());
    }

}
