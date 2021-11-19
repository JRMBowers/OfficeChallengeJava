package officeChallenge;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


public class SendSMS {
    static final String ACCOUNT_SID = "Enter Sid";
    static final String AUTH_TOKEN = "Enter Token";

    public static void roomReadySendSms(String room){
        Twilio.init(ACCOUNT_SID,AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber("Receiver Phone Number"),
                new PhoneNumber("Sender Phone Number"),
                "Meeting room is now available: "+ room).create();
        System.out.println(message.getSid());
    }

}
