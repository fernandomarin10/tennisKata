package com.sergiotrapiello.cursotesting;


public class KataTennis {
    private int playerPoint;
    private int serverPoint;
    private boolean serverIsWinner;
    private boolean playerIsWinner;


    public KataTennis() {
        this.serverPoint = 0;
        this.playerPoint = 0;

        this.serverIsWinner = false;
        this.playerIsWinner = false;

    }

    public void serverMakePoint(){
        if(this.getServerPoint() >= 30){
            this.setServerPoint(this.getServerPoint() + 10);
        }else{
            this.setServerPoint(this.getServerPoint() + 15);
        }

        if(this.getServerPoint()  == 50) this.serverIsWinner = true;
    }

    public void playerMakePoint(){
        if(this.getPlayerPoint() >= 30){
            this.setPlayerPoint(this.getPlayerPoint() + 10);
        }else{
            this.setPlayerPoint(this.getPlayerPoint() + 15);
        }

        if(this.getPlayerPoint()  == 50) this.playerIsWinner = true;
    }

    public String getGameStatus(){
        String serverPointConverted = this.getServerPoint() == 50 ? "40" : Integer.toString(this.getServerPoint());
        String playerPointConverted = this.getPlayerPoint() == 50 ? "40" : Integer.toString(this.getPlayerPoint());

        return "Game is " + serverPointConverted + ":" + playerPointConverted;
    }


    public int getServerPoint() {
        return serverPoint;
    }

    public void setServerPoint(int serverPoint) {
        this.serverPoint = serverPoint;
    }

    public int getPlayerPoint() {
        return playerPoint;
    }

    public void setPlayerPoint(int playerPoint) {
        this.playerPoint = playerPoint;
    }

    public boolean isServerIsWinner() {
        return serverIsWinner;
    }

    public void setServerIsWinner(boolean serverIsWinner) {
        this.serverIsWinner = serverIsWinner;
    }

    public boolean isPlayerIsWinner() {
        return playerIsWinner;
    }

    public void setPlayerIsWinner(boolean playerIsWinner) {
        this.playerIsWinner = playerIsWinner;
    }
}
