package com.twentyfifth.workshop.service;

import com.twentyfifth.workshop.domain.Address;
import com.twentyfifth.workshop.domain.Invoice;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class InvoiceService {
    public List<Invoice> getInvoices() {
        List<Invoice> invoices = new ArrayList<>();

        Address address1 = new Address("Neubaugasse 36/2/19", "1070", "Wien", "Österreich");
        Address address2 = new Address("Neubaugasse 36/2/19", "$070", "Wien", "Österreich");
        Address address3 = new Address("Neubaugasse 36/2/19", "10700", "Wien", "Österreich");
        Address address4 = new Address("Lichtentaler Straße 7", "7653", "Baden-Baden", "Deutschland");
        Address address5 = new Address("Burgring 1", "1010", "Linz", "Österreich");
        Address address6 = new Address("", "", "", "");
        Address address7 = new Address("Lichtentaler Straße 7", "10437", "Berlin", "Deutschland");
        Address address8 = new Address("lichtentaler Straße 7", "76530", "Berlin", "XXXXXXX");

        // Correct one
        Invoice inv1 = new Invoice(LocalDate.of(2016,3,20), "ATU69919234", address1);
        // Bad VAT number: Too short
        // Bad address: Invalid zip code
        Invoice inv2 = new Invoice(LocalDate.of(2016,3,21), "ATU6991923", address2);
        // Bad VAT: U for AT missing
        // Bad address: Invalid address for austria
        Invoice inv3 = new Invoice(LocalDate.of(2016,3,20), "AT69919234", address3);
        // Another correct one
        Invoice inv4 = new Invoice(LocalDate.of(2016,3,20), "DE815220730", address4);
        // Details: VAT has illegal country code
        // Address zip code does not match city
        Invoice inv5 = new Invoice(LocalDate.of(2016,3,25), "XX1234567", address5);

        Invoice inv6 = new Invoice(LocalDate.of(2016,3,25), "XX1234567", address6);
        Invoice inv7 = new Invoice(LocalDate.of(2016,3,25), "XX1234567", address7);
        Invoice inv8 = new Invoice(LocalDate.of(2016,3,25), "XX1234567", address8);

        invoices.add(inv1);
        invoices.add(inv2);
        invoices.add(inv3);
        invoices.add(inv4);
        invoices.add(inv5);
        invoices.add(inv6);
        invoices.add(inv7);
        invoices.add(inv8);

        return invoices;
    }
}
