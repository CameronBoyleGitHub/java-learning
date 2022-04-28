package com.company;

public class PC {
    private Case _case;
    private Monitor _monitor;
    private Motherboard _motherboard;

    public PC(Case _case, Monitor _monitor, Motherboard _motherboard) {
        this._case = _case;
        this._monitor = _monitor;
        this._motherboard = _motherboard;
    }

    public void powerUp() {
        _case.pressPowerButton();
        drawLogo();

    }

    private void drawLogo() {
        // Fancy Boot Screen here!
        _monitor.drawPixelAt(1200, 50, "yellow");
    }

    /*
    THESE ARE OBSOLETE NOW!

    private Case getCase() {
        return _case;
    }

    private Monitor getMonitor() {
        return _monitor;
    }

    private Motherboard getMotherboard() {
        return _motherboard;
    }
     */
}
