package pl.niepracuj.logsservice.model.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.niepracuj.logsservice.model.Log;
import pl.niepracuj.logsservice.model.dto.LogDto;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class LogMapper {

    public LogDto toDto(Log log) {
        return LogDto.builder()
                .id(log.getId())
                .loggedOn(log.getLoggedOn())
                .message(log.getMessage())
                .build();
    }

    public Log toNewEntity(LogDto logDto) {
        return Log.builder()
                .loggedOn(logDto.getLoggedOn())
                .message(logDto.getMessage())
                .build();
    }
}
