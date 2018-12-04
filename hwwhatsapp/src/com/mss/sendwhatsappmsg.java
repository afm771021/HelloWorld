package com.mss;


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;


public class sendwhatsappmsg {

	public static final String ACCOUNT_SID = "AC0a7e6babeeb3219e58dbe20984887f00";
    public static final String AUTH_TOKEN = "ce2ab4e74b92d9f554056617a51158d4";
    
	public static void main(String[] args) {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
        		new com.twilio.type.PhoneNumber("whatsapp:+5215515104658"), 
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"), 
                
                "Your Yummy Cupcakes Company order of 1 dozen frosted cupcakes has shipped and should be delivered on July 10, 2019. Details: http://www.yummycupcakes.com/") 

            .create();

        System.out.println("confirmacion de mensaje whatsapp:" + message.getSid());

	}

}
