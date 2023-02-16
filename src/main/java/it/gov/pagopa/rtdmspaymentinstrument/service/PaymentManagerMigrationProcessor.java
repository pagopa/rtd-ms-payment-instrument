package it.gov.pagopa.rtdmspaymentinstrument.service;

import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PaymentManagerMigrationProcessor {

    public void processing(String message) {
        log.info(message);
    }

}
