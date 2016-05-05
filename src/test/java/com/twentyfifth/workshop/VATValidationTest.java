package com.twentyfifth.workshop;

import com.twentyfifth.workshop.domain.Address;
import com.twentyfifth.workshop.domain.Invoice;
import com.twentyfifth.workshop.domain.Validity;
import com.twentyfifth.workshop.service.VATValidationService;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class VATValidationTest {
    @Test
    public void testEmptyVAT_willReturnInvalid() throws Exception {
        // Arrange
        VATValidationService vatValidationService = new VATValidationService();
        Invoice invoice = new Invoice(LocalDate.of(2016,4,8), "", new Address("", "", "", ""));

        // Act
        Validity result = vatValidationService.validate(invoice);

        // Assert
        assertEquals(Validity.INVALID, result);
    }
}
