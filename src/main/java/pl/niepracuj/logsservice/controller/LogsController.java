package pl.niepracuj.logsservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.niepracuj.logsservice.model.dto.LogDto;
import pl.niepracuj.logsservice.model.mapper.LogMapper;
import pl.niepracuj.logsservice.service.LogService;

import java.util.List;

@RestController
@RequestMapping("/logs")
@RequiredArgsConstructor
public class LogsController {


    private final LogService logService;

    @PostMapping("/save")
    public LogDto createLog(@RequestBody LogDto logDto) {
        return logService.saveLog(logDto);
    }


}
