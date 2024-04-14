package org.example.labaprojectimpl.service.chain;

/**
 * Элемент цепочки обработки данных.
 *
 * @author Your_Name
 */
public interface ProcessChainPart {
    /**
     * Обработка данных.
     *
     * @param previous результаты работы предыдущего элемента цепочки
     * @return результаты обработки
     */
    String process(String previous);
}
