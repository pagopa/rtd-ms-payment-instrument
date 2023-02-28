package it.gov.pagopa.rtdmspaymentinstrument.mapper;

import it.gov.pagopa.rtdmspaymentinstrument.dto.WalletInfoDto;
import it.gov.pagopa.rtdmspaymentinstrument.model.WalletInfo;

public class WalletInfoMapper {

  private WalletInfoMapper(){
    
  }
  
  public static WalletInfoDto toWalletInfoDto(WalletInfo walletInfo) {
    return new WalletInfoDto(walletInfo.getIdWalletOld(),walletInfo.getIdPaymentInstrument());
  }
}
