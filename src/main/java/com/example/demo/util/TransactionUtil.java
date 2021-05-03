package com.example.demo.util;


import com.example.demo.domain.Transaction;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

public class TransactionUtil {

    public static Transaction createTransaction(HttpServletRequest request) {
        Transaction transaction = new Transaction();
        transaction.setTxDate(new Date());
        transaction.setTxHost(request.getRemoteHost());
        //transaction.setTxUserId(request.getUserPrincipal().getName()); TODO fix username instead of userId
        transaction.setTxUserId(0);
        return transaction;
    }
}
