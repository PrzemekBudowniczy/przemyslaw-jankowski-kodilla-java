package com.kodilla.good.patterns.challanges;

public class MailService implements InformationService {

//    public MailService() {
//        System.out.println("mail send");
//    }

    @Override
    public void inform(User user) {
        System.out.println("mail send");
    }
}
