package com.twentyfifth.workshop.domain;

import java.time.LocalDate;

public class Invoice {
    private String number;
    private LocalDate issuanceDate;
    private int termOfPayment = 14;
    private String VATnumber;
    private Address receiverAddress;

    private Validity validVAT;
    private Validity validAddress;

    private static int numberSerial = 1;

    /**
     * Poor man's sequence generator
     */
    private static synchronized int getNextInvoiceNumber() {
        return numberSerial++;
    }

    public Invoice(LocalDate issuanceDate, String VATnumber, Address receiverAddress) {
        this.receiverAddress = receiverAddress;
        number = String.valueOf(getNextInvoiceNumber());
        this.issuanceDate = issuanceDate;
        this.VATnumber = VATnumber;
    }

    public String getNumber() {
        return number;
    }

    public LocalDate getIssuanceDate() {
        return issuanceDate;
    }

    public int getTermOfPayment() {
        return termOfPayment;
    }

    public String getVATnumber() {
        return VATnumber;
    }

    public Validity getValidVAT() {
        return validVAT;
    }

    public void setValidVAT(Validity validVAT) {
        this.validVAT = validVAT;
    }

    public void setValidAddress(Validity validAddress) {
        this.validAddress = validAddress;
    }

    public Validity getValidAddress() {
        return validAddress;
    }

    public Address getReceiverAddress() {
        return receiverAddress;
    }
}
