package com.logger;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyFormatter extends Formatter {

    @Override
    //Formata a String que será gravada, no arqivo de texto
    public String format(LogRecord record) {
        return record.getLongThreadID()+"::"+record.getSourceClassName()+"::"
                +record.getSourceMethodName()+"::"
                +new Date(record.getMillis())+"::"
                +record.getMessage()+"::"+record.getLevel()+"\n";
    }

}