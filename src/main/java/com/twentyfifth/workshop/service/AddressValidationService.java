package com.twentyfifth.workshop.service;

import com.twentyfifth.workshop.domain.Address;
import com.twentyfifth.workshop.domain.Invoice;
import com.twentyfifth.workshop.domain.Validity;
import org.springframework.stereotype.Service;

@Service
public class AddressValidationService {
    public Validity validate(Invoice invoice) {
        final Address address = invoice.getReceiverAddress();

        // @ToDo

        return Validity.UNKNOWN;
    }
}
