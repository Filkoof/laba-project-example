package org.example.labaprojectimpl.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.labaprojectimpl.service.chain.ProcessChainPart;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Пример сервиса для лабораторного проекта.
 *
 * @author Your_Name
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class LabaService {

    private final List<ProcessChainPart> processChain;

    /**
     * Обработка полученных данных.
     *
     * @param data список данных для обработки
     */
    public void process(List<String> data) {
        log.debug("process() - start. size: {}", data.size());

        String result = "";
        for (var chainPart : processChain) {
            result = chainPart.process(result);
        }

        log.debug("process() - end");
    }
}
