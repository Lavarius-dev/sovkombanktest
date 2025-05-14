package ru.lavarius.dev.pushservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PushServiceImpl implements PushService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PushServiceImpl.class);

    @Override
    public void sendNotification() {
        LOGGER.info("push was sent");
    }
}
