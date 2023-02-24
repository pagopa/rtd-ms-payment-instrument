package it.gov.pagopa.rtdmspaymentinstrument.model;

import lombok.Data;

@Data
public class WalletInfo {

  /**
   * The Old Id wallet.
   */
  String idWalletOld;

  /**
   * The new Payment Instrument Id.
   */
  String idPaymentInstrument;

}
