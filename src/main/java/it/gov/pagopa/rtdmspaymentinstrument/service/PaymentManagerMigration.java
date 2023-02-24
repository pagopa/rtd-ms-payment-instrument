package it.gov.pagopa.rtdmspaymentinstrument.service;

import it.gov.pagopa.rtdmspaymentinstrument.model.MigrationPmEvent;

/**
 * Interface offering high-level abstractions for migration process.
 */
public interface PaymentManagerMigration {

  // Process input PM queue event
  public void processing(MigrationPmEvent migrationPmEvent);
  
}
