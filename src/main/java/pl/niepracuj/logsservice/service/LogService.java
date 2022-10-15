package pl.niepracuj.logsservice.service;

import pl.niepracuj.logsservice.model.Log;
import pl.niepracuj.logsservice.model.dto.LogDto;

import java.util.List;

public interface LogService {

    List<LogDto> getAllLogs();

    LogDto saveLog (LogDto logDto);
}
