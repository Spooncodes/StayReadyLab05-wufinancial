package com.codedifferently.stayready;

public class WuFinancial {

    public double USDtoEUR(double curr) {
        return curr * (0.88 / 1.00);
    }

    public double EURtoUSD(double curr) {
        return curr * (1.13 / 1.00);
    }

    public double EURtoGBP(double curr) {
        return curr * (0.89 / 1.00);
    }

    public double GBPtoINR(double curr) {
        return curr * (95.02 / 1.00);
    }

    public double INRtoCAD(double curr) {
        return curr * (0.018 / 1.00);
    }

    public double CADtoSGD(double curr) {
        return curr * (1.02 / 1.00);
    }

    public double SGDtoCHF(double curr) {
        return curr * (0.68 / 1.00);
    }

    public double CHFtoMYR(double curr) {
        return curr * (4.53 / 1.00);
    }

    public double MYRtoJPY(double curr) {
        return curr * (25.06 / 1.00);
    }

    public double JPYtoCNY(double curr) {
        return curr * (0.065 / 1.00);
    }
}
