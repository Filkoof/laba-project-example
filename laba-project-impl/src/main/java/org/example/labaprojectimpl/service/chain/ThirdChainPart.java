package org.example.labaprojectimpl.service.chain;

import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import static org.example.labaprojectimpl.service.chain.ThirdChainPart.ORDER;

/**
 * Элемент цепочки для чтения данных.
 *
 * @author Your_Name
 */
@Component
@Order(ORDER)
@RequiredArgsConstructor
public class ThirdChainPart implements ProcessChainPart {

    /**
     * Порядок выполнения.
     */
    protected static final int ORDER = 3;

    @Override
    public String process(String previous) {
        return "Third";
    }
}
