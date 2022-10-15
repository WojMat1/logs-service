package pl.niepracuj.logsservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.niepracuj.logsservice.model.dto.LogDto;
import pl.niepracuj.logsservice.model.mapper.LogMapper;
import pl.niepracuj.logsservice.repository.LogRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class LogServiceImpl implements LogService {

    private final LogRepository logRepository;
    private final LogMapper logMapper;
    @Override
    public List<LogDto> getAllLogs() {
        return logRepository.findAll().stream().map(logMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public LogDto saveLog(LogDto logDto) {
        return logMapper.toDto(logRepository.save(logMapper.toNewEntity(logDto)));
    }
}
