package sharycar.catalogue.api;


import com.kumuluz.ee.configuration.cdi.ConfigBundle;
import com.kumuluz.ee.configuration.cdi.ConfigValue;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@ConfigBundle("rest-config")
public class CatalogueConfig {


    @ConfigValue(watch = true)
    private String paymentCurrency;
    @ConfigValue(watch = true)
    private Integer reservationValue;

    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }

    public Integer getReservationValue() {
        return reservationValue;
    }

    public void setReservationValue(Integer reservationValue) {
        this.reservationValue = reservationValue;
    }
}
