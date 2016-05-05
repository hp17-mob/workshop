package com.twentyfifth.workshop.controller;

import com.twentyfifth.workshop.domain.Invoice;
import com.twentyfifth.workshop.service.AddressValidationService;
import com.twentyfifth.workshop.service.InvoiceService;
import com.twentyfifth.workshop.service.VATValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class InvoiceValidationController {

    private InvoiceService invoiceService;
    private VATValidationService vatValidationService;
    private AddressValidationService addressValidationService;

    @Autowired
    public InvoiceValidationController(InvoiceService invoiceService, VATValidationService vatValidationService, AddressValidationService addressValidationService) {
        this.invoiceService = invoiceService;
        this.vatValidationService = vatValidationService;
        this.addressValidationService = addressValidationService;
    }

    @RequestMapping("/")
    public ModelAndView test(ModelMap model) {
        final List<Invoice> invoices = invoiceService.getInvoices();
        invoices.forEach(invoice -> invoice.setValidVAT(vatValidationService.validate(invoice)));
        invoices.forEach(invoice -> invoice.setValidAddress(addressValidationService.validate(invoice)));
        model.put("invoices", invoices);

        return new ModelAndView("home", model);
    }
}
