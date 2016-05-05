package com.twentyfifth.workshop.service;

import com.twentyfifth.workshop.domain.Invoice;
import com.twentyfifth.workshop.domain.Validity;
import org.springframework.stereotype.Service;

@Service
public class VATValidationService {
    public Validity validate(Invoice invoice) {
        String vat = invoice.getVATnumber();

        // @ToDo

        return Validity.UNKNOWN;
    }
}
