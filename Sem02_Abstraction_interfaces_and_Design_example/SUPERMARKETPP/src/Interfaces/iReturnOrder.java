package Interfaces;

public interface iReturnOrder {
    /**
     * Вызывается пока isReturned не вернет false
     */
    void returnOrder();
    /**
     * Метод проверки возврата товара
     * @return true если необзодимо вернуть, иначе false
     */
    boolean isReturned();
}
