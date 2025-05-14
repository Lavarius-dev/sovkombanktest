package ru.lavarius.dev.smsservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl implements SmsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SmsServiceImpl.class);

    @Override
    public void sendNotification() {
        LOGGER.info("sms was sent");
    }
}
