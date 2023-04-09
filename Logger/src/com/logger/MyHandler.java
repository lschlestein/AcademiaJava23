package com.logger;

import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class MyHandler extends StreamHandler {

    @Override
    public void publish(LogRecord record) {
        //É possível alterar o log, antes de gravar/exibir a mensagem, isso deve ser feito aqui
        super.publish(record);
    }


    @Override
    public void flush() {
        super.flush();
    }


    @Override
    public void close() throws SecurityException {
        super.close();
    }

}