package com.kodilla.good.patterns.food2Door;

public class MailService implements InformationService{

    @Override
    public void inform(User user) { System.out.println("Email send"); }
}
