package pl.emcea.letsplaywebsite.controllers;

import java.util.List;

public class BasketItems {
    private List<BasketItem> basketItems;

    public BasketItems() {
    }

    public BasketItems(List<BasketItem> basketItems) {
        this.basketItems = basketItems;
    }

    public List<BasketItem> getBasketItems() {
        return basketItems;
    }

    public void setBasketItems(List<BasketItem> basketItems) {
        this.basketItems = basketItems;
    }
}
