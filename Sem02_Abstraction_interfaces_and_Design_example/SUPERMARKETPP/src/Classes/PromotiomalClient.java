package Classes;

/**
 * Добававления класс, описывающий акционного клиента.
 */

public class PromotiomalClient extends Actor {
    /**
     * Поле название акции
     */
    private String promoName;
    /**
     * id клиента
     */
    private int idClient = 0;
    /**
     * количество участников в акции
     */
    private static int countPromoClient = 5;

    /**
     * 
     * @param name      - Имя участника
     * @param promoName - Поле название акции
     * @param idClient  - id клиента
     */
    public PromotiomalClient(String name, String promoName, int idClient) {
        super(name);
        this.promoName = promoName;
        this.idClient = idClient;
        if (idClient > countPromoClient) {
            System.out.printf("Too many clients in this action");
        }
    }

    /**
     * @return имя акции
     */
    public String getPromoName() {
        return promoName;
    }

    /**
     * @return id клиента
     */
    public int getIdClient() {
        return idClient;
    }

    public boolean isTakeOrder() {
        return super.isMakeOrder;

    }

    public void setTakeOrder(boolean take) {
        super.isTakeOrder = take;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setMakeOrder(boolean make) {
        super.isMakeOrder = make;
    }

    public Actor getActor() {
        return this;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public String toString() {
        return "Promo Client" + idClient + "Name" + super.name + "promoName" + promoName + "isTakeOrder = "
                + isTakeOrder + "isMaleOrder = " + isMakeOrder;

    }
}
