package vn.tiger.notification.dtos.messages;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import vn.tiger.notification.dtos.request.NotificationInput;

import java.util.Map;

@Data
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class SmsMessage extends NotificationInput {
    String label;
    String content;
}
