package com.medical.kafkaspringstreams.events;

import java.util.Date;

public record PageEvent(String user, String page, Date date,long duration) {
}
