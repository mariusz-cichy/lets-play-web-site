package pl.emcea.letsplaywebsite.controllers;

import java.util.List;

public class BasketItem {
    private String name;
    private String pieces;

    public BasketItem() {
    }

    public BasketItem(String name, String pieces) {
        this.name = name;
        this.pieces = pieces;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPieces() {
        return pieces;
    }

    public void setPieces(String pieces) {
        this.pieces = pieces;
    }
}
