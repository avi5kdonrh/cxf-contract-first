package org.example;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;

import javax.xml.ws.Holder;

public class Proc implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        MessageContentsList mcl = (MessageContentsList)exchange.getIn().getBody();
        Holder h1 = (Holder) mcl.get(2);
        Holder h2 = (Holder) mcl.get(3);
        h1.value = "success";
        h2.value = true;

    }
}
