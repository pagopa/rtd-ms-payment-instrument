package it.gov.pagopa.rtdmspaymentinstrument;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RtdMsPaymentInstrumentApplication {

  public static void main(String[] args) {
    SpringApplication.run(RtdMsPaymentInstrumentApplication.class, args);
  }

}
  