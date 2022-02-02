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
  

    public Receipt(int receiptID, double AmountPaid, int bookingID) {
        this.receiptID = receiptID;
        this.AmountPaid = AmountPaid;
        this.bookingID = bookingID;
      
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
