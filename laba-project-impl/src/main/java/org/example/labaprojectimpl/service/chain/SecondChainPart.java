package org.example.labaprojectimpl.service.chain;

import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import static org.example.labaprojectimpl.service.chain.SecondChainPart.ORDER;

/**
 * Элемент цепочки для чтения данных.
 *
 * @author Your_Name
 */
@Component
@Order(ORDER)
@RequiredArgsConstructor
public class SecondChainPart implements ProcessChainPart {

    /**
     * Порядок выполнения.
     */
    protected static final int ORDER = 2;

    @Override
    public String process(String previous) {
        return "Second";
    }
}
