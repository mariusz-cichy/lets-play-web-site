package pl.emcea.letsplaywebsite.controllers;

import java.util.List;

public class BasketItem {
    private String name;
    private String pieces;
    private String error;

    public BasketItem() {
    }

    public BasketItem(String name, String pieces, String error) {
        this.name = name;
        this.pieces = pieces;
        this.error = error;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getPieces() {
        return pieces;
    }

    public void setPieces(String pieces) {
        this.pieces = pieces;
    }
}
