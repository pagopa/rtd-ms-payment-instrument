package it.gov.pagopa.rtdmspaymentinstrument.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;


@Data
@Setter(value = AccessLevel.PACKAGE)
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
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
