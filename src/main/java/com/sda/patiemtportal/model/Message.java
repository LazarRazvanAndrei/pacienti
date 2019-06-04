package com.sda.patiemtportal.model;

import java.util.Date;

public class Message {
    private Long id;
    private String question;
    private String answer;
    private Doctor receiver;
    private Patient sender;
    private Date sentDate;
}
