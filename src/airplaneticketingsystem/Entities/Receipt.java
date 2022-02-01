/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplaneticketingsystem.Entities;

/**
 *
 * @author femitemiola
 */
public class Receipt {
    private final int receiptID;
    private final double AmountPaid;
    private final int bookingID;
    private final String passportID;

    public Receipt(int receiptID, double AmountPaid, int bookingID, String passportID) {
        this.receiptID = receiptID;
        this.AmountPaid = AmountPaid;
        this.bookingID = bookingID;
        this.passportID = passportID;
    }

    public String getPassportID() {
        return passportID;
    }

    public int getReceiptID() {
        return receiptID;
    }


    public double getAmountPaid() {
        return AmountPaid;
    }


    public int getBookingID() {
        return bookingID;
    }

    
}
